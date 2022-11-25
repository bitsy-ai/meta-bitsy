DESCRIPTION = "PrintNanny Settings Repo"
HOMEPAGE = "https://printnanny.ai/"
LICENSE = "AGPL-3.0-or-later"

SRC_URI = "\
    file://moonraker.conf \
    file://octoprint.yaml \
    file://klipper.cfg \
"

do_install(){
    install -d "${D}/var/lib/printnanny/settings/octoprint"
    install -d "${D}/var/lib/printnanny/settings/klipper"
    install -d "${D}/var/lib/printnanny/settings/moonraker"
    install -d "${D}/var/lib/printnanny/settings/printnanny"

    install -m 0644 "${WORKDIR}/moonraker.conf" "${D}/lib/printnanny/settings/moonraker/moonraker.conf"
    install -m 0644 "${WORKDIR}/octoprint.yaml" "${D}/lib/printnanny/settings/octoprint/octoprint.yaml"
    install -m 0644 "${WORKDIR}/klipper.cfg" "${D}/lib/printnanny/settings/klipper/klipper.cfg"
}

FILES:${PN} = "/var/lib/printnanny/settings/*"
