DESCRIPTION = "Tailscale client"
HOMEPAGE = "https://tailscale.com/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/BSD-3-Clause;md5=550794465ba0ec5312d6919e203a55f9"

SRC_URI:aarch64 = "\
    https://pkgs.tailscale.com/stable/tailscale_${PV}_arm64.tgz \
    file://tailscaled.service \
"
SRC_URI[sha256sum] = "e8523caeef182300c476c8f3ea12eedfdc08d01bfdeb78bdf864f2e7e9888bfd"

inherit systemd
inherit overlayfs

# write tailscale state to overlayfs, which is preserved between system updates
OVERLAYFS_MOUNT_POINT[tailscale] = "/data"
OVERLAYFS_WRITABLE_PATHS[tailscale] = "/var/lib/tailscale"


S = "${WORKDIR}/tailscale_${PV}_arm64"

do_install(){
    install -d "${D}${bindir}"
    install -d "${D}${sysconfdir}/default"
    install -d "${D}${systemd_system_unitdir}"
    install -m 0755 "${S}/tailscale" "${D}${bindir}/tailscale"
    install -m 0755 "${S}/tailscaled" "${D}${bindir}/tailscaled"
    install -m 0644 "${S}/systemd/tailscaled.defaults" "${D}${sysconfdir}/default/tailscaled"
    install -m 0644 "${WORKDIR}/tailscaled.service" "${D}${systemd_system_unitdir}/tailscaled.service"
}

SYSTEMD_SERVICE:${PN} = "tailscaled.service"

SYSTEMD_AUTO_ENABLE = "disable"
