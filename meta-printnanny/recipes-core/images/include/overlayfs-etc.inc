# see overlayfs-etc.bbclass for implementation

inherit bitsy-overlayfs-etc
# /etc overlayfs is a special case, requiring a pre-init script that runs before systemd is initialized
OVERLAYFS_ETC_MOUNT_POINT = "/data"
OVERLAYFS_ETC_FSTYPE = "ext4"
OVERLAYFS_ETC_DEVICE = "/dev/mmcblk0p4"
OVERLAYFS_ETC_USE_ORIG_INIT_NAME = "0"

IMAGE_FEATURES += "overlayfs-etc"