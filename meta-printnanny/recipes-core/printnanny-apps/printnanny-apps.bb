DESCRIPTION = "PrintNanny OS embedded tools"
HOMEPAGE = "https://printnanny.ai/"
LICENSE = "AGPL-3.0-or-later"

LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"
SRC_URI = " \
    https://pki.goog/gtsltsr/gtsltsr.crt;name=gtsltsr \
    https://pki.goog/gsr4/GSR4.crt;name=GSR4 \
    file://printnanny-dash.service \
    file://printnanny-license.service \
    file://printnanny-mqtt.service \
    file://printnanny-online.target \
    file://printnanny-generator.sh \
    file://Rocket.toml \
    file://dev.toml \
"

SRC_URI[gtsltsr.sha256sum] = "0a76f50ae47b05d9a85954a1de9bc0b936bcd212911bcbfa650030072d17d946"
SRC_URI[GSR4.sha256sum] = "bec94911c2955676db6c0a550986d76e3ba005667c442c9762b4fbb773de228c"

RDEPENDS:${PN} += "printnanny-cli"

inherit systemd

do_install() {
  install -d "${D}${sysconfdir}/ca-certificates"
  install -d "${D}${systemd_system_unitdir}"
  install -d "${D}${datadir}/printnanny"
  install -d "${D}${sysconfdir}/printnanny/dash"
  install -d "${D}${sysconfdir}/printnanny/conf.d"
  install -d "${D}${systemd_unitdir}/system-generators"
  install -d "${D}${sysconfdir}/systemd/system/printnanny-dash.service.d"
  install -d "${D}${sysconfdir}/systemd/system/printnanny-mqtt.service.d"
  install -m 0644 "${WORKDIR}/Rocket.toml" "${D}${sysconfdir}/printnanny/dash/Rocket.toml"
  install -m 0644 "${WORKDIR}/printnanny-dash.service" "${D}${systemd_system_unitdir}/printnanny-dash.service"
  install -m 0644 "${WORKDIR}/printnanny-license.service" "${D}${systemd_system_unitdir}/printnanny-license.service"
  install -m 0644 "${WORKDIR}/printnanny-mqtt.service" "${D}${systemd_system_unitdir}/printnanny-mqtt.service"
  install -m 0644 "${WORKDIR}/printnanny-online.target" "${D}${systemd_system_unitdir}/printnanny-online.target"
  install -m 0755 "${WORKDIR}/printnanny-generator.sh" "${D}${systemd_unitdir}/system-generators/printnanny-generator"
  install -m 0755 "${WORKDIR}/dev.toml" "${D}${sysconfdir}/printnanny"
  install -m 0644 "${WORKDIR}/gtsltsr.crt" "${D}${sysconfdir}/ca-certificates/gtsltsr.crt"
  install -m 0644 "${WORKDIR}/GSR4.crt" "${D}${sysconfdir}/ca-certificates/GSR4.crt"
}
FILES:${PN} = "${datadir} ${sysconfdir}"

FILES:${PN}-systemd = "${systemd_unitdir}/*"
RDEPENDS:${PN}-systemd += " ${PN}"

SYSTEMD_SERVICE:${PN} = "\
  printnanny-dash.service \
  printnanny-license.service \
  printnanny-mqtt.service \
  printnanny-online.target \
"
SYSTEMD_AUTO_ENABLE = "enable"

RDEPENDS:${PN}-nginx = "${PN} nginx"

PACKAGES += "${PN}-systemd"
