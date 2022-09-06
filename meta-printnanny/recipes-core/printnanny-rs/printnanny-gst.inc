inherit pkgconfig 
do_install:append(){
    ln -s -r ${D}/${bindir}/printnanny-gst ${D}/${bindir}/pn-gst
}
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
"
RDEPENDS:${PN} = "\
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
FILES:${PN} += "${datadir} ${bindir}"