require recipes-core/images/printnanny-core-image.bb

IMAGE_INSTALL += "\
    userland \
    packagegroup-octoprint\
"
DESCRIPTION = "BitsyLinux initramfs updater image"
LICENSE = "AGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"

SWUPDATE_IMAGES_FSTYPES[printnanny-octoprint-image] = ".wic"
SWUPDATE_IMAGES_FSTYPES[u-boot] = ".bin"
inherit swupdate-image
