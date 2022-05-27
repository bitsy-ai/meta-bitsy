SUMMARY = "PrintNanny Core Packages"
DESCRIPTION = "Minimal set of packages required to run PrintNanny OS"
PR = "r0"

PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

LICENSE_FLAGS_ACCEPTED += "commercial_gstreamer1.0-omx"
RDEPENDS:${PN} = "\
    bitsy-sysupdate \
    cloud-init-systemd \
    janus-gateway \
    nginx \
    nnstreamer \
    printnanny-cli \
    tensorflow-lite \
"
