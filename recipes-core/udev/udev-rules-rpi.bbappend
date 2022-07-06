FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += " \
	file://10-local-rpi.rules \
    file://99-com.rules \
"

do_install:append(){
    install -d ${D}${sysconfdir}/udev/rules.d/
    install -m 0644 ${WORKDIR}/10-local-rpi.rules ${D}${sysconfdir}/udev/rules.d/
    install -m 0644 ${WORKDIR}/99-com.rules ${D}${sysconfdir}/udev/rules.d/
}
