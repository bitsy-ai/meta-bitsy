FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

# build nginx with nginx-rtmp-module v1.2.2-r1
SRC_URI += "\
    file://nginx-envsubst-on-templates.sh \
    file://server.conf.template \
    file://dash.locations.template \
    file://octoprint.locations.template \
    file://swupdate.locations.template \
    git://github.com/sergey-dryabzhinsky/nginx-rtmp-module.git;name=nginx-rtmp-module;rev=22861b746d29c52ef99818dbecb954a87714c3c6;destsuffix=nginx-rtmp-module \
"

PACKAGECONFIG[rtmp] = "--add-module=../nginx-rtmp-module,,"
PACKAGECONFIG = "ssl rtmp"

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
