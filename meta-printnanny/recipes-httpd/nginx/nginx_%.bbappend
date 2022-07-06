FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "\
    file://nginx-envsubst-on-templates.sh \
    file://server.conf.template \
    file://dash.locations.template \
    file://octoprint.locations.template \
    file://swupdate.locations.template \
"

do_install:append(){
  install -d "${D}${bindir}"
  install -d "${D}${sysconfdir}/nginx/templates"
  install -m 0644 "${WORKDIR}/server.conf.template" "${D}${sysconfdir}/nginx/templates/server.conf.template"
  install -m 0644 "${WORKDIR}/dash.locations.template" "${D}${sysconfdir}/nginx/templates/dash.locations.template"
  install -m 0644 "${WORKDIR}/octoprint.locations.template" "${D}${sysconfdir}/nginx/templates/octoprint.locations.template"
  install -m 0755 "${WORKDIR}/swupdate.locations.template" "${D}${sysconfdir}/nginx/templates/swupdate.locations.template"
  install -m 0755 "${WORKDIR}/nginx-envsubst-on-templates.sh" "${D}${bindir}/nginx-envsubst-on-templates"
  install -m 0644 "${WORKDIR}/nginx.service" "${D}${systemd_system_unitdir}/nginx.service"
}
RDEPENDS:${PN} += "gettext-runtime"
FILES:${PN} += "${sysconfdir}/nginx/* ${bindir}/nginx*"
