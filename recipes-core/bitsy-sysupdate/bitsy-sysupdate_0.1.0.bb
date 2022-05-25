DESCRIPTION = "systemd-sysupdate configuration files"
HOMEPAGE = "https://bitsy.ai"
LICENSE = "AGPLv3+"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"
SRC_URI = "file://repart.d/ \
    file://sysupdate.d/ \
"

inherit systemd

SYSTEMD_PACKAGES = "${@bb.utils.contains('DISTRO_FEATURES','systemd','${PN}','',d)}"

do_install:append() {
    install -d ${D}${sysconfdir}/repart.d
    install -d ${D}${sysconfdir}/sysupdate.d
    install -m 0644 ${WORKDIR}/repart.d/001_root_a.conf ${D}${sysconfdir}/repart.d/001_root_a.conf
    install -m 0644 ${WORKDIR}/repart.d/001_root_b.conf ${D}${sysconfdir}/repart.d/001_root_b.conf
    install -m 0644 ${WORKDIR}/repart.d/002_home.conf ${D}${sysconfdir}/repart.d/002_home.conf
    install -m 0644 ${WORKDIR}/sysupdate.d/001_root.conf ${D}${sysconfdir}/sysupdate.d/001_root.conf
}
FILES_${PN} = "${sysconfdir}/repart.d/* ${sysconfdir}/sysupdate.d/*"
