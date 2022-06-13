DESCRIPTION = "PrintNanny OS embedded tools"
HOMEPAGE = "https://printnanny.ai/"
LICENSE = "AGPLv3+"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"

SRC_URI = "\
  file://getty@tty1.service.d/ \
  file://bitsy-growfs.service \
  file://bitsy-growfs.sh \
  file://bitsy-overlayfs-all.service.in \
  file://bitsy-overlayfs-create-dirs.service.in \
  file://bitsy-overlayfs-unit.mount.in \
"

PV = "r0"
inherit overlayfs
# inherit systemd

OVERLAYFS_CREATE_DIRS_TEMPLATE = "${WORKDIR}/bitsy-overlayfs-create-dirs.service.in"
OVERLAYFS_MOUNT_UNIT_TEMPLATE = "${WORKDIR}/bitsy-overlayfs-unit.mount.in"
OVERLAYFS_ALL_OVERLAYS_TEMPLATE = "${WORKDIR}/bitsy-overlayfs-all.service.in"

OVERLAYFS_MOUNT_POINT[home] = "/data/home"
OVERLAYFS_WRITABLE_PATHS[home] = "/home"

do_install:append() {
  install -d ${D}${sysconfdir}/bitsy
  install -d ${D}${systemd_system_unitdir}/getty@tty1.service.d/
  install -d ${D}${systemd_system_unitdir}/sysinit.target.wants/
  install -d ${D}${sbindir}
  install -m 0644 ${WORKDIR}/getty@tty1.service.d/50-noclear.conf ${D}${systemd_system_unitdir}/getty@tty1.service.d/50-noclear.conf
  install -m 0755 ${WORKDIR}/bitsy-growfs.sh ${D}${sbindir}/bitsy-growfs
}

FILES:${PN} = "${systemd_system_unitdir}/* ${sysconfdir}/* ${sbindir}/*"
# overlayfs class creates *-create-upper-dir.service, *.mount, and ${PN}-overlays.service
# SYSTEMD_SERVICE:${PN}:append = " bitsy-growfs.service"
# SYSTEMD_AUTO_ENABLE = "enable"
