LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"
REQUIRED_DISTRO_FEATURES += "bitsy-growpart"

inherit bitsy-growpart systemd

SRC_URI = "\
    file://bitsy-growpart.sh.in \
    file://bitsy-growpart.service \
"

do_install(){
    install -d "${D}${systemd_system_unitdir}"
    install -m 0644 "${WORKDIR}/bitsy-growpart.service" "${D}${systemd_system_unitdir}/bitsy-growpart.service"
}

SYSTEMD_SERVICE:${PN} = "bitsy-growpart.service"
SYSTEMD_AUTO_ENABLE = "enable"

FILES:${PN} = "${BITSY_GROWPART_BIN}"
