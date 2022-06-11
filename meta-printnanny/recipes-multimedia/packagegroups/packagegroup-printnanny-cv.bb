SUMMARY = "PrintNanny Computer Vision Packages"
DESCRIPTION = "Minimal set of packages required to run nnstreamer and TensorFlow lite infereance stack"
PR = "r0"

PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

# removed while debugging webrtc stack: nnstreamer, tensorflow-lite
RDEPENDS:${PN} = "\
    nnstreamer \
    nnstreamer-models \
"
