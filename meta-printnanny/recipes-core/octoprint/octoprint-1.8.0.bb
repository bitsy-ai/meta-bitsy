LICENSE = "AGPLv3"
inherit pypi setuptools3 systemd
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "file://config.yaml \
    file://octoprint.service \
"

PYPI_PACKAGE = "OctoPrint"

do_install() {
    install -d ${WORKDIR}/data/octoprint
    install -m 0755 ${S}/config.yaml ${WORKDIR}/data/octoprint/config.yaml
}
FILES_${PN} = "/data/octoprint/config.yaml "
SYSTEMD_SERVICE:${PN} = "octoprint.service"
SYSTEMD_AUTO_ENABLE = "enable"
RPROVIDES:${PN} = "octoprint"
