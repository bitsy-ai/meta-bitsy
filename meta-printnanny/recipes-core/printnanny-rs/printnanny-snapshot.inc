inherit pkgconfig systemd

SRC_URI += "\
    file://printnanny-snapshot.service\
"

DEPENDS += "openssl"

SYSTEMD_SERVICE:${PN} = "\
  printnanny-snapshot.service \
"

SYSTEMD_AUTO_ENABLE = "enable"

FILES:${PN} += "${bindir}"
