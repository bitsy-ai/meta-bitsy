inherit extrausers

SRC_URI = "\
    file://000_alias \
"

PRINTNANNY_USER ??= "printnanny"

PRINTNANNY_USER_SUDOERSD_RULES = "\
${PRINTNANNY_USER} ALL=(ALL) NOPASSWD:OCTOPRINT_SERVICES,PRINTNANNY_SERVICES,WEB_SERVICES,REBOOT \
%${PRINTNANNY_USER} ALL=(ALL) NOPASSWD:OCTOPRINT_SERVICES,PRINTNANNY_SERVICES,WEB_SERVICES,REBOOT \
"

PRINTNANNY_EXTRA_SUDOERSD_RULES ??= ""
SUDOERSD_RULES = "\
    ${PRINTNANNY_USER_SUDOERSD_RULES} \
    ${PRINTNANNY_EXTRA_SUDOERSD_RULES} \
\"

EXTRA_USERS_PARAMS += "\
    useradd ${PRINTNANNY_USER}; \
    usermod -a -G adm ${PRINTNANNY_USER}; \
    usermod -a -G dialout ${PRINTNANNY_USER}; \
    usermod -a -G i2c ${PRINTNANNY_USER}; \
    usermod -a -G input ${PRINTNANNY_USER}; \
    usermod -a -G netdev ${PRINTNANNY_USER}; \
    usermod -a -G plugdev ${PRINTNANNY_USER}; \
    usermod -a -G spi ${PRINTNANNY_USER}; \
    usermod -a -G sudo ${PRINTANNNY_USER}; \
    usermod -a -G video${PRINTNANNY_USER}; \
"

do_compile() {
    echo "${@' '.join('${SUDOERSD_RULES}'.split())}" > "${WORKDIR}/020_printnanny_rules"
}

do_install(){
    install -d "${D}/etc/sudoers.d"
    install -m 0644 "${WORKDIR}/000_alias" "${D}/etc/sudoers.d/000_alias"
    install -m 0644 "${WORKDIR}/020_printnanny_rules" "${D}/etc/sudoers.d/020_printnanny_rules"
}
