DESCRIPTION = "systemd-sysupdate configuration files"
HOMEPAGE = "https://bitsy.ai"
LICENSE = "AGPLv3+"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"
SRC_URI = "file://repart.d/ \
    file://sysupdate.d/ \
"

inherit systemd

do_install:append() {
    install -d ${S}/repart.d ${WORKDIR}/etc/repart.d
    install -d ${S}/sysupdate.d ${WORKDIR}/etc/sysupdate.d
}

FILES_${PN} = "/etc/repart.d/* /etc/sysupdate.d/*"
