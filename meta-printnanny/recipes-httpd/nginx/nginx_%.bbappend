FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "\
    file://nginx-envsubst-on-templates.sh \
    file://sites/mainsail \
    file://sites/printnanny-dash \
    file://dash.locations.template \
    file://octoprint.locations.template \
    file://swupdate.locations.template \
"

do_install:append(){
  install -d "${D}${bindir}"
  install -d "${D}${sysconfdir}/nginx/templates"
  install -d "${D}${sysconfdir}/nginx/sites-available"

  install -m 0644 "${WORKDIR}/sites/mainsail" "${D}${sysconfdir}/nginx/sites-available/mainsail"
  install -m 0644 "${WORKDIR}/sites/printnanny-dash" "${D}${sysconfdir}/nginx/sites-available/printnanny-dash"
  ln -s "${D}${sysconfdir}/nginx/sites-available/mainsail" "${D}${sysconfdir}/nginx/sites-enabled/mainsail"
  ln -s "${D}${sysconfdir}/nginx/sites-available/printnanny-dash" "${D}${sysconfdir}/nginx/sites-enabled/printnanny-dash"

  install -m 0644 "${WORKDIR}/dash.locations.template" "${D}${sysconfdir}/nginx/templates/dash.locations.template"
  install -m 0644 "${WORKDIR}/octoprint.locations.template" "${D}${sysconfdir}/nginx/templates/octoprint.locations.template"
  install -m 0755 "${WORKDIR}/swupdate.locations.template" "${D}${sysconfdir}/nginx/templates/swupdate.locations.template"
  install -m 0755 "${WORKDIR}/nginx-envsubst-on-templates.sh" "${D}${bindir}/nginx-envsubst-on-templates"
  install -m 0644 "${WORKDIR}/nginx.service" "${D}${systemd_system_unitdir}/nginx.service"
  rm -f "${D}${sysconfdir}/nginx/sites-enabled/default_server"
}

RDEPENDS:${PN} += "gettext-runtime"
FILES:${PN} += "${sysconfdir}/nginx/* ${bindir}/nginx*"
