FILESEXTRAPATHS:append := "${THISDIR}/${PN}:"

PACKAGECONFIG_CONFARGS = ""

wwwdir = "${datadir}/swupdate/www"


SRC_URI += " \
    file://09-swupdate-args \
    file://swupdate.cfg \
    file://favicon.ico \
    file://icon.png \
    file://favicon.png \
"

do_install:append() {
    install -m 0644 ${WORKDIR}/09-swupdate-args ${D}${libdir}/swupdate/conf.d/
    install -d ${D}${sysconfdir}
    install -m 0644 ${WORKDIR}/swupdate.cfg ${D}${sysconfdir}

    install -m 0644 ${WORKDIR}/favicon.ico ${D}/${wwwdir}/favicon.ico
    install -m 0644 ${WORKDIR}/favicon.png ${D}/${wwwdir}/favicon.png
    install -m 0644 ${WORKDIR}/icon.png ${D}/${wwwdir}/icon.png
}
