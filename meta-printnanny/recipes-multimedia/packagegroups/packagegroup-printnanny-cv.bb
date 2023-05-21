SUMMARY = "PrintNanny Computer Vision Packages"
DESCRIPTION = "Minimal set of packages required to run nnstreamer and TensorFlow lite infereance stack"
PR = "r0"

PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

RDEPENDS:${PN} = "\
    printnanny-vision \
    printnanny-gst-plugin \
    libcamera-apps \
"
