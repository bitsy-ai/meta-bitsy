SUMMARY = "PrintNanny OS Dashboard"
HOMEPAGE = "https://github.com/bitsy-ai/printnanny-dash/"

SRC_URI = "\
    https://github.com/bitsy-ai/printnanny-dash/releases/download/v${PV}/printnanny-dash-${TARGET_ARCH}-unknown-linux-gnu.tar.gz \
    file://printnanny-dash.service \
"
SRC_URI[sha256sum] = "122c62ca8505ef8b0957f25ffa805ab178ec941ac6b70c8f70b66f15fbd55b4c"
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