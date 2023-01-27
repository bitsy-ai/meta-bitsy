DESCRIPTION = "PrintNanny OS camera & vision services"
HOMEPAGE = "https://printnanny.ai/"
LICENSE = "AGPL-3.0-or-later"

LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"

SRC_URI = " \
  file://printnanny-vision.service \
  file://printnanny-vision.target \
"


do_install() {
    install -d "${D}${systemd_system_unitdir}"
    install -m 0644 "${WORKDIR}/printnanny-vision.target" "${D}${systemd_system_unitdir}/printnanny-vision.target"
    install -m 0644 "${WORKDIR}/printnanny-vision.service" "${D}${systemd_system_unitdir}/printnanny-vision.service"
}

SYSTEMD_SERVICE:${PN} = "\
  printnanny-vision.service \
  printnanny-vision.target \
"

RDEPENDS:${PN} += "\
  printnanny-cli \
  printnanny-gst-plugin \
  printnanny-nn \
  gstd \
  gst-interpipes \
"

SYSTEMD_AUTO_ENABLE = "enable"

inherit systemd
