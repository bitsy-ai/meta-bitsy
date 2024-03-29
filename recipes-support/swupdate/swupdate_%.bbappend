FILESEXTRAPATHS:append := "${THISDIR}/${PN}:"

PACKAGECONFIG_CONFARGS = ""

wwwdir = "${datadir}/swupdate/www"


SRC_URI += " \
    file://09-swupdate-args \
    file://10-mongoose-args-custom \
    file://swupdate.cfg \
    file://favicon.ico \
    file://background.png \
    file://favicon.png \
    file://logo.png \
    file://bootstrap.min.css \
    file://swupdate.min.css \
    file://index.html \
"

do_install:append() {
    install -d ${D}${libdir}/swupdate/conf.d/
    install -m 0644 ${WORKDIR}/09-swupdate-args  ${D}${libdir}/swupdate/conf.d/09-swupdate-args
    install -m 0644 ${WORKDIR}/10-mongoose-args-custom ${D}${libdir}/swupdate/conf.d/10-mongoose-args
    install -d ${D}${sysconfdir}
    install -m 0644 ${WORKDIR}/swupdate.cfg ${D}${sysconfdir}
    install -d ${D}/${wwwdir}/images
    install -d ${D}/${wwwdir}/css

    install -m 0644 ${WORKDIR}/favicon.ico ${D}/${wwwdir}/images/favicon.ico
    install -m 0644 ${WORKDIR}/favicon.png ${D}/${wwwdir}/images/favicon.png
    install -m 0644 ${WORKDIR}/background.png ${D}/${wwwdir}/images/background.png
    install -m 0644 ${WORKDIR}/logo.png ${D}/${wwwdir}/images/logo.png
    install -m 0644 ${WORKDIR}/bootstrap.min.css ${D}/${wwwdir}/css/bootstrap.min.css
    install -m 0644 ${WORKDIR}/swupdate.min.css ${D}/${wwwdir}/css/swupdate.min.css
    install -m 0644 ${WORKDIR}/index.html ${D}/${wwwdir}/index.html
}
