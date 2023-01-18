inherit pkgconfig

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
    libsqlite3 \
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

oe_cargo_build:prepend() {
	"${CARGO}" fetch --manifest-path="${MANIFEST_PATH}" 
}

do_install(){
    install -d "${D}${libdir}/gstreamer-1.0/"
    install -m 0644 "${WORKDIR}/build/target/${CARGO_TARGET_SUBDIR}/libgstprintnanny.so" "${D}${libdir}/gstreamer-1.0/libgstprintnanny.so"
}

# required to install nnstreamer-dev
INSANE_SKIP:${PN} += "dev-deps"
FILES:${PN} += "${libdir}/gstreamer-1.0/libgstprintnanny.so"
