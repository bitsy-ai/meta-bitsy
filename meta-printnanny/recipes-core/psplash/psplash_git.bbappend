FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

# generated with: https://github.com/g0hl1n/psplash/blob/master/make-image-header.sh
SRC_URI += "\
    file://psplash-printnanny-img.h \
"
SPLASH_IMAGES:rpi = "file://psplash-printnanny-img.h;outsuffix=printnanny"
