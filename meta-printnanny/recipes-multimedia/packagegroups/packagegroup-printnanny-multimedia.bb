SUMMARY = "PrintNanny Multimedia Packages"
DESCRIPTION = "Minimal set of packages required to run PrintNanny Multimedia/Streaming stack"
PR = "r0"

PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

LICENSE_FLAGS_ACCEPTED += "commercial_gstreamer1.0-omx"
RDEPENDS:${PN} = "\
    nnstreamer \
    libcamera-apps \
    janus-gateway \
    tensorflow-lite \
"
