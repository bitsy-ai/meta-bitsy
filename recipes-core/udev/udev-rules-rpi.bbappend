SRC_URI += " \
	file://10-local-rpi-rules.conf
"

do_install:append(){
    install -m 0644 ${WORKDIR}/10-local-rpi.rules ${D}${sysconfdir}/udev/rules.d/
}
