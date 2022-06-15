SUMMARY = "Mount overlayfs on read-only rootfs"
DESCRIPTION = "The purpose is to make /etc read writeable"
LICENSE = "AGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"

SECTION = "base"

PV = "0.1"

SRC_URI = " \
    file://home.mount \
    file://overlays-home-dirs.service \
"

inherit systemd

do_install () {
    install -d ${D}${systemd_system_unitdir}

    install -d ${D}/etc/ecs
    install -m 0644 ${WORKDIR}/home.mount ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/overlays-home-dirs.service ${D}${systemd_system_unitdir}
}

SYSTEMD_SERVICE:${PN} = "home.mount overlays-home-dirs.service"
