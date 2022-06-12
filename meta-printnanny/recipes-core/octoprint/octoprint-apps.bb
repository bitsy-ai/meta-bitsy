LICENSE = "AGPLv3"

inherit systemd

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"
SRC_URI:append = "\
    file://config.yaml \
    file://octoprint.service \
"

OCTOPRINT_CONF ?= "/home/printnanny/.octoprint"

do_install:append() {
    install -d ${D}${OCTOPRINT_CONF}
    install -d ${D}${systemd_system_unitdir}
    install -m 0755 ${WORKDIR}/config.yaml ${D}${OCTOPRINT_CONF}/config.yaml
    install -m 0644 ${WORKDIR}/octoprint.service ${D}${systemd_system_unitdir}/octoprint.service
}

SYSTEMD_SERVICE:${PN} = "octoprint.service"
SYSTEMD_AUTO_ENABLE = "enable"
FILES:${PN} += "${OCTOPRINT_CONF} ${systemd_system_unitdir}"
RDEPENDS:${PN} = "python3-octoprint-nanny"
