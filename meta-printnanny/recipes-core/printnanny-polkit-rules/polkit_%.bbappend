SRC_URI += "\
    file://10-moonraker.rules \
    file://10-printnanny.rules \
"
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

do_install:append(){
    install -d "${D}/etc/polkit-1/rules.d"
    install -m 0644 "${WORKDIR}/10-moonraker.rules" "${D}/etc/polkit-1/rules.d/10-moonraker.rules"
    install -m 0644 "${WORKDIR}/10-printnanny.rules" "${D}/etc/polkit-1/rules.d/10-printnanny.rules"
}
