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

    install -m 0644 "${WORKDIR}/moonraker.conf" "${D}/var/lib/printnanny/settings/moonraker/moonraker.conf"
    install -m 0644 "${WORKDIR}/octoprint.yaml" "${D}/var/lib/printnanny/settings/octoprint/octoprint.yaml"
    install -m 0644 "${WORKDIR}/klipper.cfg" "${D}/var/lib/printnanny/settings/klipper/klipper.cfg"
    cd "${D}/lib/printnanny/settings/" && git init && git commit -m "default"
}

FILES:${PN} = "/var/lib/printnanny/settings/*"
