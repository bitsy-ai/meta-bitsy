LICENSE = "AGPLv3"
DESCRIPTION = "A console-only image with minimal Linux system functionality installed."

WKS_FILE = "sdimage-printnanny.wks"
DISTRO ?= "printnanny"

# required to use both overlayfs-etc and package-management features
# see note: https://git.yoctoproject.org/poky/plain/meta/classes/overlayfs-etc.bbclass
# OVERLAYFS_ETC_USE_ORIG_INIT_NAME = "0"
# OVERLAYFS_ETC_MOUNT_POINT = "/data/etc"
# OVERLAYFS_ETC_DEVICE = "/dev/mmcblk0p3"
# OVERLAYFS_ETC_FSTYPE = "ext4"

IMAGE_FEATURES = "\
    bash-completion-pkgs \
    debug-tweaks \
    overlayfs \
    package-management \
    splash \
    ssh-server-openssh \
"

# packagegroup-base (via packagegroup-base-extended) is required to pull in MACHINE_EXTRA_RRECOMMENDS
# https://docs.yoctoproject.org/ref-manual/variables.html#term-MACHINE_EXTRA_RRECOMMENDS

# entire userland is installed here JUST for vcgencmd
# there's almost certainly a better way to handle this: https://github.com/raspberrypi/userland/blob/master/host_applications/linux/apps/gencmd/CMakeLists.txt
IMAGE_INSTALL = "\
    kernel-devicetree \
    kernel-modules \
    packagegroup-base-extended \
    packagegroup-bitsy \
    packagegroup-bitsy-cloudinit \
    packagegroup-core-base-utils \
    packagegroup-core-boot \
    packagegroup-core-full-cmdline \
    packagegroup-printnanny-core \
    packagegroup-printnanny-cv \
    packagegroup-printnanny-utils \
    packagegroup-printnanny-webrtc \
    ${CORE_IMAGE_EXTRA_INSTALL} \
"

# COMBINED_FEATURES is the set of features enabled in MACHINE_FEATURES and DISTRO_FEATURES
# COMBINED_FEATURES referenced in packagegroup-base to install base system packages
MACHINE_FEATURES += "bluetooth wifi keyboard"

VOLATILE_LOG_DIR = "no"
# disable splash
# send boot messaegs to tty1
# install empty-root-password, allow-empty-password, allow-root-login, post-install-logging
inherit core-image

inherit extrausers
EXTRA_USERS_PARAMS += "\
  groupadd i2c; \
  groupadd netdev; \
  groupadd video; \
  groupadd spi; \
  groupadd video; \
  useradd -s /bin/bash -m -d /home/printnanny -G adm,dialout,i2c,input,netdev,plugdev,spi,sudo,video printnanny; \
"
