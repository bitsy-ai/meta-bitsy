DESCRIPTION = "Tailscale client"
HOMEPAGE = ""
LICENSE = "BSD-3-Clause"

SRC_URI:aarch64 = "\
    https://pkgs.tailscale.com/stable/tailscale_${PV}_arm64.tgz \
"
SRC_URI[sha256sum] = "3992e7accfe797e03118a0d09a3d6b77dce9056b170860bc9ed20bc66178877c"

inherit systemd


do_install(){
    install -d "${D}${bindir}"
    install -d "${D}${sysconfdir}/default"
    install -d "${D}${systemd_system_unitdir}"
    install -m 0755 "${WORKDIR}/tailscale" "${D}${bindir}/tailscale"
    install -m 0755 "${WORKDIR}/tailscaled" "${D}${bindir}/tailscaled"
    install -m 0644 "${WORKDIR}/systemd/tailscaled.defaults" "${D}${sysconfdir}/default/tailscaled"
    install -m 0644 "${WORKDIR}/systemd/tailscaled.service" "${D}${sysconfdir}/tailscaled.service"
}

SYSTEMD_SERVICE:${PN} = "tailscaled.service"

SYSTEMD_AUTO_ENABLE = "disable"
