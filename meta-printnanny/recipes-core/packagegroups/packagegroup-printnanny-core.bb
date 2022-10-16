SUMMARY = "PrintNanny Core Packages"
DESCRIPTION = "Minimal set of packages required to run PrintNanny OS Apps"
PR = "r0"

PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

RDEPENDS:${PN} = "\
    printnanny-core-apps \
    printnanny-dash \
    printnanny-cli \
    printnanny-vision \
    printnanny-gst-plugin \
    janus-gateway \
    nginx \
    swupdate \
    swupdate-progress \
    swupdate-www \
    swupdate-tools \
    u-boot-fw-utils \
    printnanny-user \
    natscli \
"
