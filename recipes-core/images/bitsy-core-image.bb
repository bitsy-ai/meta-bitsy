LICENSE = "AGPLv3"
DESCRIPTION = "A console-only image with read-only root filesystem and writeable data partition"

# required to use both overlayfs-etc and package-management features
# see note: https://git.yoctoproject.org/poky/plain/meta/classes/overlayfs-etc.bbclass
IMAGE_FEATURES:append = " overlayfs-etc"
OVERLAYFS_ETC_USE_ORIG_INIT_NAME = "0"
OVERLAYFS_ETC_MOUNT_POINT = "/data/etc"
OVERLAYFS_ETC_DEVICE = "/dev/mmcblk0p3"
OVERLAYFS_ETC_FSTYPE = "ext4"
# required to use both overlayfs-etc and package-management features
# see note: https://git.yoctoproject.org/poky/plain/meta/classes/overlayfs-etc.bbclass
CMDLINE:append = "\
    init=/sbin/preinit \
"
