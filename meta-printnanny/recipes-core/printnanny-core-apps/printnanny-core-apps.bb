DESCRIPTION = "PrintNanny Edge Services"
HOMEPAGE = "https://printnanny.ai/"
LICENSE = "AGPL-3.0-or-later"

LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"

inherit systemd

SRC_URI = " \
    file://printnanny-motd.service \
    file://printnanny-edge-nats.service \
"

do_install() {
  install -d "${D}${systemd_system_unitdir}"
  install -m 0644 "${WORKDIR}/printnanny-motd.service" "${D}${systemd_system_unitdir}/printnanny-motd.service"
  install -m 0644 "${WORKDIR}/printnanny-edge-nats.service" "${D}${systemd_system_unitdir}/printnanny-edge-nats.service"
  install -m 0644 "${WORKDIR}/printnanny-setting.service" "${D}${systemd_system_unitdir}/printnanny-setting.service"
}

SYSTEMD_SERVICE:${PN} = "\
  printnanny-motd.service \
  printnanny-edge-nats.service \
  printnanny-settings..service \
"

SYSTEMD_AUTO_ENABLE = "enable"


FILES:${PN} = "${systemd_system_unitdir}/*"
