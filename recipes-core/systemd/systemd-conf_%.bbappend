FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "\
    file://09-reboot-watchdog-sec.conf \
"

do_install:append(){
    install -m 0644 ${WORKDIR}/09-reboot-watchdog-sec.conf ${D}${systemd_unitdir}/system.conf.d/09-reboot-watchdog-sec.conf
}