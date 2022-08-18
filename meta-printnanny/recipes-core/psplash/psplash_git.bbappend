FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

# generated with: https://github.com/g0hl1n/psplash/blob/master/make-image-header.sh
SRC_URI += "\
    file://psplash-printnanny-img.h \
    file://psplash-start.service \
    file://10-fb0-systemd.rules \
"
SPLASH_IMAGES:rpi = "file://psplash-printnanny-img.h;outsuffix=printnanny"

do_install:apppend() {
    install -d "${D}${sysconfdir}/udev/rules.d"
    install -m 0644 "${WORKDIR}/10-fb0-systemd.rules" "${D}${sysconfdir}/udev/rules.d/10-fb0-systemd.rules"
}

FILES:${PN} += "${sysconfdir}/udev/rules.d/10-fb0-systemd.rules"
