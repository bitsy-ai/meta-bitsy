SUMMARY = "PrintNanny Multimedia Packages"
DESCRIPTION = "Minimal set of packages required to run PrintNanny Multimedia/Streaming stack"
PR = "r0"

PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

RDEPENDS:${PN} = "\
    gstreamer-apps \
    nnstreamer \
    libcamera-apps \
    janus-gateway \
    tensorflow-lite \
"
