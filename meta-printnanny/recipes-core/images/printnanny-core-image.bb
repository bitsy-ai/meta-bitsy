LICENSE = "AGPLv3"
DESCRIPTION = "A console-only image with minimal Linux system functionality installed."

WKS_FILE = "sdimage-printnanny.wks"
EXTRA_IMAGE_FEATURES = "overlayfs-etc splash"

OVERLAYFS_ETC_MOUNT_POINT = "/data"
OVERLAYFS_ETC_DEVICE = "/dev/mmcblk0p2"
OVERLAYFS_ETC_FSTYPE = "ext4"

inherit core-image
