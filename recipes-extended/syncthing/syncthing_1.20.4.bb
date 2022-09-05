SUMMARY = "Syncthing"
HOMEPAGE = "https://syncthing.net/"
DESCRIPTION = "Syncthing is a continuous file synchronization program. It synchronizes files between two or more computers in real time, safely protected from prying eyes."
LICENSE = ""
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MPL-2.0"

SYNCTHING_TARGET_ARCH:raspberrypi = "arm"
SYNCTHING_TARGET_ARCH:raspberrypi0 = "arm"
SYNCTHING_TARGET_ARCH:raspberrypi0-wifi = "arm"
SYNCTHING_TARGET_ARCH:raspberrypi-cm = "arm"
SYNCTHING_TARGET_ARCH:raspberrypi2 = "arm"
SYNCTHING_TARGET_ARCH:raspberryp3 = "arm"
SYNCTHING_TARGET_ARCH:raspberrypi4 = "arm"

SYNCTHING_TARGET_ARCH:raspberrypi0-2w-64 = "arm64"
SYNCTHING_TARGET_ARCH:raspberrypi3-64 = "arm64"
SYNCTHING_TARGET_ARCH:raspberrypi4-64 = "arm64"

SYNCTHING_TARGET_ARCH:riscv64 = "riscv64"

inherit systemd

SRC_URI = "\
    https://github.com/syncthing/syncthing/releases/download/v${PV}/syncthing-linux-${SYNCTHING_TARGET_ARCH}-v${PV}.tar.gz \
    file://syncthing.location \
    file://syncthing@.service \
"

SYNCTHING_SERVICE ??= "default"
PACKAGECONFIG ??= "${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)}"
PACKAGECONFIG[systemd] = "--with-systemd,--without-systemd,systemd"

SYSTEMD_PACKAGES = "${@bb.utils.contains('DISTRO_FEATURES','systemd','${PN}','',d)}"
SYSTEMD_SERVICE:${PN} += "${@bb.utils.contains('PACKAGECONFIG', 'systemd', 'syncthing@${SYNCTHING_SERVICE}.service', '', d)}"

do_install() {
    install -d "${D}${bindir}"
    install -m 0755 "${WORKDIR}/syncthing" "${D}${bindir}/syncthing"
}

FILES:${PN} = "${bindir}/*"
