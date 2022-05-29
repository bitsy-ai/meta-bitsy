SUMMARY = "PrintNanny Multimedia Packages"
DESCRIPTION = "Minimal set of packages required to run PrintNanny Multimedia/Streaming stack"
PR = "r0"

PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

RDEPENDS:${PN} = "\
    libcamera \
    libcamera-apps \
    janus-gateway \
"
