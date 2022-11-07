SRC_URI += "\
    file://000_alias \
"
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

PRINTNANNY_USER ?= "printnanny"

do_install:append(){
    echo "${PRINTNANNY_USER} ALL=(ALL) NOPASSWD:MOONRAKER_SERVICES,MOONRAKER_TASKS,KLIPPER_SERVICES,OCTOPRINT_SERVICES,PRINTNANNY_SERVICES,WEB_SERVICES,REBOOT,MAINSAIL_SERVICES,SYNCTHING_SERVICES,SWUPDATE_SERVICES" > "${WORKDIR}/020_${PRINTNANNY_USER}_rules"
    echo "%${PRINTNANNY_USER} ALL=(ALL) NOPASSWD:MOONRAKER_SERVICES,MOONRAKER_TASKS,KLIPPER_SERVICES,OCTOPRINT_SERVICES,PRINTNANNY_SERVICES,WEB_SERVICES,REBOOT,MAINSAIL_SERVICES,SYNCTHING_SERVICES,SWUPDATE_SERVICES" >> "${WORKDIR}/020_${PRINTNANNY_USER}_rules"
    echo "%sudo ALL=(ALL:ALL) ALL" > "${WORKDIR}/020_sudo_group_rules"

    install -d "${D}${sysconfdir}/sudoers.d"
    install -m 0440 "${WORKDIR}/000_alias" "${D}${sysconfdir}/sudoers.d/000_alias"
    install -m 0440 "${WORKDIR}/020_${PRINTNANNY_USER}_rules" "${D}${sysconfdir}/sudoers.d/020_${PRINTNANNY_USER}_rules"
    install -m 0440 "${WORKDIR}/020_${PRINTNANNY_USER}_rules" "${D}${sysconfdir}/sudoers.d/020_${PRINTNANNY_USER}_rules"
    install -m 0440 "${WORKDIR}/020_sudo_group_rules" "${D}${sysconfdir}/sudoers.d/020_sudo_group_rules"
}
