inherit pkgconfig systemd

SRC_URI += "\
    file://printnanny-snapshot.service\
"

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


SYSTEMD_SERVICE:${PN} = "\
  printnanny-snapshot.service \
"

SYSTEMD_AUTO_ENABLE = "enable"

FILES:${PN} += "${bindir}"
