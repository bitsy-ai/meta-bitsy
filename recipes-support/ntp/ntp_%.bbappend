
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "\
    file://ntp-wait.service \
"

do_install:append(){
    install -m 0644 ${WORKDIR}/ntp-wait.service ${D}${systemd_unitdir}/system/
}

PACKAGES += "ntp-wait"

FILES:${PN}-wait = "${systemd_unitdir}/system/ntp-wait.service ${sbindir}/ntp-wait"

SYSTEMD_PACKAGES += "ntp-wait"
SYSTEMD_SERVICE:${PN}-wait = "ntp-wait.service"
