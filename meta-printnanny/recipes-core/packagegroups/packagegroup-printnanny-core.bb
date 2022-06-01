SUMMARY = "PrintNanny Core Packages"
DESCRIPTION = "Minimal set of packages required to run PrintNanny OS Apps"
PR = "r0"

PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

LICENSE_FLAGS_ACCEPTED += "commercial_gstreamer1.0-omx"

RDEPENDS:${PN} = "\
    nnstreamer \
    printnanny-cli \
    tensorflow-lite \
"
