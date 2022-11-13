SRC_URI += "\
    file://moonraker.rules \
"
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

do_install:append(){
    install -d "${D}/etc/polkit-1/rules.d"
    install -m 0644 "${WORKDIR}/moonraker.rules" "${D}/etc/polkit-1/rules.d/moonraker.rules"
}
