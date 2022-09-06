VARIANT="PrintNanny OctoPrint Edition"
VARIANT_ID="printnanny-octoprint"

require recipes-core/images/printnanny-octoprint-release-image.bb
require recipes-core/images/include/debug.inc

SWUPDATE_IMAGES_FSTYPES[printnanny-octoprint-debug-image-raspberrypi4-64] = ".ext4.gz"
