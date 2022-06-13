# Class for setting up /etc in overlayfs
#
# In order to have /etc directory in overlayfs a special handling at early boot stage is required
# The idea is to supply a custom init script that mounts /etc before launching actual init program,
# because the latter already requires /etc to be mounted
#
# The configuration must be machine specific. You should at least set these three variables:
#   BITSY_OVERLAYFS_MOUNT_POINT ?= "/data"
#   BITSY_OVERLAYFS_FSTYPE ?= "ext4"
#   BITSY_OVERLAYFS_DEVICE ?= "/dev/mmcblk0p2"
#
# To control more mount options you should consider setting mount options:
#   BITSY_OVERLAYFS_MOUNT_OPTIONS ?= "defaults"
#
# The class provides two options for /sbin/init generation
# 1. Default option is to rename original /sbin/init to /sbin/init.orig and place generated init under
#    original name, i.e. /sbin/init. It has an advantage that you won't need to change any kernel
#    parameters in order to make it work, but it poses a restriction that package-management can't
#    be used, becaause updating init manager would remove generated script
# 2. If you are would like to keep original init as is, you can set
#    BITSY_OVERLAYFS_USE_ORIG_INIT_NAME = "0"
#    Then generated init will be named /sbin/preinit and you would need to extend you kernel parameters
#    manually in your bootloader configuration.
#
# Regardless which mode you choose, update and migration strategy of configuration files under /etc
# overlay is out of scope of this class

REQUIRED_DISTRO_FEATURES += "bitsy-overlayfs"

ROOTFS_POSTPROCESS_COMMAND += '${@bb.utils.contains("DISTRO_FEATURES", "bitsy-overlayfs", "create_bitsy_overlayfs_preinit;", "", d)}'
IMAGE_FEATURES_CONFLICTS_bitsy-overlayfs = "${@ 'package-management' if bb.utils.to_boolean(d.getVar('BITSY_OVERLAYFS_USE_ORIG_INIT_NAME'), True) else ''} overlayfs-etc"
DISTRO_FEATURES_CONFLICTS_bitsy-overlays = "overlayfs"

BITSY_OVERLAYFS_MOUNT_POINT ??= ""
BITSY_OVERLAYFS_FSTYPE ??= ""
BITSY_OVERLAYFS_DEVICE ??= ""
BITSY_OVERLAYFS_USE_ORIG_INIT_NAME ??= "1"
BITSY_OVERLAYFS_MOUNT_OPTIONS ??= "defaults"
BITSY_OVERLAYFS_INIT_TEMPLATE ??= "${COREBASE}/meta/files/overlayfs-etc-preinit.sh.in"

python create_bitsy_overlayfs_preinit() {
    overlayEtcMountPoint = d.getVar("BITSY_OVERLAYFS_MOUNT_POINT")
    overlayEtcFsType = d.getVar("BITSY_OVERLAYFS_FSTYPE")
    overlayEtcDevice = d.getVar("BITSY_OVERLAYFS_DEVICE")

    if not overlayEtcMountPoint:
        bb.fatal("BITSY_OVERLAYFS_MOUNT_POINT must be set in your MACHINE configuration")
    if not overlayEtcDevice:
        bb.fatal("BITSY_OVERLAYFS_DEVICE must be set in your MACHINE configuration")
    if not overlayEtcFsType:
        bb.fatal("BITSY_OVERLAYFS_FSTYPE should contain a valid file system type on {0}".format(overlayEtcDevice))

    with open(d.getVar("BITSY_OVERLAYFS_INIT_TEMPLATE"), "r") as f:
        PreinitTemplate = f.read()

    useOrigInit = oe.types.boolean(d.getVar('BITSY_OVERLAYFS_USE_ORIG_INIT_NAME'))
    preinitPath = oe.path.join(d.getVar("IMAGE_ROOTFS"), d.getVar("base_sbindir"), "preinit")
    initBaseName = oe.path.join(d.getVar("base_sbindir"), "init")
    origInitNameSuffix = ".orig"

    devicenamepart = overlayEtcDevice.split('/')[-1]
    devicename = devicenamepart.split('p')[0]
    part = devicenamepart.split('p')[-1]

    args = {
        'BITSY_OVERLAYFS_MOUNT_POINT': overlayEtcMountPoint,
        'BITSY_OVERLAYFS_MOUNT_OPTIONS': d.getVar('BITSY_OVERLAYFS_MOUNT_OPTIONS'),
        'BITSY_OVERLAYFS_FSTYPE': overlayEtcFsType,
        'BITSY_OVERLAYFS_DEVICE': overlayEtcDevice,
        'SBIN_INIT_NAME': initBaseName + origInitNameSuffix if useOrigInit else initBaseName,
        'START_BLOCK': '/sys/block/{0}/{1}/start'.format(devicename, devicenamepart),
        'SIZE_BLOCK': '/sys/block/{0}/{1}/size'.format(devicename, devicenamepart),
        'END_BLOCK': '/sys/block/{0}/size'.format(devicename),
        'PARTED_DEVICE': overlayEtcDevice.split('p')[0],
        'PARTED_PART': overlayEtcDevice.split('p')[1]
    }
    

    if useOrigInit:
        # rename original /sbin/init
        origInit = oe.path.join(d.getVar("IMAGE_ROOTFS"), initBaseName)
        bb.debug(1, "rootfs path %s, init path %s, test %s" % (d.getVar('IMAGE_ROOTFS'), origInit, d.getVar("IMAGE_ROOTFS")))
        bb.utils.rename(origInit, origInit + origInitNameSuffix)
        preinitPath = origInit

    with open(preinitPath, 'w') as f:
        f.write(PreinitTemplate.format(**args))
    os.chmod(preinitPath, 0o755)
}
