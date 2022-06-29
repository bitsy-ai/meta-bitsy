SRC_URI += "\
    file://000_alias \
"
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

PRINTNANNY_USER ?= "printnanny"

do_install:append(){
    echo "${PRINTNANNY_USER} ALL=(ALL) NOPASSWD:OCTOPRINT_SERVICES,PRINTNANNY_SERVICES,WEB_SERVICES,REBOOT" > "${WORKDIR}/020_${PRINTNANNY_USER}_rules"
    echo "%${PRINTNANNY_USER} ALL=(ALL) NOPASSWD:OCTOPRINT_SERVICES,PRINTNANNY_SERVICES,WEB_SERVICES,REBOOT" >> "${WORKDIR}/020_${PRINTNANNY_USER}_rules"
    install -d "${D}${sysconfdir}/sudoers.d"
    install -m 0644 "${WORKDIR}/000_alias" "${D}${sysconfdir}/sudoers.d/000_alias"
    install -m 0644 "${WORKDIR}/020_${PRINTNANNY_USER}_rules" "${D}${sysconfdir}/sudoers.d/020_${PRINTNANNY_USER}_rules"
    install -m 0644 "${WORKDIR}/020_${PRINTNANNY_USER}_rules" "${D}${sysconfdir}/sudoers.d/020_${PRINTNANNY_USER}_rules"
}
