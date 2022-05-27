LICENSE = "AGPLv3"

inherit pypi setuptools3 systemd
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "file://config.yaml \
    file://octoprint.service \
"
LIC_FILES_CHKSUM = "file://${S}/LICENSE.txt;md5=73f1eb20517c55bf9493b7dd6e480788"

SRC_URI[sha256sum] = "d4109d854c6b1a4155af3360597b31aed28a1a20df146d77105060ed74d05f21"
PYPI_PACKAGE = "OctoPrint"

do_install() {
    install -d ${D}/${sysconfdir}/octoprint/config.yaml
    install -d ${D}/${systemd_unitdir}
    install -m 0755 ${WORKDIR}/config.yaml ${D}/${sysconfdir}/octoprint/config.yaml
    install -m 0644 ${WORKDIR}/octoprint.service ${D}/${systemd_unitdir}/octoprint.service
}
FILES_${PN} = "\
    ${sysconfdir}/octoprint/config.yaml \
    ${systemd_unitdir}/octoprint.service \
"

SYSTEMD_SERVICE:${PN} = "octoprint.service"
SYSTEMD_AUTO_ENABLE = "enable"

RDEPENDS:${PN} = "\
    python3 \
    python3-pip \
"
RPROVIDES:${PN} = "octoprint"
