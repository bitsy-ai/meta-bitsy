inherit pkgconfig systemd

SRC_URI += "file://printnanny-snapshot.service"

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

do_install:append(){
  install -d "${D}${systemd_system_unitdir}"
  install -d "${D}${bindir}"
  install -m 0755 "${WORKDIR}/build/target/${CARGO_TARGET_SUBDIR}/printnanny-snapshot" "${D}${bindir}/printnanny-snapshot"
  install -m 0644 "${WORKDIR}/printnanny-snapshot.service" "${D}${systemd_system_unitdir}/printnanny-snapshot.service"
}

FILES:${PN} += "${bindir}"

SYSTEMD_SERVICE:${PN} = "printnanny-snapshot.service"

SYSTEMD_AUTO_ENABLE = "enable"

