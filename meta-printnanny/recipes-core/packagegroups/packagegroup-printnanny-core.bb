SUMMARY = "PrintNanny Core Packages"
DESCRIPTION = "Minimal set of packages required to run PrintNanny OS Apps"
PR = "r0"

PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

SYNCTHING_USER = "printnanny"

RDEPENDS:${PN} = "\
    printnanny-apps \
    printnanny-vision \
    janus-gateway \
    nginx \
    swupdate \
    swupdate-progress \
    swupdate-www \
    swupdate-tools \
    syncthing \
    syncthing-nginx \
    u-boot-fw-utils \
    printnanny-user \
    natscli \
"
