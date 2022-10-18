SUMMARY = "PrintNanny Utils"
DESCRIPTION = "PrintNanny Utilities package"
PR = "r0"

PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

# removed while debugging webrtc stack: nnstreamer, tensorflow-lite
RDEPENDS:${PN} = "\
    htop \
    v4l-utils \
    lsof \
"
