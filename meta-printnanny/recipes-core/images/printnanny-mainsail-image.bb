require recipes-core/images/printnanny-core-image.bb

VARIANT_NAME="PrintNanny Mainsail Edition"
VARIANT_ID="printnanny-mainsail"

IMAGE_INSTALL += "\
    userland \
    packagegroup-mainsail \
"

SWUPDATE_IMAGES_FSTYPES[printnanny-mainsail-image] = ".ext4.gz"
SWUPDATE_IMAGES_FSTYPES[uImage] = ".bin"
inherit swupdate-image
