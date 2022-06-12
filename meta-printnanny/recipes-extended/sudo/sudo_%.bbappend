SRC_URI += "\
    file://000_alias \
"
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

PRINTNANNY_USER_SUDOERSD_RULES = "\
    ${PRINTNANNY_USER} ALL=(ALL) NOPASSWD:OCTOPRINT_SERVICES,PRINTNANNY_SERVICES,WEB_SERVICES,REBOOT \
    %${PRINTNANNY_USER} ALL=(ALL) NOPASSWD:OCTOPRINT_SERVICES,PRINTNANNY_SERVICES,WEB_SERVICES,REBOOT \
"

PRINTNANNY_EXTRA_SUDOERSD_RULES ??= ""
SUDOERSD_RULES = "\
    ${PRINTNANNY_USER_SUDOERSD_RULES} \
    ${PRINTNANNY_EXTRA_SUDOERSD_RULES} \
"
do_install:append(){
    echo "${SUDOERSD_RULES}" > "${WORKDIR}/020_printnanny_rules"
    install -d "${D}${sysconfdir}/sudoers.d"
    install -m 0644 "${WORKDIR}/000_alias" "${D}${sysconfdir}/sudoers.d/000_alias"
    install -m 0644 "${WORKDIR}/020_printnanny_rules" "${D}${sysconfdir}/sudoers.d/020_printnanny_rules"
}
