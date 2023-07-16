
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "\
    file://ntp-wait.service \
"

do_install:append(){
    install -m 0644 ${WORKDIR}/ntp-wait.service ${D}${systemd_unitdir}/system/
}

SYSTEMD_PACKAGES += "ntp-wait"
SYSTEMD_SERVICE:${PN}-utils = "ntp-wait.service"
