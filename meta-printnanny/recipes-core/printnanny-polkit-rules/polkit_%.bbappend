SRC_URI += "\
    file://moonraker.rules \
    file://printnanny.rules \
"
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

do_install:append(){
    install -d "${D}/etc/polkit-1/rules.d"
    install -m 0644 "${WORKDIR}/moonraker.rules" "${D}/etc/polkit-1/rules.d/moonraker.rules"
    install -m 0644 "${WORKDIR}/printnanny.rules" "${D}/etc/polkit-1/rules.d/printnanny.rules"
}
