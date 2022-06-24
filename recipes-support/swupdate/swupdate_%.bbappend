FILESEXTRAPATHS:append := "${THISDIR}/${PN}:"

PACKAGECONFIG_CONFARGS = ""

wwwdir = "${datadir}/swupdate/www"


SRC_URI += " \
    file://09-swupdate-args \
    file://swupdate.cfg \
    file://favicon.ico \
    file://background.png \
    file://favicon.png \
    file://logo.png \
    file://bootstrap.min.css \
"

do_install:append() {
    install -m 0644 ${WORKDIR}/09-swupdate-args ${D}${libdir}/swupdate/conf.d/
    install -d ${D}${sysconfdir}
    install -m 0644 ${WORKDIR}/swupdate.cfg ${D}${sysconfdir}
    install -d ${D}/${wwwdir}/images
    install -d ${D}/${wwwdir}/css

    install -m 0644 ${WORKDIR}/favicon.ico ${D}/${wwwdir}/images/favicon.ico
    install -m 0644 ${WORKDIR}/favicon.png ${D}/${wwwdir}/images/favicon.png
    install -m 0644 ${WORKDIR}/icon.png ${D}/${wwwdir}/images/icon.png
    install -m 0644 ${WORKDIR}/logo.png ${D}/${wwwdir}/images/logo.png
    install -m 0644 ${WORKDIR}/bootstrap.min.css ${D}/wwwdir/css/bootstrap.min.css
}
