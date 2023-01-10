DESCRIPTION = "PrintNanny Cloud Services"
HOMEPAGE = "https://printnanny.ai/"
LICENSE = "AGPL-3.0-or-later"

LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"
SRC_URI = " \
    file://printnanny-cloud-sync.service \
    file://printnanny-cloud-nats.service \
    file://printnanny-cloud.target \
    file://printnanny-boot-report.sh \
"

RDEPENDS:${PN} += "printnanny-cli"

inherit systemd

do_install() {
  install -d "${D}${systemd_system_unitdir}"
  install -d "${D}${datadir}/printnanny"
  install -d "${D}${sysconfdir}/printnanny/conf.d"
  install -d "${D}${sysconfdir}/systemd/system/printnanny-nats.service.d"
  install -d "${D}${bindir}"
  install -m 0644 "${WORKDIR}/printnanny-cloud-nats.service" "${D}${systemd_system_unitdir}/printnanny-cloud-nats.service"
  install -m 0644 "${WORKDIR}/printnanny-cloud-sync.service" "${D}${systemd_system_unitdir}/printnanny-cloud-sync.service"
  install -m 0644 "${WORKDIR}/printnanny-cloud.target" "${D}${systemd_system_unitdir}/printnanny-cloud.target"
  install -m 0755 "${WORKDIR}/printnanny-boot-report.sh" "${D}${bindir}/printnanny-boot-report"
}
FILES:${PN} = "${datadir} ${sysconfdir} ${bindir}/* ${systemd_unitdir}/*"

RDEPENDS:${PN} = "bash"

SYSTEMD_SERVICE:${PN} = "\
  printnanny-cloud.target \
  printnanny-cloud-nats.service \
  printnanny-cloud-sync.service \
"
SYSTEMD_AUTO_ENABLE = "enable"

RDEPENDS:${PN}-nginx = "${PN} nginx"
