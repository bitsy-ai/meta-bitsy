# required to use both overlayfs-etc and package-management features
# see note: https://git.yoctoproject.org/poky/plain/meta/classes/overlayfs-etc.bbclass
# inherit bitsy-overlayfs
# BITSY_OVERLAYFS_USE_ORIG_INIT_NAME = "0"
# BITSY_OVERLAYFS_MOUNT_POINT = "/data"
# BITSY_OVERLAYFS_DEVICE = "${@bb.utils.contains('DISTRO_FEATURES', 'swupdate', '/dev/mmcblk0p4', '/dev/mmcblk0p3', d)}"
# BITSY_OVERLAYFS_FSTYPE = "ext4"
# # custom template with /home overlayfs
# BITSY_OVERLAYFS_INIT_TEMPLATE = "${COREBASE}/meta-bitsy/files/bitsy-overlayfs-preinit.sh.in"

IMAGE_INSTALL:append = " \
    kernel-devicetree \
    kernel-modules \
"

inherit core-image
