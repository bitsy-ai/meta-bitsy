LICENSE = "AGPLv3"
DESCRIPTION = "A console-only image with minimal Linux system functionality installed."

WKS_FILE = "sdimage-printnanny.wks"
EXTRA_IMAGE_FEATURES = "overlayfs-etc splash"
IMAGE_INSTALL = "\
    packagegroup-core-boot \
    packagegroup-core-full-cmdline \
    ${CORE_IMAGE_EXTRA_INSTALL} \
"

OVERLAYFS_ETC_MOUNT_POINT = "/data"
OVERLAYFS_ETC_DEVICE = "/dev/mmcblk0p2"
OVERLAYFS_ETC_FSTYPE = "ext4"

VOLATILE_LOG_DIR = "no"
# disable splash
# send boot messaegs to tty1
CMDLINE:append = "console=tty1"
# install empty-root-password, allow-empty-password, allow-root-login, post-install-logging
EXTRA_IMAGE_FEATURES = "debug-tweaks bash-completion-pkgs tools-debug"


inherit core-image
