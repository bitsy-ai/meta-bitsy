SUMMARY = "NATS Server"
HOMEPAGE = "https://github.com/nats-io/nats-server"
LICENSE = "Apache-2.0"

SRC_URI = "\
    https://github.com/nats-io/nats-server/releases/download/v${PV}/nats-server-v${PV}-linux-arm64.zip \
    file://nats-server.conf \
    file://printnanny-nats-server.service \
"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

inherit systemd
SRC_URI[sha256sum] = "e65c8ea61fa2e0c6396e63e84729fd147b83568d6054f4d5bfac67a09acad969"

do_install(){
    install -d "${D}${bindir}"
    install -d "${D}${systemd_system_unitdir}"
    install -d "${D}${sysconfdir}/nats-server"
    install -m 0644 "${WORKDIR}/nats-server.conf" "${D}${sysconfdir}/nats-server/nats-server.conf"
    install -m 0644 "${WORKDIR}/printnanny-nats-server.service" "${D}${systemd_system_unitdir}/printnanny-nats-server.service"
    cp "${WORKDIR}/nats-server-v${PV}-linux-arm64/nats-server" "${D}${bindir}/nats-server"
}

SYSTEMD_SERVICE:${PN} = "printnanny-nats-server.service"
SYSTEMD_AUTO_ENABLE = "enable"

FILES:${PN} = "${bindir}/* ${sysconfdir}/* ${systemd_system_unitdir}/*"
