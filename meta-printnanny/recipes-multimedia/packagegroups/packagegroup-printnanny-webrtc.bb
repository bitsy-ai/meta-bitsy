SUMMARY = "PrintNanny Multimedia Packages"
DESCRIPTION = "Minimal set of packages required to run PrintNanny Webrtc Multimedia/Streaming stack"
PR = "r0"

PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

RDEPENDS:${PN} = "\
    gstreamer-apps \
    ${@bb.utils.contains('MACHINE', 'raspberrypi4', 'libcamera-apps', '', d)} \
    janus-gateway \
"
