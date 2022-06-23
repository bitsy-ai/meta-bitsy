
REQUIRED_DISTRO_FEATURES += "bitsy-growpart"
BITSY_OVERLAYFS_MOUNT_POINT ??= "/data"
BITSY_OVERLAYFS_FSTYPE ??= "ext4"
BITSY_OVERLAYFS_DEVICE = "${@bb.utils.contains('DISTRO_FEATURES', 'swupdate', '/dev/mmcblk0p4', '/dev/mmcblk0p3', d)}"
BITSY_OVERLAYFS_MOUNT_OPTIONS ??= "defaults"
BITSY_GROWPART_INIT_TEMPLATE ??= "bitsy-growpart.sh.in"
BITSY_GROWPART_BIN ??= "bitsy-growpart"

python do_compile() {
    overlayEtcMountPoint = d.getVar("BITSY_OVERLAYFS_MOUNT_POINT")
    overlayEtcFsType = d.getVar("BITSY_OVERLAYFS_FSTYPE")
    overlayEtcDevice = d.getVar("BITSY_OVERLAYFS_DEVICE")
    binFile = d.getVar("BITSY_GROWPART_BIN")

    if not overlayEtcMountPoint:
        bb.fatal("BITSY_OVERLAYFS_MOUNT_POINT must be set in your MACHINE configuration")
    if not overlayEtcDevice:
        bb.fatal("BITSY_OVERLAYFS_DEVICE must be set in your MACHINE configuration")
    if not overlayEtcFsType:
        bb.fatal("BITSY_OVERLAYFS_FSTYPE should contain a valid file system type on {0}".format(overlayEtcDevice))

    with open(d.getVar("BITSY_GROWPART_INIT_TEMPLATE"), "r") as f:
        PreinitTemplate = f.read()

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
        'START_BLOCK': '/sys/block/{0}/{1}/start'.format(devicename, devicenamepart),
        'SIZE_BLOCK': '/sys/block/{0}/{1}/size'.format(devicename, devicenamepart),
        'END_BLOCK': '/sys/block/{0}/size'.format(devicename),
        'PARTED_DEVICE': overlayEtcDevice.split('p')[0],
        'PARTED_PART': overlayEtcDevice.split('p')[1]
    }

    with open(binFile, 'w') as f:
        f.write(PreinitTemplate.format(**args))
    os.chmod(binFile, 0o755)
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${BITSY_GROWPART_BIN} ${D}${bindir}
}

FILES:${PN} += "${bindir}/${BITSY_GROWPART_BIN}"
