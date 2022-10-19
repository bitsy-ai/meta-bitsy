SUMMARY = "PrintNanny Core Packages"
DESCRIPTION = "Minimal set of packages required to run PrintNanny OS Apps"
PR = "r1"

PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

RDEPENDS:${PN} = "\
    printnanny-core-apps \
    printnanny-cloud-apps \
    printnanny-dash \
    printnanny-cli \
    janus-gateway \
    nginx \
    swupdate \
    swupdate-progress \
    swupdate-www \
    swupdate-tools \
    u-boot-fw-utils \
    printnanny-user \
    natscli \
    nats-server \
"
