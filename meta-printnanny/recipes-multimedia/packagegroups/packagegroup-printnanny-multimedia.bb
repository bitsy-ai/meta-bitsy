SUMMARY = "PrintNanny Multimedia Packages"
DESCRIPTION = "Minimal set of packages required to run PrintNanny Multimedia/Streaming stack"

PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup


RDEPENDS:${PN} = "\
    libcamera-apps \
    janus-gateway \
"
