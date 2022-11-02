
SUMMARY = "Moonraker - API Web Server for Klipper"
HOMEPAGE = "https://github.com/Arksine/moonraker"
LICENSE = "GPL-3.0-or-later"

SRC_URI = "\
    git://github.com/Arksine/moonraker/;protocol=ssh;nobranch=1;branch=master \
    file://moonraker.conf \
    file://moonraker.service \
    file://moonraker-venv.service \
"
SRCREV = "779997c2b8aa1df2b484440ef1d3a6b09058fcff"

LIC_FILES_CHKSUM = "file://LICENSE;md5=db95b6e40dc7d26d8308b6b7375637b6"
S = "${WORKDIR}/git"

R = "1"

inherit systemd

RDEPENDS:${PN} = "\
    python3 \
    python3-dbus-next \
    python3-core \
    python3-pip \
    python3-tornado \
    python3-pyserial \
    python3-pyserial-asyncio \
    python3-pillow \
    python3-lmdb \
    python3-streaming-form-data \
    python3-inotify-simple \
    python3-libnacl \
    python3-distro \
    python3-paho-mqtt \
    python3-pycurl \
    python3-zeroconf \
    python3-preprocess-cancellation \
    python3-jinja2 \
    python3-ldap3 \
    python3-apprise \
    curl \
    libsodium \
    zlib \
    jpeg \
    libgpiod \
    bash \
"

INSTALL_DIR ?= "/var/lib/moonraker"
MOONRAKER_VENV ?= "${INSTALL_DIR}/.venv"

PRINTNANNY_USER ?= "printnanny"

do_compile() {
    echo "Skipping compilation, moonraker does not provide pep517 compliant python build"
}

# install moonraker source tree to /var/lib/klipper
do_install() {
    install -d "${D}${INSTALL_DIR}/config"
    cp --preserve=mode,timestamps -R ${S}/* ${D}${INSTALL_DIR}

    # delete .git, .github
    rm -rf ${D}${INSTALL_DIR}/.git
    rm -rf ${D}${INSTALL_DIR}/.github
    install -m 0644 "${WORKDIR}/moonraker.conf" "${D}${INSTALL_DIR}/config/moonraker.conf"
    if [ "${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)}" ]; then
        install -d "${D}${systemd_system_unitdir}"
        install -m 0644 "${WORKDIR}/moonraker.service" "${D}${systemd_system_unitdir}/moonraker.service"
        install -m 0644 "${WORKDIR}/moonraker-venv.service" "${D}${systemd_system_unitdir}/moonraker-venv.service"
    fi
}

RDEPENDS:${PN}-scripts = "\
    bash \
    python3-core \
"

SYSTEMD_PACKAGES = "${@bb.utils.contains('DISTRO_FEATURES','systemd','${PN}','',d)}"
SYSTEMD_SERVICE:${PN} = "moonraker.service moonraker-venv.service"
SYSTEMD_AUTO_ENABLE = "enable"

FILES:${PN} = "${INSTALL_DIR}/moonraker/* ${INSTALL_DIR}/config/*"
FILES:${PN}-test = "${INSTALL_DIR}/tests/*"
FILES:${PN}-scripts = "${INSTALL_DIR}/scripts/*"
FILES:${PN}-docs = "${INSTALL_DIR}/docs/*"
FILES:${PN}-extra= "${INSTALL_DIR}/*"

# NOTE: package ordering is import here! Packages are processed in left -> right order
PACKAGES = "${PN} ${PN}-scripts ${PN}-test ${PN}-docs ${PN}-extra"
