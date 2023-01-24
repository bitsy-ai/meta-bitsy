inherit pkgconfig systemd

SRC_URI += "\
    file://printnanny-snapshot.service \
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

do_install(){
  install -d "${D}${systemd_system_unitdir}"
  install -m 0644 "${WORKDIR}/printnanny-snapshot.service" "${D}${systemd_system_unitdir}/printnanny-snapshot.service"
}


SYSTEMD_SERVICE:${PN} = "\
  printnanny-snapshot.service \
"

SYSTEMD_AUTO_ENABLE = "enable"

FILES:${PN} += "${bindir}"
