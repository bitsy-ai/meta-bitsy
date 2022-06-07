DESCRIPTION = "PrintNanny OS embedded tools"
HOMEPAGE = "https://printnanny.ai/"
LICENSE = "AGPLv3+"

PV = "0.22.0-rc.4"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"
SRC_URI = "https://github.com/bitsy-ai/printnanny-cli/releases/download/v${PV}/printnanny-${TARGET_ARCH}-unknown-linux-gnu.tar.gz;name=cli \
    https://github.com/bitsy-ai/printnanny-cli/releases/download/v${PV}/printnanny-www-templates.tar.gz;name=wwwtemplates;subdir=www \
    https://raw.githubusercontent.com/bitsy-ai/printnanny-cli/main/LICENSE;name=license \
    file://printnanny-dash.service \
    file://printnanny-mqtt.service \
    file://printnanny-generator.sh \
    file://Rocket.toml \
    file://dev.toml \
"

SRC_URI[license.sha256sum] = "c4a818ce2d5285465728ea933b6fa9ea6a1e3dd198cddcfb5c7c75d3c6258724"
SRC_URI[cli.sha256sum] = "da2f98273f495a0318938d0ed86e5da31f01a0804edb4445d886c31806708f15"
SRC_URI[wwwtemplates.sha256sum] = "2fd434c9fe65d21f93f15758f588d917902e6888865888bca5e83da37eac0173"

inherit systemd

do_install() {
  install -d "${D}${systemd_system_unitdir}"
  install -d "${D}${datadir}/printnanny"
  install -d "${D}${bindir}"
  install -d "${D}${sysconfdir}/printnanny/dash"
  install -d "${D}${sysconfdir}/printnanny/printnanny.d"
  install -d "${D}${systemd_unitdir}/system-generators"
  install -d "${D}${sysconfdir}/systemd/system/printnanny-dash.service.d"
  install -d "${D}${sysconfdir}/systemd/system/printnanny-mqtt.service.d"

  cp -R --no-dereference --preserve=mode,links -v "${WORKDIR}/www" "${D}${datadir}/printnanny"
  install -m 0644 "${WORKDIR}/printnanny-dash.service" "${D}${systemd_system_unitdir}/printnanny-dash.service"
  install -m 0644 "${WORKDIR}/Rocket.toml" "${D}${sysconfdir}/printnanny/dash/Rocket.toml"

  install -m 0644 "${WORKDIR}/printnanny-mqtt.service" "${D}${systemd_system_unitdir}/printnanny-mqtt.service"
  install -m 0755 "${WORKDIR}/printnanny-cli" "${D}${bindir}/printnanny-cli"
  install -m 0755 "${WORKDIR}/printnanny-dash" "${D}${bindir}/printnanny-dash"
  ln -s -r ${D}/${bindir}/printnanny-cli ${D}/${bindir}/printnanny
  ln -s -r ${D}/${bindir}/printnanny-cli ${D}/${bindir}/pn
  install -m 0755 "${WORKDIR}/printnanny-generator.sh" "${D}${systemd_unitdir}/system-generators/printnanny-generator"
  install -m 0755 "${WORKDIR}/dev.toml" "${D}${sysconfdir}/printnanny"
}

FILES:${PN} = "${datadir}/* ${bindir}/* ${sysconfdir}/*"
FILES:${PN}-systemd = "${systemd_unitdir}/*"
RDEPENDS:${PN}-systemd += " ${PN}"

SYSTEMD_SERVICE:${PN} = "printnanny-dash.service printnanny-mqtt.service"
SYSTEMD_AUTO_ENABLE = "enable"

inherit extrausers
PRINTNANNY_USER ?= "printnanny"
EXTRA_USERS_PARAMS = " useradd ${PRINTNANNY_USER}; \
    usermod  -a -G sudo ${PRINTNANNY_USER};"

RDEPENDS:${PN}-nginx = "${PN} nginx"

PACKAGES += "${PN}-systemd"
