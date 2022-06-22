FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "\
    file://printnanny.png \
"

SPLASH_IMAGES = "file://printnanny.png;outsuffix=default"

do_install:append() {
	install -d ${D}${datadir}/plymouth
	install -m 755 ${WORKDIR}/printnanny.png ${D}/${datadir}/plymouth/
}

LOGO = "${datadir}/plymouth/printnanny.png"
