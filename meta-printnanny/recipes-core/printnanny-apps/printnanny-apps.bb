DESCRIPTION = "PrintNanny OS services"
HOMEPAGE = "https://printnanny.ai/"
LICENSE = "AGPL-3.0-or-later"

LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"
SRC_URI = " \
    file://printnanny-cloud-sync.service \
    file://printnanny-dash.service \
    file://printnanny-init.service \
    file://printnanny-link-confd.sh \
    file://printnanny-motd.service \
    file://printnanny-nats.service \
    file://printnanny-online.service \
    file://printnanny-online.target \
    file://Rocket.toml \
    file://dev.toml \
"

RDEPENDS:${PN} += "printnanny-cli"

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
  install -m 0644 "${WORKDIR}/printnanny-cloud-sync.service" "${D}${systemd_system_unitdir}/printnanny-cloud-sync.service"
  install -m 0644 "${WORKDIR}/printnanny-dash.service" "${D}${systemd_system_unitdir}/printnanny-dash.service"
  install -m 0644 "${WORKDIR}/printnanny-init.service" "${D}${systemd_system_unitdir}/printnanny-init.service"
  install -m 0644 "${WORKDIR}/printnanny-motd.service" "${D}${systemd_system_unitdir}/printnanny-motd.service"
  install -m 0644 "${WORKDIR}/printnanny-nats.service" "${D}${systemd_system_unitdir}/printnanny-nats.service"
  install -m 0644 "${WORKDIR}/printnanny-online.service" "${D}${systemd_system_unitdir}/printnanny-online.service"
  install -m 0644 "${WORKDIR}/printnanny-online.target" "${D}${systemd_system_unitdir}/printnanny-online.target"
  install -m 0644 "${WORKDIR}/dev.toml" "${D}${sysconfdir}/printnanny"
  install -m 0755 "${WORKDIR}/printnanny-link-confd.sh" "${D}${bindir}/printnanny-link-confd"
}
FILES:${PN} = "${datadir} ${sysconfdir} ${bindir}/* ${systemd_unitdir}/*"

SYSTEMD_SERVICE:${PN} = "\
  printnanny-dash.service \
  printnanny-cloud-sync.service \
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
