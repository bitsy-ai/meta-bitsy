LICENSE = "AGPLv3"

inherit systemd bitsy_tmpl

LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"
SRC_URI:append = "\
    file://config.yaml \
    file://octoprint.service.tmpl \
    file://octoprint-venv.service.tmpl \
"

PV = "r2"

OCTOPRINT_USER ?= "printnanny"
# install to /home directory, which is a writable overlayfs
# OctoPrint allows users to update the software & install plugins via pip module, so it can't be installed to read-only rootfs
# The pip module must also be sandboxed (virtualenv)
OCTOPRINT_BASEDIR ?= "/home/${OCTOPRINT_USER}/.octoprint"
OCTOPRINT_VENV ?= "/home/${OCTOPRINT_USER}/octoprint-venv"
OCTOPRINT_ENV ?= "/run/octoprint/env"
OCTOPRINT_PORT ?= "5001"

BITSY_TEMPLATE_FILES = "\
    octoprint.service.tmpl \
    octoprint-venv.service.tmpl \
"

BITSY_TEMPLATE_ARGS = "\
    OCTOPRINT_ENV \
    OCTOPRINT_VENV \
    OCTOPRINT_BASEDIR \
    OCTOPRINT_USER \
    OCTOPRINT_PORT \
"

do_install:append() {
    install -d ${D}${systemd_system_unitdir}
    install -d "${D}${bindir}"
    install --group=${OCTOPRINT_USER} --owner=${OCTOPRINT_USER} -d ${D}${OCTOPRINT_BASEDIR}/
    install -m 0755 ${WORKDIR}/config.yaml ${D}${OCTOPRINT_BASEDIR}/config.yaml
    chown -R ${OCTOPRINT_USER}:${OCTOPRINT_USER} ${D}/home/${OCTOPRINT_USER}
    install -m 0644 ${WORKDIR}/octoprint.service ${D}${systemd_system_unitdir}/octoprint.service
    install -m 0644 ${WORKDIR}/octoprint-venv.service ${D}${systemd_system_unitdir}/octoprint-venv.service
}


SYSTEMD_SERVICE:${PN} = "octoprint.service octoprint-venv.service"
SYSTEMD_AUTO_ENABLE = "enable"
FILES:${PN} = "${systemd_system_unitdir} ${OCTOPRINT_BASEDIR}/* ${bindir}"

DEPENDS = "${OCTOPRINT_USER}-user"

# install python3-octoprint-nanny to system site-packages
RDEPENDS:${PN} = "\
    python3-octoprint-nanny \
    python3-pip \
    python3-wheel \
    ${OCTOPRINT_USER}-user \
    ffmpeg \
"
