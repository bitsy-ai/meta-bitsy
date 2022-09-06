
SUMMARY = "Klipper is a 3d-Printer firmware"
HOMEPAGE = "https://www.klipper3d.org/"
LICENSE = "GPL-3.0-or-later"

SRC_URI = "\
    git://github.com/Klipper3d/klipper;protocol=ssh;nobranch=1;branch=master \
    file://klipper.service \
"
SRCREV = "97a5b39aab9bb61aaf2181760886033a569626f7"
SRC_URI[sha256sum] = "fcd9fd2de95ff7174dba58826e393eaf948bfcc430ce44cbfaabefe685295b86"

LIC_FILES_CHKSUM = "file://COPYING;md5=1ebbd3e34237af26da5dc08a4e440464"
S = "${WORKDIR}/git"


INSTALL_DIR = "/opt/klipper"

KLIPPER_USER ?= "printnanny"
inherit systemd

do_compile() {
    echo "Skipping compilation, requires user-provided printer.cfg"
    echo "WARNING, klipper does not provide pep517 compliant python build"
}

# install klipper source tree to /opt/klipper
do_install() {
    install -d "${D}${INSTALL_DIR}"
    cp --preserve=mode,timestamps -R ${S}/* ${D}${INSTALL_DIR}
    if [ "${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)}" ]; then
        install -d "${D}${systemd_system_unitdir}"
        install -m 0644 "${WORKDIR}/klipper.service" "${D}${systemd_system_unitdir}/klipper.service"
    fi
}

SYSTEMD_PACKAGES = "${@bb.utils.contains('DISTRO_FEATURES','systemd','${PN}','',d)}"
SYSTEMD_SERVICE:${PN} = "klipper.service"
SYSTEMD_AUTO_ENABLE = "enable"

RDEPENDS:${PN} = "\
    python3 \
    python3-core \
    python3-pip \
    python3-cffi \
    python3-pyserial \
    python3-greenlet \
    python3-jinja2 \
    libusb1 \
    stm32flash \
    avr-gcc \
    avr-binutils \
    avr-libc \
    avrdude \
    bash \
    zlib \
    expat \
    glibc \
"

FILES:${PN} = "\
    ${INSTALL_DIR}/src/* \
    ${INSTALL_DIR}/Makefile
"
FILES:${PN}-klippy = "${INSTALL_DIR}/klippy/*"
FILES:${PN}-test = "${INSTALL_DIR}/test/*"
FILES:${PN}-scripts = "${INSTALL_DIR}/scripts/*"
FILES:${PN}-docs = "${INSTALL_DIR}/docs/*"
FILES:${PN}-extra= "${INSTALL_DIR}/*"

# NOTE: package ordering is import here! Packages are processed in left -> right order
PACKAGES = "${PN} ${PN}-klippy ${PN}-scripts ${PN}-tests ${PN}-docs ${PN}-extra"
