FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "\
    file://tweak-systemd-timesyncd.conf \
"

do_install:append(){
    install -m 0644 ${WORKDIR}/tweak-systemd-timesyncd.conf ${D}${systemd_unitdir}/timesyncd.conf.d/tweak-systemd-timesyncd.conf
}