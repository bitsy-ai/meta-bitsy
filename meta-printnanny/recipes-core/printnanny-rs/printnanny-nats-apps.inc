inherit pkgconfig 
do_install:append(){
    ln -s -r ${D}/${bindir}/nats-edge-worker ${D}/${bindir}/printnanny-nats-edge-worker
    ln -s -r ${D}/${bindir}/nats-edge-worker  ${D}/${bindir}/pn-nats-edge-worker
}

DEPENDS += "openssl \
    gstreamer1.0 \
    gstreamer1.0-plugins-base \
    gstreamer1.0-libav \
    gstreamer1.0-plugins-base \
    gstreamer1.0-plugins-good \
    gstreamer1.0-plugins-bad \
    gstreamer1.0-plugins-ugly \
    sqlite3 \
"

REDPENDS:${PN} = "libsqlite3"

FILES:${PN} += "${datadir} ${bindir}"
