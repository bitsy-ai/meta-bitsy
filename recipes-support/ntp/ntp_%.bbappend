
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "\
    file://ntp-wait.service \
"

do_install:append(){
    install -m 0644 ${WORKDIR}/ntp-wait.service ${D}${systemd_unitdir}/system/
}

PACKAGES += "${PN}-wait"
FILES:${PN}-wait = "${systemd_unitdir}/system/ntp-wait.service"

SYSTEMD_PACKAGES += "ntp-wait"
SYSTEMD_SERVICE:${PN}-wait = "ntp-wait.service"

RDEPENDS:${PN}-wait += "perl perl-module-cpan ${PN}-utils"
RPROVIDES:${PN}-wait += "ntp-wait"
