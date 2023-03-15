SUMMARY = "PrintNanny Core Packages"
DESCRIPTION = "Minimal set of packages required to run PrintNanny OS Apps"
PR = "r2"

PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

RDEPENDS:${PN} = "\
    printnanny-core-apps \
    printnanny-cloud-apps \
    printnanny-dash \
    printnanny-overlayfs \
    printnanny-snapshot \
    janus-gateway \
    nginx \
    ntp \
    swupdate \
    swupdate-progress \
    swupdate-www \
    swupdate-tools \
    u-boot-fw-utils \
    printnanny-user \
    natscli \
    nats-server \
"
