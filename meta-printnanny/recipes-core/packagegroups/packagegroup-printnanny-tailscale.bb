SUMMARY = "Tailscale packages + configuration"
DESCRIPTION = "Minimal set of packages required to run Tailscale + Wireguard kernel modules"
PR = "r0"

PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

RDEPENDS:${PN} = "\
    tailscale \
    tailscale-web \
"
