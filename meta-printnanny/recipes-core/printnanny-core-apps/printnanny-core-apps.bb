DESCRIPTION = "PrintNanny Edge Services"
HOMEPAGE = "https://printnanny.ai/"
LICENSE = "AGPL-3.0-or-later"

LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"

inherit systemd

SRC_URI = " \
    file://printnanny-motd.service \
    file://printnanny-edge-nats.service \
    file://printnanny-settings.service \
    file://printnanny-init.service \
    file://printnanny-online.target \
    file://printnanny-shutdown.service \
"

#     file://printnanny-gstmultifile.service

do_install() {
  install -d "${D}${systemd_system_unitdir}"
  install -m 0644 "${WORKDIR}/printnanny-motd.service" "${D}${systemd_system_unitdir}/printnanny-motd.service"
  install -m 0644 "${WORKDIR}/printnanny-edge-nats.service" "${D}${systemd_system_unitdir}/printnanny-edge-nats.service"
  install -m 0644 "${WORKDIR}/printnanny-settings.service" "${D}${systemd_system_unitdir}/printnanny-settings.service"
  install -m 0644 "${WORKDIR}/printnanny-init.service" "${D}${systemd_system_unitdir}/printnanny-init.service"
  install -m 0644 "${WORKDIR}/printnanny-online.target" "${D}${systemd_system_unitdir}/printnanny-online.target"
  install -m 0644 "${WORKDIR}/printnanny-shutdown.service" "${D}${systemd_system_unitdir}/printnanny-shutdown.service"
}

#   install -m 0644 "${WORKDIR}/printnanny-gstmultifile.service" "${D}${systemd_system_unitdir}/printnanny-gstmultifile.service"

SYSTEMD_SERVICE:${PN} = "\
  printnanny-motd.service \
  printnanny-edge-nats.service \
  printnanny-settings.service \
  printnanny-init.service \
  printnanny-online.target \
  printnanny-shutdown.service \
"
# printnanny-gstmultifile.service 


SYSTEMD_AUTO_ENABLE = "enable"

RDEPENDS:${PN} = "\
  git \
  printnanny-cli \
  printnanny-nats-apps \
"

FILES:${PN} = "${systemd_system_unitdir}/*"
