LICENSE = "AGPLv3"

inherit systemd

LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"
SRC_URI:append = "\
    file://config.yaml \
    file://octoprint.service \
"

do_install:append() {
    install -d ${D}${sysconfdir}/octoprint
    install -d ${D}${systemd_system_unitdir}
    install -m 0755 ${WORKDIR}/config.yaml ${D}${sysconfdir}/octoprint/config.yaml
    install -m 0644 ${WORKDIR}/octoprint.service ${D}${systemd_system_unitdir}/octoprint.service
}

SYSTEMD_SERVICE:${PN} = "octoprint.service"
SYSTEMD_AUTO_ENABLE = "enable"
FILES:${PN} = "${sysconfdir} ${systemd_system_unitdir}"
RDEPENDS:${PN} = "python3-octoprint-nanny"