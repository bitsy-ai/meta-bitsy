
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "\
    file://ntp-wait.service \
"

do_install:append(){
    install -m 0644 ${WORKDIR}/ntp-wait.service ${D}${systemd_unitdir}/system/
}

# ${PN}-wait should be ordered before the ${PN}-utils package, otherwise ntp-wait bin will end up in the utils package
PACKAGES += "${PN}-wait"

FILES:${PN}-utils = "\
    ${sbindir}/ntp-keygen \
    ${sbindir}/ntpdate \
    ${sbindir}/calc_tickadj \
    ${sbindir}/ntptrace \
    ${sbindir}/ntptime \
    ${datadir}/ntp/lib \
"
FILES:${PN}-wait = "${systemd_unitdir}/system/ntp-wait.service ${sbindir}/ntp-wait"

SYSTEMD_PACKAGES += "ntp-wait"
SYSTEMD_SERVICE:${PN}-wait = "ntp-wait.service"

RDEPENDS:${PN}-wait += "perl"
RPROVIDES:${PN}-wait += "ntp-wait"
