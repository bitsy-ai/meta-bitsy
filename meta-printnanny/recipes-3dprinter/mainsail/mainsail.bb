SUMMARY = "Klipper is a 3d-Printer firmware"
HOMEPAGE = "https://www.klipper3d.org/"
LICENSE = "GPL-3.0-or-later"


PV = "support-base-path-rc1"
R = "rc1"
SRC_URI = "\
    https://github.com/bitsy-ai/mainsail/releases/download/${PV}/mainsail.zip;subdir=mainsail \
    file://mainsail.target \
"
SRC_URI[sha256sum] = "e3d7fed6f7cc5eb04827f1d282508fb606be284cf92078524b06ae4c87e6e8a4"
S = "${WORKDIR}/mainsail"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-3.0-or-later;md5=1c76c4cc354acaac30ed4d5eefea7245"

INSTALL_DIR = "/var/www/mainsail"
inherit systemd

do_install() {
    install -d "${D}${INSTALL_DIR}"
    cp --preserve=mode,timestamps -R ${WORKDIR}/mainsail/* ${D}${INSTALL_DIR}
    if [ "${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)}" ]; then
            install -d "${D}${systemd_system_unitdir}"
            install -m 0644 "${WORKDIR}/mainsail.target" "${D}${systemd_system_unitdir}/mainsail.target"
    fi
}

SYSTEMD_PACKAGES = "${@bb.utils.contains('DISTRO_FEATURES','systemd','${PN}','',d)}"
SYSTEMD_SERVICE:${PN} = "mainsail.target"
SYSTEMD_AUTO_ENABLE = "disable"

FILES:${PN} = "${INSTALL_DIR}/*"

PACKAGES = "${PN}"
