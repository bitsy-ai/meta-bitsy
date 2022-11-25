DESCRIPTION = "PrintNanny Settings Repo"
HOMEPAGE = "https://printnanny.ai/"
LICENSE = "AGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"

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
    cd "${D}/var/lib/printnanny/settings/" && git init && git add -A && git commit -m "default"
    chown -R root:root "${D}/var/lib/printnanny/settings/"

}
INSANE_SKIP_${PN} = "file-rdeps"
FILES:${PN} = "/var/lib/printnanny/settings/"
