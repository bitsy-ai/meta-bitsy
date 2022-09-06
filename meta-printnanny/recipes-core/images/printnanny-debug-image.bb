require recipes-core/images/printnanny-octoprint-image.bb
require recipes-core/images/printnanny-mainsail-image.bb
require recipes-core/images/include/debug.inc

SWUPDATE_IMAGES_FSTYPES[printnanny-debug-image] = ".ext4.gz"

IMAGE_INSTALL:append = "systemd-analyze"