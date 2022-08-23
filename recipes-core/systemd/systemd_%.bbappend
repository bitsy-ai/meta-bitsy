SRC_URI += "file://resolved.conf"

do_install:append() {
    install -m 0644 ${WORKDIR}/resolved.conf ${D}${sysconfdir}/systemd/resolved.conf
}

FILES:${PN} += "${sysconfdir}/systemd/resolved.conf"
