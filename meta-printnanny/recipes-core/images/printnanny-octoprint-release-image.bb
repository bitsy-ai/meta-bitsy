DISTRO = "printnanny-octoprint"
LICENSE = "AGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"
VARIANT="PrintNanny OctoPrint Edition"
VARIANT_ID="printnanny-octoprint"

require recipes-core/images/printnanny-core-image.bb
require recipes-core/images/include/octoprint.inc

SWUPDATE_IMAGES_FSTYPES[printnanny-octoprint-release-image-raspberrypi4-64] = ".ext4.gz"
SWUPDATE_IMAGES_FSTYPES[uImage] = ".bin"
inherit swupdate-image
