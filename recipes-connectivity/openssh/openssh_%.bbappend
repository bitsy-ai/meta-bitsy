FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = "\
    file://sshd.service \
"

do_install:append(){
    install -m 0644 ${WORKDIR}/sshd.service ${D}${systemd_system_unitdir}/sshd.service
}