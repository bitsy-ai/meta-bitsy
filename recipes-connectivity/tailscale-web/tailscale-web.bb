DESCRIPTION = "Tailscale web server"
HOMEPAGE = "https://tailscale.com/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/BSD-3-Clause;md5=550794465ba0ec5312d6919e203a55f9"

RDEPENDS:${PN} = "tailscale"

SRC_URI = "\
    file://tailscale-web.service \
    file://tailscale-web.defaults \
"

inherit systemd

do_install(){
    install -d "${D}${sysconfdir}/default"
    install -d "${D}${systemd_system_unitdir}"
    install -m 0644 "${WORKDIR}/tailscale-web.defaults" "${D}${sysconfdir}/default/tailscale-web"
    install -m 0644 "${WORKDIR}/tailscale-web.service" "${D}${systemd_system_unitdir}/tailscale-web.service"
}

SYSTEMD_SERVICE:${PN} = "tailscale-web.service"
SYSTEMD_AUTO_ENABLE = "enable"
