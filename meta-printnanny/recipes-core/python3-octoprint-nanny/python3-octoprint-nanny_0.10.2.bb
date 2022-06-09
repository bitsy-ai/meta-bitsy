LICENSE = "AGPLv3"

inherit pypi setuptools3_legacy systemd

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"
SRC_URI:append = "\
    file://config.yaml \
    file://octoprint.service \
"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"
SRC_URI[sha256sum] = "c9ac98b45a38b23852ac40478f974c09961b3b0a5aa0a6397b37ba061d7e8f10"
PYPI_PACKAGE = "OctoPrint-Nanny"


do_install:append() {
    install -d ${D}${sysconfdir}/octoprint
    install -d ${D}${systemd_system_unitdir}
    install -m 0755 ${WORKDIR}/config.yaml ${D}${sysconfdir}/octoprint/config.yaml
    install -m 0644 ${WORKDIR}/octoprint.service ${D}${systemd_system_unitdir}/octoprint.service
}

SYSTEMD_SERVICE:${PN} = "octoprint.service"
SYSTEMD_AUTO_ENABLE = "enable"

RDEPENDS:${PN}:append = "\
    python3-pip \
"
