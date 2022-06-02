DESCRIPTION = "PrintNanny OS embedded tools"
HOMEPAGE = "https://printnanny.ai/"
LICENSE = "AGPLv3+"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"

SRC_URI = "\
  file://getty@tty1.service.d/ \
"

PV = "r0"
inherit systemd

# default TTY behavior will clear the screen before spawning a login prompt
# the following conf retains boot messages on tty1
do_install() {
  install -d "${D}${systemd_system_unitdir}/getty@tty1.service.d/"
  install -m 0644 "${WORKDIR}/getty@tty1.service.d/50-noclear.conf" "${D}${systemd_system_unitdir}/getty@tty1.service.d/50-noclear.conf"
}
FILES:${PN} = "${systemd_system_unitdir}"
