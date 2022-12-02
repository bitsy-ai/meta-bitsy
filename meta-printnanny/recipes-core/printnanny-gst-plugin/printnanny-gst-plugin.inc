inherit pkgconfig 
inherit systemd

PREFERRED_VERSION:${PN}:tensorflow-lite-native = "2.9.1"
PREFERRED_VERSION:${PN}:tensorflow-lite = "2.9.1"

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
    libcamera-gst \
    nnstreamer \
    nnstreamer-dev \
    nnstreamer-tensorflow-lite \
    tensorflow-lite \
"
FILES:${PN} += "${datadir} ${bindir} ${libdir}/"

# required to install nnstreamer-dev
INSANE_SKIP:${PN} += "dev-deps"