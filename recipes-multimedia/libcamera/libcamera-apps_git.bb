SUMMARY = "Raspberry Pi libcamera-apps example applications"

SRC_URI = "git://github.com/raspberrypi/libcamera-apps.git;protocol=https;branch=main"
SRCREV = "6e0c66a1b2c3f6bfa3d03d06b4a75d7c4006b28b"
LIC_FILES_CHKSUM = "file://license.txt;md5=a0013d1b383d72ba4bdc5b750e7d1d77"

S = "${WORKDIR}/git"

inherit meson pkgconfig

DEPENDS = "\
    libcamera \
    jpeg \
    tiff \
    libav \
    python3-jinja2-native \
    boost \
    gnutls \
    openssl \
    libdrm \
    libexif \
"

RDEPENDS:${PN} = "python3-core"

