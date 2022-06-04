DESCRIPTION = "PrintNanny OS embedded tools"
HOMEPAGE = "https://printnanny.ai/"
LICENSE = "AGPLv3+"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"
SRC_URI = "https://github.com/bitsy-ai/printnanny-cli/releases/download/v${PV}/printnanny-${TARGET_ARCH}-unknown-linux-gnu.tar.gz;name=cli \
    https://github.com/bitsy-ai/printnanny-cli/releases/download/v${PV}/printnanny-www-templates.tar.gz;name=wwwtemplates;subdir=www \
    https://raw.githubusercontent.com/bitsy-ai/printnanny-cli/main/LICENSE;name=license \
    file://printnanny-dash.service \
    file://printnanny-mqtt.service \
    file://printnanny-generator.sh \
"

SRC_URI[license.sha256sum] = "c4a818ce2d5285465728ea933b6fa9ea6a1e3dd198cddcfb5c7c75d3c6258724"
SRC_URI[cli.sha256sum] = "91a98d8efa9e65ed21ecb12c0c32c38fe7a611b189908a155bf02aa8c317dc2d"
SRC_URI[wwwtemplates.sha256sum] = "ee0828e3fd6b2ba452560cf0669e7b0661a81dd0eb820bc8b12ff3292696aa17"
inherit systemd

do_install() {
  install -d "${D}${systemd_system_unitdir}"
  install -d "${D}${datadir}/printnanny"
  install -d "${D}${bindir}"
  install -d "${D}${systemd_unitdir}/system-generators"
  cp -R --no-dereference --preserve=mode,links -v "${WORKDIR}/www" "${D}${datadir}/printnanny"
  install -m 0644 "${WORKDIR}/printnanny-dash.service" "${D}${systemd_system_unitdir}/printnanny-dash.service"
  install -m 0644 "${WORKDIR}/printnanny-mqtt.service" "${D}${systemd_system_unitdir}/printnanny-mqtt.service"
  install -m 0755 "${WORKDIR}/printnanny-cli" "${D}${bindir}/printnanny-cli"
  install -m 0755 "${WORKDIR}/printnanny-dash" "${D}${bindir}/printnanny-dash"
  ln -s -r ${D}/${bindir}/printnanny-cli ${D}/${bindir}/printnanny
  ln -s -r ${D}/${bindir}/printnanny-cli ${D}/${bindir}/pn
  install -m 0755 "${WORKDIR}/printnanny-generator.sh" "${D}${systemd_unitdir}/system-generators/printnanny-generator"
}

FILES:${PN} = "${datadir}/* ${bindir}/*"
FILES:${PN}-systemd = "${systemd_unitdir}/*"
RDEPENDS:${PN}-systemd += " ${PN}"
PACKAGES += "${PN}-systemd"

SYSTEMD_SERVICE:${PN} = "printnanny-dash.service printnanny-mqtt.service"
SYSTEMD_AUTO_ENABLE = "enable"

inherit extrausers
PRINTNANNY_USER ?= "printnanny"
EXTRA_USERS_PARAMS = " useradd ${PRINTNANNY_USER}; \
    usermod  -a -G sudo ${PRINTNANNY_USER};"
