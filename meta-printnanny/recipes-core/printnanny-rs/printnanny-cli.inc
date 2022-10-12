inherit pkgconfig 
do_install:append(){
    ln -s -r ${D}/${bindir}/printnanny-cli ${D}/${bindir}/printnanny
    ln -s -r ${D}/${bindir}/printnanny-cli ${D}/${bindir}/pn
}

DEPENDS:append = " openssl"
FILES:${PN} += "${datadir} ${bindir}"

include printnanny-gst.inc