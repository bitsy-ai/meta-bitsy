# required to use both overlayfs-etc and package-management features
# see note: https://git.yoctoproject.org/poky/plain/meta/classes/overlayfs-etc.bbclass
inherit bitsy-overlayfs
OVERLAYFS_ETC_USE_ORIG_INIT_NAME = "0"
OVERLAYFS_ETC_MOUNT_POINT = "/data"
OVERLAYFS_ETC_DEVICE = "/dev/mmcblk0p3"
OVERLAYFS_ETC_FSTYPE = "ext4"
# custom template with /home overlayfs
OVERLAYFS_ETC_INIT_TEMPLATE = "${COREBASE}/meta-bitsy/files/overlayfs-etc-preinit.sh.in"
CMDLINE:append = "\
    init=/sbin/preinit \
"
