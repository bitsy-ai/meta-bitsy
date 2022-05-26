SUMMARY = "PrintNanny Core Packages"
DESCRIPTION = "Minimal set of packages required to run PrintNanny OS"
PR = "r0"

PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

LICENSE_FLAGS_ACCEPTED += "commercial_gstreamer1.0-omx"
RDEPENDS:${PN} = "\
    printnanny-cli \
    cloud-init-systemd \
    janus-gateway \
    nnstreamer \
    tensorflow-lite \
    bitsy-sysupdate \
"