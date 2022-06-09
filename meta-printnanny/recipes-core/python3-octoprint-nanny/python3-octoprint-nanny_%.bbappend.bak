LICENSE = "AGPLv3"

inherit systemd

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"
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
