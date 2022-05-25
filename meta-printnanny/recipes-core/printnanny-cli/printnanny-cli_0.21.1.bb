DESCRIPTION = "PrintNanny OS embedded tools"
HOMEPAGE = "https://printnanny.ai/"
LICENSE = "AGPLv3+"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"
SRC_URI = "https://github.com/bitsy-ai/printnanny-cli/releases/download/v${PV}/printnanny-${BUILD_ARCH}-unknown-linux-gnu.tar.gz;name=cli \
    https://github.com/bitsy-ai/printnanny-cli/releases/download/v${PV}/printnanny-${BUILD_ARCH}-unknown-linux-gnu.tar.gz;name=wwwtemplates \
    https://raw.githubusercontent.com/bitsy-ai/printnanny-cli/main/LICENSE;name=license \
    file://printnanny-dash.service \
"
SRC_URI[license.sha256sum] = "c4a818ce2d5285465728ea933b6fa9ea6a1e3dd198cddcfb5c7c75d3c6258724"
SRC_URI[cli.sha256sum] = "084f4cc0ff1f8d4b5961c8cb940e25fb108398c4ce1bf517edda4292559d9181"
SRC_URI[wwwtemplates.sha256sum] = "084f4cc0ff1f8d4b5961c8cb940e25fb108398c4ce1bf517edda4292559d9181"

# SRC_REV = "0.21.1"

inherit systemd

FILES_${PN} += "${systemd_unitdir}/system/printnanny-dash.service"

do_install() {
  install -d ${D}/${systemd_unitdir}/system
  install -m 0644 ${WORKDIR}/printnanny-dash.service ${D}/${systemd_unitdir}/system
}

SYSTEMD_SERVICE:${PN} = "printnanny-dash.service"
SYSTEMD_AUTO_ENABLE = "enable"
