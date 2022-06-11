LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://license.txt;md5=a0013d1b383d72ba4bdc5b750e7d1d77"

SRC_URI = "git://github.com/raspberrypi/libcamera-apps.git;branch=main;protocol=https"
SRCREV = "6582a730b059f086552414b034c90688cca047eb"

S = "${WORKDIR}/git"

PV = "202205+git${SRCPV}"

inherit cmake pkgconfig

COMPATIBLE_MACHINE = "^rpi$"

PREFERRED_VERSION:libcamera = "202205"

DEPENDS = "libcamera boost libexif tiff"
RDEPENDS:${PN} = "python3-core"

# objdetect module is not being included automatically due to missing opencv_dnn dependency
# meta-bitsy/meta-printnanny/recipes-support/opencv/opencv_%.bbappend makes opencv_dnn optional dependency for objdetect
EXTRA_OECMAKE:pn-opencv:append = "\
   -DBUILD_opencv_dnn=ON \
   -DBUILD_opencv_objdetect=ON \
"

EXTRA_OECMAKE = "\
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "-DENABLE_X11=1", "-DENABLE_X11=0", d)} \
    ${@bb.utils.contains("MACHINE", "raspberrypi3", "-DENABLE_COMPILE_FLAGS_FOR_TARGET=armv8-neon", "", d)} \
    ${@bb.utils.contains("MACHINE", "raspberrypi4", "-DENABLE_COMPILE_FLAGS_FOR_TARGET=armv8-neon", "", d)} \
"

PACKAGECONFIG ??= "gst opencv"

PACKAGECONFIG[drm] = "-DENABLE_DRM=1,-DENABLE_DRM=0,libdrm"
PACKAGECONFIG[gst] = "-Dgstreamer=enabled,-Dgstreamer=disabled,gstreamer1.0 gstreamer1.0-plugins-base"
PACKAGECONFIG[opencv] = "-DENABLE_OPENCV=1,-DENABLE_OPENCV=0,opencv"
PACKAGECONFIG[tensorflow-lite] = "-DENABLE_TFLITE=1,-DENABLE_TFLITE=0,tensorflow-lite,tensorflow-lite"
PACKAGECONFIG[qt] = "-DENABLE_QT=1,-DENABLE_QT=0"

FILES:${PN} += "${libdir} ${nonarch_libdir}"
FILES:${PN}-dev = "${includedir} ${libdir}/pkgconfig"

SOLIBS = ".so"