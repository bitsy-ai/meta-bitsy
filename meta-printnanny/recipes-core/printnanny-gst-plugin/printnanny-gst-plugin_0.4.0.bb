SUMMARY = "PrintNanny OS Gstreamer Plugin"
HOMEPAGE = "https://github.com/bitsy-ai/printnanny-gst-plugin-rs"

SRC_URI = "\
    https://github.com/bitsy-ai/printnanny-gst-plugin-rs/releases/download/printnanny-gst-plugin-v${PV}/printnanny-gst-plugin-v${PV}-${TARGET_ARCH}-unknown-linux-gnu.tar.gz \
"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"
SRC_URI[sha256sum] = "78b8b9f15800aa5eeb75ad3e69c519b66cdd3e7ecbae910f69c2442b99fd3d9c"

include printnanny-gst-plugin.inc

do_install(){
    install -d "${D}${bindir}"
    install -d "${D}${libdir}/gstprintnanny"
    install -m 0755 "${WORKDIR}/printnanny-gst-pipeline" "${D}${bindir}/printnanny-gst-pipeline"
    install -m 0644 "${WORKDIR}/libgstprintnanny.so" "${D}${libdir}/gstprintnanny/libgstprintnanny.so"
    cd ${D}/${libdir}
    ln -sf ./gstreamer-1.0/libgstprintnanny.so ./libgstprintnanny.so
}

FILES:${PN} += "${libdir}/gstprintnanny ${bindir}/printnanny-gst-pipeline"

