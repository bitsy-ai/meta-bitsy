
SUMMARY = "Moonraker - API Web Server for Klipper"
HOMEPAGE = "https://github.com/Arksine/moonraker"
LICENSE = "GPL-3.0-or-later"

SRC_URI = "\
    git://github.com/Arksine/moonraker/;protocol=ssh;nobranch=1;branch=master \
    file://moonraker.service \
"
SRCREV = "5d856b9c490e6288e63daeba1056bbc064935449"
SRC_URI[sha256sum] = "fcd9fd2de95ff7174dba58826e393eaf948bfcc430ce44cbfaabefe685295b86"

LIC_FILES_CHKSUM = "file://LICENSE;md5=db95b6e40dc7d26d8308b6b7375637b6"
S = "${WORKDIR}/git"

RDEPENDS:${PN} = "\
    python3 \
    python3-core \
    python3-pip \
    curl \
    libsodium \
    zlib \
    jpeg \
    libgpiod \
    bash \
"

INSTALL_DIR = "/opt/moonraker"

inherit systemd
SYSTEMD_PACKAGES = "${@bb.utils.contains('DISTRO_FEATURES','systemd','${PN}','',d)}"
SYSTEMD_SERVICE:${PN} = "moonraker.service"
SYSTEMD_AUTO_ENABLE = "enable"

do_compile() {
    echo "Skipping compilation, moonraker does not provide pep517 compliant python build"
}

# install moonraker source tree to /opt/moonraker
do_install() {
    install -d "${D}${INSTALL_DIR}"
    cp --preserve=mode,timestamps -R ${S}/* ${D}${INSTALL_DIR}

    # delete .git, .github
    rm -rf ${D}${INSTALL_DIR}/.git
    rm -rf ${D}${INSTALL_DIR}/.github

    if [ "${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)}" ]; then
        install -d "${D}${systemd_system_unitdir}"
        install -m 0644 "${WORKDIR}/moonraker.service" "${D}${systemd_system_unitdir}/moonraker.service"
    fi
}

RDEPENDS:${PN}-scripts = "\
    bash \
    python3-core \
"

FILES:${PN} = "${INSTALL_DIR}/moonraker*"
FILES:${PN}-test = "${INSTALL_DIR}/tests/*"
FILES:${PN}-scripts = "${INSTALL_DIR}/scripts/*"
FILES:${PN}-docs = "${INSTALL_DIR}/docs/*"
FILES:${PN}-extra= "${INSTALL_DIR}/*"

# NOTE: package ordering is import here! Packages are processed in left -> right order
PACKAGES = "${PN} ${PN}-scripts ${PN}-test ${PN}-docs ${PN}-extra"
