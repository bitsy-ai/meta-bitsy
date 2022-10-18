LICENSE = "AGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"

require recipes-core/images/include/core.inc
require recipes-core/images/include/klipper.inc
require recipes-core/images/include/mainsail.inc
require recipes-core/images/include/octoprint.inc


SWUPDATE_IMAGES_FSTYPES[printnanny-release-image-raspberrypi4-64] = ".ext4.gz"
SWUPDATE_IMAGES_FSTYPES[uImage] = ".bin"
inherit swupdate-image
