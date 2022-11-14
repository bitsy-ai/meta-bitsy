
SUMMARY = "Klipper is a 3d-Printer firmware"
HOMEPAGE = "https://www.klipper3d.org/"
LICENSE = "GPL-3.0-or-later"

SRC_URI = "\
    git://github.com/Klipper3d/klipper;protocol=ssh;nobranch=1;branch=master \
    file://klipper.service \
    file://klipper-venv.service \
"
SRCREV = "97a5b39aab9bb61aaf2181760886033a569626f7"
SRC_URI[sha256sum] = "fcd9fd2de95ff7174dba58826e393eaf948bfcc430ce44cbfaabefe685295b86"

LIC_FILES_CHKSUM = "file://COPYING;md5=1ebbd3e34237af26da5dc08a4e440464"
S = "${WORKDIR}/git"


INSTALL_DIR = "/var/lib/klipper"

KLIPPER_USER ?= "printnanny"
inherit systemd

do_compile() {
    echo "Skipping compilation, requires user-provided printer.cfg"
    echo "WARNING, klipper does not provide pep517 compliant python build"
}

# install klipper source tree to /var/lib/klipper
do_install() {
    install -d "${D}${INSTALL_DIR}"
    cp --preserve=mode,timestamps -R ${S}/* ${D}${INSTALL_DIR}

    # delete .git, .github
    rm -rf ${D}${INSTALL_DIR}/.git
    rm -rf ${D}${INSTALL_DIR}/.github

    if [ "${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)}" ]; then
        install -d "${D}${systemd_system_unitdir}"
        install -m 0644 "${WORKDIR}/klipper-venv.service" "${D}${systemd_system_unitdir}/klipper-venv.service"
        install -m 0644 "${WORKDIR}/klipper.service" "${D}${systemd_system_unitdir}/klipper.service"
    fi
}

SYSTEMD_PACKAGES = "${@bb.utils.contains('DISTRO_FEATURES','systemd','${PN}','',d)}"
SYSTEMD_SERVICE:${PN} = "klipper.service"
SYSTEMD_SERVICE:${PN}-venv =  "klipper-venv.service"
SYSTEMD_AUTO_ENABLE:${PN} = "disable"
SYSTEMD_AUTO_ENABLE:${PN}-venv = "enable"

RDEPENDS:${PN} = "\
    python3 \
    python3-core \
    python3-pip \
    python3-cffi \
    python3-pyserial \
    python3-greenlet \
    python3-jinja2 \
    python3-can \
    python3-markupsafe \
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
    gcc \
"


RDEPENDS:${PN}-scripts = "\
    bash \
    python3-core \
"

RDEPENDS:${PN}-docs = "\
    bash \
"

FILES:${PN} = "\
    ${INSTALL_DIR}/src/* \
    ${INSTALL_DIR}/Makefile \
"

FILES:${PN}-venv = "${systemd_system_unitdir}/klipper-venv.service"
FILES:${PN}-examples = "${INSTALL_DIR}/config/*"
FILES:${PN}-klippy = "${INSTALL_DIR}/klippy/*"
FILES:${PN}-test = "${INSTALL_DIR}/test/*"
FILES:${PN}-scripts = "${INSTALL_DIR}/scripts/*"
FILES:${PN}-docs = "${INSTALL_DIR}/docs/*"
FILES:${PN}-extra = "${INSTALL_DIR}/*"

# NOTE: package ordering is import here! Packages are processed in left -> right order
PACKAGES = "${PN} ${PN}-venv ${PN}-klippy ${PN}-examples ${PN}-scripts ${PN}-tests ${PN}-docs ${PN}-extra"
