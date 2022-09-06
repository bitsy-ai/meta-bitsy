require recipes-core/images/printnanny-core-image.bb

IMAGE_INSTALL += "\
    userland \
    packagegroup-octoprint \
"

SWUPDATE_IMAGES_FSTYPES[printnanny-octoprint-image] = ".ext4.gz"
SWUPDATE_IMAGES_FSTYPES[uImage] = ".bin"
inherit swupdate-image
