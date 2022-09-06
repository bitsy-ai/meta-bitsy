SUMMARY = "Klipper is a 3d-Printer firmware"
HOMEPAGE = "https://www.klipper3d.org/"
LICENSE = "GPL-3.0-or-later"

SRC_URI = "\
    https://github.com/mainsail-crew/mainsail/releases/download/v${PV}/mainsail.zip;subdir=mainsail \
    file://nginx/upstream.conf \
    file://nginx/sites.conf \
    file://nginx/common.conf \
"
SRC_URI[sha256sum] = "93195529e8226652c8db1fc55cb69fcb3372ab327cb25c56469780e2c527c3b6"
S = "${WORKDIR}/mainsail"

LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"
INSTALL_DIR = "/opt/mainsail"

do_install() {
    install -d "${D}${INSTALL_DIR}"
    cp --preserve=mode,timestamps -R ${WORKDIR}/mainsail/* ${D}${INSTALL_DIR}
    if [ "${@bb.utils.filter('DISTRO_FEATURES', 'nginx', d)}" ]; then
        install -d "${D}${sysconfdir}/nginx/conf.d/"
        install -d "${D}${sysconfdir}/nginx/sites-available/"
        install -d "${D}${sysconfdir}/nginx/sites-enabled/"

        install -m 0644 "${WORKDIR}/nginx/upstream.conf" "${D}${sysconfdir}/nginx/conf.d/mainsail-upstream.conf"
        install -m 0644 "${WORKDIR}/nginx/common.conf" "${D}${sysconfdir}/nginx/conf.d/mainsail-common.conf"
        install -m 0644 "${WORKDIR}/nginx/sites.conf" "${D}${sysconfdir}/nginx/sites-available/mainsail"
        ln -s -r "${D}${sysconfdir}/nginx/sites-available/mainsail" "${D}${sysconfdir}/nginx/sites-enabled/mainsail"
    fi
}

FILES:${PN} = "\
    ${INSTALL_DIR}/* \
"