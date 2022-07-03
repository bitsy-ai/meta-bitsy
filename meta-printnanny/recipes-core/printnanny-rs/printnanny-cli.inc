inherit pkgconfig 
do_install:append(){
    install -d "${D}${datadir}/printnanny/www"
    cp -R --no-dereference --preserve=mode,links -v "${S}/cli/templates" "${D}${datadir}/printnanny/www"
    ln -s -r ${D}/${bindir}/printnanny-cli ${D}/${bindir}/printnanny
    ln -s -r ${D}/${bindir}/printnanny-cli ${D}/${bindir}/pn
}

DEPENDS:append = " openssl"
FILES:${PN} += "${datadir} ${bindir}"
