DESCRIPTION = "PrintNanny OS embedded tools"
HOMEPAGE = "https://printnanny.ai/"
LICENSE = "AGPL-3.0-or-later"

LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"
SRC_URI = " \
    file://printnanny-dash.service \
    file://printnanny-mqtt.service \
    file://printnanny-generator.sh \
    file://Rocket.toml \
    file://dev.toml \
"

RDEPENDS:${PN} += "printnanny-cli"

inherit systemd useradd
# You must set USERADD_PACKAGES when you inherit useradd. This
# lists which output packages will include the user/group
# creation code.
USERADD_PACKAGES = "printnanny-user"

# You must also set USERADD_PARAM and/or GROUPADD_PARAM when
# you inherit useradd.
GROUPADD_PARAM:printnanny-user = "i2c; netdev; video; spi"
USERADD_PARAM:printnanny-user = "-r -U -s /bin/bash -m -d /home/printnanny -G adm,dialout,i2c,input,netdev,plugdev,spi,sudo,video printnanny"

do_install() {
  install -d "${D}${systemd_system_unitdir}"
  install -d "${D}${datadir}/printnanny"
  install -d "${D}${sysconfdir}/printnanny/dash"
  install -d "${D}${sysconfdir}/printnanny/printnanny.d"
  install -d "${D}${systemd_unitdir}/system-generators"
  install -d "${D}${sysconfdir}/systemd/system/printnanny-dash.service.d"
  install -d "${D}${sysconfdir}/systemd/system/printnanny-mqtt.service.d"
  install -m 0644 "${WORKDIR}/printnanny-dash.service" "${D}${systemd_system_unitdir}/printnanny-dash.service"
  install -m 0644 "${WORKDIR}/Rocket.toml" "${D}${sysconfdir}/printnanny/dash/Rocket.toml"
  install -m 0644 "${WORKDIR}/printnanny-mqtt.service" "${D}${systemd_system_unitdir}/printnanny-mqtt.service"
  install -m 0755 "${WORKDIR}/printnanny-generator.sh" "${D}${systemd_unitdir}/system-generators/printnanny-generator"
  install -m 0755 "${WORKDIR}/dev.toml" "${D}${sysconfdir}/printnanny"
}

FILES:${PN} = "${datadir} ${sysconfdir}"

FILES:${PN}-systemd = "${systemd_unitdir}/*"
RDEPENDS:${PN}-systemd += " ${PN}"

SYSTEMD_SERVICE:${PN} = "printnanny-dash.service printnanny-mqtt.service"
SYSTEMD_AUTO_ENABLE = "enable"

RDEPENDS:${PN}-nginx = "${PN} nginx"

PACKAGES += "${PN}-systemd printnanny-user"
