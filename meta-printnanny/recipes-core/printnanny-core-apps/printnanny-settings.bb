DESCRIPTION = "PrintNanny Settings Repo"
HOMEPAGE = "https://printnanny.ai/"
LICENSE = "AGPL-3.0-or-later"

# initialize a local git repo from settings file symlinks
# note: symlinks should be relative to git repo!

DEPENDS = "moonraker klipper octoprint"

do_install(){
    install -d "${D}/var/lib/printnanny/settings/octoprint"
    install -d "${D}/var/lib/printnanny/settings/klipper"
    install -d "${D}/var/lib/printnanny/settings/moonraker"
    install -d "${D}/var/lib/printnanny/settings/printnanny"

    cd "${D}/var/lib/printnanny/settings"
    ln -s ../octoprint/config.yaml settings/octoprint/config.yaml
    ln -s ../moonraker/data/config/moonraker.conf settings/moonraker/moonraker.conf
    ln -s ../klipper/printer.cfg settings/klipper/klipper.cfg
}

FILES:${PN} = "/var/lib/printnanny/*"