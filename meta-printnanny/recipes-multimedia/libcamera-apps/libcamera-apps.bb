LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://license.txt;md5=a0013d1b383d72ba4bdc5b750e7d1d77"

SRC_URI = "git://github.com/raspberrypi/libcamera-apps.git;branch=main;protocol=https"
SRCREV = "6582a730b059f086552414b034c90688cca047eb"
S = "${WORKDIR}/git"

PV = "202205+git${SRCPV}"

EXTRA_OEMESON =  "\
    -Dpipelines=raspberrypi \
    -Dipas=raspberrypi \
    -Dv4l2=true \
    -Dtest=false \
    -Dlc-compliance=disabled \
    -Dcam=disabled \
    -Dqcam=disabled \
    -Ddocumentation=disabled \
"

inherit cmake pkgconfig

PACKAGECONFIG ??= "gst"

COMPATIBLE_MACHINE = "^rpi$"

PREFERRED_VERSION:libcamera = "202205"

DEPENDS = "libcamera opencv boost libexif tiff"
RDEPENDS:${PN} = "libcamera libcamera-dev libcamera-gst opencv boost libexif tiff"

EXTRA_OECMAKE = "\
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "-DENABLE_X11=1", "-DENABLE_X11=0", d)} \
    ${@bb.utils.contains("MACHINE", "raspberrypi3", "-DENABLE_COMPILE_FLAGS_FOR_TARGET=armv8-neon", "", d)} \
    ${@bb.utils.contains("MACHINE", "raspberrypi4", "-DENABLE_COMPILE_FLAGS_FOR_TARGET=armv8-neon", "", d)} \
"

PACKAGECONFIG[gst] = "-Dgstreamer=enabled"
PACKAGECONFIG[opencv] = "-DENABLE_OPENCV=1"
PACKAGECONFIG[tensorflow-lite] = "-DENABLE_TFLITE=1"
PACKAGECONFIG[qt] = "-DENABLE_QT=1"

FILES:${PN} += "${libdir} ${nonarch_libdir}"
FILES:${PN}-dev = "${includedir} ${libdir}/pkgconfig"
