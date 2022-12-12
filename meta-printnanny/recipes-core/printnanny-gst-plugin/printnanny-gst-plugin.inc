SRC_URI += "\
    git://github.com/bitsy-ai/printnanny-cli.git;protocol=https;name=printnanny-cli;destsuffix=printnanny-cli;branch=main \
"
SRCREV_FORMAT .= "_printnanny-cli"
SRCREV_printnanny-cli = "${AUTOREV}"
EXTRA_OECARGO_PATHS += "${WORKDIR}/printnanny-cli/settings"
EXTRA_OECARGO_PATHS += "${WORKDIR}/printnanny-cli/dbus"

# copy LICENSE_FLAGS_ACCEPTED to local.conf
LICENSE_FLAGS_ACCEPTED += "\
    commercial_gstreamer1.0-libav \
    commercial_gstreamer1.0-plugins-ugly \
    commercial_ffmpeg \
    commercial_mpeg2dec \
"

DEPENDS += "openssl \
    gstreamer1.0 \
    gstreamer1.0-plugins-base \
    gstreamer1.0-libav \
    gstreamer1.0-plugins-base \
    gstreamer1.0-plugins-good \
    gstreamer1.0-plugins-bad \
    gstreamer1.0-plugins-ugly \   
    nnstreamer \
    tensorflow-lite \
"
RDEPENDS:${PN} += "\
    glib-2.0 \
    gstreamer1.0 \
    gstreamer1.0-plugins-base \
    gstreamer1.0-plugins-good \
    gstreamer1.0-plugins-bad \
    gstreamer1.0-plugins-ugly \
    libcamera \
    libcamera-dev \
    libcamera-gst \
    nnstreamer \
    nnstreamer-dev \
    nnstreamer-tensorflow-lite \
    tensorflow-lite \
"
FILES:${PN} += "${datadir} ${bindir} ${libdir}/"

oe_cargo_build:prepend() {
	"${CARGO}" fetch --manifest-path="${MANIFEST_PATH}" 
}

do_install(){
    install -d "${D}${bindir}"
    install -d "${D}${libdir}/gstprintnanny"
    install -m 0755 "${WORKDIR}/printnanny-gst-pipeline" "${D}${bindir}/printnanny-gst-pipeline"
    install -m 0644 "${WORKDIR}/libgstprintnanny.so" "${D}${libdir}/gstprintnanny/libgstprintnanny.so"
    cd ${D}/${libdir}
    ln -sf ./gstreamer-1.0/libgstprintnanny.so ./libgstprintnanny.so
}

# required to install nnstreamer-dev
INSANE_SKIP:${PN} += "dev-deps"
FILES:${PN} += "${libdir}/gstprintnanny ${bindir}/printnanny-gst-pipeline"
