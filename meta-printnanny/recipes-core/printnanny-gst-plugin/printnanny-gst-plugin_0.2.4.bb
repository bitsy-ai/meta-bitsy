SUMMARY = "PrintNanny OS Gstreamer Plugin"
HOMEPAGE = "https://github.com/bitsy-ai/printnanny-gst-plugin-rs"

SRC_URI = "\
    https://github.com/bitsy-ai/printnanny-gst-plugin-rs/releases/download/v${PV}/printnanny-gst-plugin-${TARGET_ARCH}-unknown-linux-gnu.tar.gz \
"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"
SRC_URI[sha256sum] = "3a8e9529a37a524e4983adf7a6a10fcda3928653971ba49b7d3f1ea9f088a3ed"

do_install(){
    install -d "${D}${bindir}"
    install -d "${D}${libdir}"
    install -m 0644 "${WORKDIR}/printnanny-gst-pipeline" "${D}${bindir}/printnanny-gst-pipeline"
    install -m 0644 "${WORKDIR}/libgstprintnanny.so" "${D}${libdir}/libgstprintnanny.so"
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
    tensorflow-lite \
"

INSANE_SKIP:${PN} += "dev-so"

FILES:${PN} += "${libdir}/*.so ${libdir}/gstreamer-1.0/*.so"
