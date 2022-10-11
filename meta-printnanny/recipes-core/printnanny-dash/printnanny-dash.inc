SRC_URI += "\
    file://printnanny-dash.service \
"
inherit systemd

do_install:append(){
    install -d "${D}${systemd_system_unitdir}"
    install -m 0644 "${WORKDIR}/printnanny-dash.service" "${D}${systemd_system_unitdir}/printnanny-dash.service"
}

SYSTEMD_SERVICE:${PN} = "printnanny-dash.service"
