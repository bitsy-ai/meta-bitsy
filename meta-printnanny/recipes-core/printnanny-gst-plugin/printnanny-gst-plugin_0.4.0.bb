SUMMARY = "PrintNanny OS Gstreamer Plugin"
HOMEPAGE = "https://github.com/bitsy-ai/printnanny-gst-plugin-rs"

SRC_URI = "\
    https://github.com/bitsy-ai/printnanny-gst-plugin-rs/releases/download/printnanny-gst-plugin-v${PV}/printnanny-gst-plugin-v${PV}-${TARGET_ARCH}-unknown-linux-gnu.tar.gz \
"

SRC_URI[sha256sum] = "${@bb.utils.contains( \
    'TARGET_ARCH', \
    'aarch64', \
    '78b8b9f15800aa5eeb75ad3e69c519b66cdd3e7ecbae910f69c2442b99fd3d9c', \
    bb.utils.contains( \
      'TARGET_ARCH', \
      'x86_64', \
      '3439fd013133a3c58440666a61338a03ffdaced819c7e53257e4730902b2c0bd', \
      '', \
      d), \
    d)}"

LICENSE = "AGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"

do_install(){
    install -d "${D}${bindir}"
    install -d "${D}${libdir}/gstprintnanny"
    install -m 0755 "${WORKDIR}/printnanny-gst-pipeline" "${D}${bindir}/printnanny-gst-pipeline"
    install -m 0644 "${WORKDIR}/libgstprintnanny.so" "${D}${libdir}/gstprintnanny/libgstprintnanny.so"
    cd ${D}/${libdir}
    ln -sf ./gstreamer-1.0/libgstprintnanny.so ./libgstprintnanny.so
}

SYSTEMD_AUTO_ENABLE = "enable"


DEPENDS = "\
    gstreamer1.0 \
    gstreamer1.0-plugins-base \
    nnstreamer \
"

RDEPENDS:${PN} = "\
    glib-2.0 \
    gstreamer1.0 \
    gstreamer1.0-plugins-base \
    gstreamer1.0-plugins-good \
    gstreamer1.0-plugins-bad \
    gstreamer1.0-plugins-ugly \
    libcamera \
    libcamera-gst \
    nnstreamer \
    nnstreamer-tensorflow-lite \
    tensorflow-lite \
"

INSANE_SKIP:${PN} += "dev-so"

FILES:${PN} += "${libdir}/gstprintnanny/*.so ${libdir}/gstreamer-1.0/*.so"
