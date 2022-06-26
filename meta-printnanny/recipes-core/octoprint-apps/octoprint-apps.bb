LICENSE = "AGPLv3"

inherit systemd

LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"
SRC_URI:append = "\
    file://config.yaml \
    file://octoprint.service \
    file://octoprint-link.service \
    file://octoprint-link-confd.sh \
"
PRINTNANNY_USER = "printnanny"
PYTHON_VENV = "/home/printnanny/.octoprint/.venv"

do_install:append() {
    install -d ${D}${sysconfdir}/octoprint
    install -d ${D}${systemd_system_unitdir}
    install -d "${D}${bindir}"
    install -m 0755 "${WORKDIR}/octoprint-link-confd.sh" "${D}${bindir}/octoprint-link-confd"
    install -d ${D}/home/${PRINTNANNY_USER}/.octoprint
    install -m 0755 ${WORKDIR}/config.yaml ${D}/home/${PRINTNANNY_USER}/.octoprint/config.yaml
    chown -R ${PRINTNANNY_USER} ${D}/home/${PRINTNANNY_USER}
    install -m 0644 ${WORKDIR}/octoprint.service ${D}${systemd_system_unitdir}/octoprint.service
}

SYSTEMD_SERVICE:${PN} = "octoprint.service"
SYSTEMD_AUTO_ENABLE = "enable"
FILES:${PN} = "${sysconfdir} ${systemd_system_unitdir} /home/${PRINTNANNY_USER}/.octoprint ${bindir}"

DEPENDS = "printnanny-user"
RDEPENDS:${PN} = "\
    python3-octoprint-nanny \
    python3-pip \
    python3-wheel \
    printnanny-user \
"
