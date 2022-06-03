LICENSE = "AGPLv3"
DESCRIPTION = "A console-only image with minimal Linux system functionality installed."

WKS_FILE = "sdimage-printnanny.wks"

# required to use both overlayfs-etc and package-management features
# see note: https://git.yoctoproject.org/poky/plain/meta/classes/overlayfs-etc.bbclass
OVERLAYFS_ETC_USE_ORIG_INIT_NAME = "0"

IMAGE_FEATURES = "\
    overlayfs-etc \
    splash \
    debug-tweaks \
    bash-completion-pkgs \
    package-management \
    ssh-server-openssh \
"

IMAGE_INSTALL = "\
    packagegroup-core-boot \
    packagegroup-core-full-cmdline \
    kernel-image \
    kernel-modules \
    kernel-devicetree \
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
inherit core-image
