SUMMARY = "NATS Server"
HOMEPAGE = "https://github.com/nats-io/nats-server"
LICENSE = "Apache-2.0"

SRC_URI = "\
    https://github.com/nats-io/nats-server/releases/download/v${PV}/nats-server-v${PV}-linux-arm64.zip \
    file://nats-server.conf \
    file://printnanny-nats-server.service \
"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

# S = "${WORKDIR}/nats-server"

inherit systemd
SRC_URI[sha256sum] = "d35766ba020dd648dd2845499ac7fcb264876c796dde288bf454997e7b6bbb31"

do_install(){
    install -d "${D}${bindir}"
    install -d "${D}${systemd_system_unitdir}"
    install -d "${D}${sysconfdir}/nats-server"
    install -m 0644 "${WORKDIR}/nats-server.conf" "${D}${sysconfdir}/nats-server/nats-server.conf"
    install -m 0644 "${WORKDIR}/printnanny-nats-server.service" "${D}${systemd_system_unitdir}/printnanny-nats-server.service"
    cp "${WORKDIR}/nats-server-v${PV}-linux-arm64/nats-server" "${D}${bindir}/nats-server"
}

SYSTEMD_PACKAGES = "${@bb.utils.contains('DISTRO_FEATURES','systemd','${PN}','',d)}"
SYSTEMD_SERVICE:${PN} = "printnanny-nats-server.service"
SYSTEMD_AUTO_ENABLE = "enable"

FILES:${PN} = "${bindir}/* ${sysconfdir}/*"
