DESCRIPTION = "PrintNanny OS embedded tools"
HOMEPAGE = "https://printnanny.ai/"
LICENSE = "AGPL-3.0-or-later"

LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"
SRC_URI = " \
    file://printnanny-cam.service \
    file://printnanny-dash.service \
    file://printnanny-sync.service \
    file://printnanny-nats.service \
    file://printnanny-vision.service \
    file://printnanny-online.service \
    file://printnanny-motd.service \
    file://printnanny-online.target \
    file://printnanny-link-confd.sh \
    file://Rocket.toml \
    file://dev.toml \
"

SRC_URI[gtsltsr.sha256sum] = "0a76f50ae47b05d9a85954a1de9bc0b936bcd212911bcbfa650030072d17d946"
SRC_URI[GSR4.sha256sum] = "bec94911c2955676db6c0a550986d76e3ba005667c442c9762b4fbb773de228c"

RDEPENDS:${PN} += "printnanny-cli printnanny-nn"

inherit systemd

do_install() {
  install -d "${D}${sysconfdir}/ca-certificates"
  install -d "${D}${systemd_system_unitdir}"
  install -d "${D}${datadir}/printnanny"
  install -d "${D}${sysconfdir}/printnanny/dash"
  install -d "${D}${sysconfdir}/printnanny/conf.d"
  install -d "${D}${sysconfdir}/systemd/system/printnanny-dash.service.d"
  install -d "${D}${sysconfdir}/systemd/system/printnanny-nats.service.d"
  install -d "${D}${bindir}"
  install -m 0644 "${WORKDIR}/Rocket.toml" "${D}${sysconfdir}/printnanny/dash/Rocket.toml"
  install -m 0644 "${WORKDIR}/printnanny-cam.service" "${D}${systemd_system_unitdir}/printnanny-cam.service"
  install -m 0644 "${WORKDIR}/printnanny-motd.service" "${D}${systemd_system_unitdir}/printnanny-motd.service"
  install -m 0644 "${WORKDIR}/printnanny-vision.service" "${D}${systemd_system_unitdir}/printnanny-vision.service"
  install -m 0644 "${WORKDIR}/printnanny-dash.service" "${D}${systemd_system_unitdir}/printnanny-dash.service"
  install -m 0644 "${WORKDIR}/printnanny-sync.service" "${D}${systemd_system_unitdir}/printnanny-sync.service"
  install -m 0644 "${WORKDIR}/printnanny-nats.service" "${D}${systemd_system_unitdir}/printnanny-nats.service"
  install -m 0644 "${WORKDIR}/printnanny-online.service" "${D}${systemd_system_unitdir}/printnanny-online.service"
  install -m 0644 "${WORKDIR}/printnanny-online.target" "${D}${systemd_system_unitdir}/printnanny-online.target"
  install -m 0644 "${WORKDIR}/dev.toml" "${D}${sysconfdir}/printnanny"
  install -m 0755 "${WORKDIR}/printnanny-link-confd.sh" "${D}${bindir}/printnanny-link-confd"
}
FILES:${PN} = "${datadir} ${sysconfdir} ${bindir}/* ${systemd_unitdir}/*"

SYSTEMD_SERVICE:${PN} = "\
  printnanny-vision.service \
  printnanny-cam.service \
  printnanny-dash.service \
  printnanny-sync.service \
  printnanny-motd.service \
  printnanny-nats.service \
  printnanny-online.service \
  printnanny-online.target \
"
SYSTEMD_AUTO_ENABLE = "enable"

RDEPENDS:${PN}-nginx = "${PN} nginx"

inherit overlayfs

OVERLAYFS_MOUNT_POINT[printnanny] = "/data"
OVERLAYFS_WRITABLE_PATHS[printnanny] = "/etc/printnanny"
OVERLAYFS_QA_SKIP[printnanny] = "mount-configured"
