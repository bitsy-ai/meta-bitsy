SUMMARY = "Syncthing"
HOMEPAGE = "https://syncthing.net/"
DESCRIPTION = "Syncthing is a continuous file synchronization program. It synchronizes files between two or more computers in real time, safely protected from prying eyes."
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MPL-2.0;md5=815ca599c9df247a0c7f619bab123dad"

SRC_URI = "\
    https://github.com/syncthing/syncthing/releases/download/v${PV}/syncthing-linux-${SYNCTHING_TARGET_ARCH}-v${PV}.tar.gz \
    file://syncthing.locations \
"
SRC_URI[sha256sum] = "5eeda7b2119a3da01271633878ace763869ace26bfa598e6f02a6d7987ca1cd7"

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

S = "${WORKDIR}/syncthing-linux-${SYNCTHING_TARGET_ARCH}-v${PV}"

inherit systemd

SYNCTHING_SERVICE ??= "default"

SYSTEMD_PACKAGES = "${@bb.utils.contains('DISTRO_FEATURES','systemd','${PN}','',d)}"
SYSTEMD_SERVICE:${PN} += "${@bb.utils.contains('PACKAGECONFIG', 'systemd', 'syncthing-resume.service syncthing@${SYNCTHING_SERVICE}.service', '', d)}"

do_install() {
    install -d "${D}${bindir}"
    install -m 0755 "${S}/syncthing" "${D}${bindir}/syncthing"
    if [ "${@bb.utils.filter('DISTRO_FEATURES', 'nginx', d)}" ]; then
        install -d "${D}${sysconfdir}/nginx/conf.d/"
        install -m 0644 "${WORKDIR}/syncthing.locations" "${D}${sysconfdir}/nginx/conf.d/syncthing.locations"
    fi
    if [ "${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)}" ]; then
        install -d "${D}${systemd_unitdir}/user"
        install -d "${D}${systemd_system_unitdir}"

        install -m 0644 "${S}/etc/linux-systemd/system/syncthing-resume.service" "${D}${systemd_system_unitdir}/syncthing-resume.service"
        install -m 0644 "${S}/etc/linux-systemd/system/syncthing@.service" "${D}${systemd_system_unitdir}/syncthing@.service"
        install -m 0644 "${S}/etc/linux-systemd/user/syncthing.service" "${D}${systemd_unitdir}/user/syncthing.service"

    fi
}

FILES:${PN} = "${bindir}/* ${systemd_unitdir}/*"
FILES:${PN}-nginx = "${sysconfdir}/nginx/conf.d/*"

PACKAGES += "${PN}-nginx"
