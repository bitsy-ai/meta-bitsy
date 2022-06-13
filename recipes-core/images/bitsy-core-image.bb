# required to use both overlayfs-etc and package-management features
# see note: https://git.yoctoproject.org/poky/plain/meta/classes/overlayfs-etc.bbclass
inherit bitsy-overlayfs
BITSY_OVERLAYFS_USE_ORIG_INIT_NAME = "0"
BITSY_OVERLAYFS_MOUNT_POINT = "/data"
BITSY_OVERLAYFS_DEVICE = "/dev/mmcblk0p3"
BITSY_OVERLAYFS_FSTYPE = "ext4"
# custom template with /home overlayfs
BITSY_OVERLAYFS_INIT_TEMPLATE = "${COREBASE}/meta-bitsy/files/bitsy-overlayfs-preinit.sh.in"
CMDLINE:append = "\
    init=/sbin/preinit \
"
