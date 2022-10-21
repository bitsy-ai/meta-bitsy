SUMMARY = "PrintNanny OS Dashboard"
HOMEPAGE = "https://github.com/bitsy-ai/printnanny-dash/"

SRC_URI = "\
    https://github.com/bitsy-ai/printnanny-dash/releases/download/v${PV}/printnanny-dash-${TARGET_ARCH}-unknown-linux-gnu.tar.gz \
    file://printnanny-dash.service \
"
SRC_URI[sha256sum] = "f2c2b03ebf4236dcb403b2eb963c02f666bd3c2f5d53c159a3be82c96c18df8f"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"

do_install(){
    install -d "${D}${bindir}"
    install -d "${D}${systemd_system_unitdir}"
    install -m 0755 "${WORKDIR}/printnanny-dash" "${D}${bindir}/printnanny-dash"
    install -m 0644 "${WORKDIR}/printnanny-dash.service" "${D}${systemd_system_unitdir}/printnanny-dash.service"
}

inherit systemd

SYSTEMD_SERVICE:${PN} = "\
    printnanny-dash.service \
"

SYSTEMD_AUTO_ENABLE = "enable"
