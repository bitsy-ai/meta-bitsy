SUMMARY = "PrintNanny SDWire Command-Line Tool"
HOMEPAGE = "https://github.com/bitsy-ai/printnanny-sdwire"

inherit pkgconfig

SRC_URI = "\
    git://git@github.com/bitsy-ai/printnanny-sdwire.git;protocol=ssh;nobranch=1;branch=main \
"
SRCREV = "cce4bc704d76d976533317c9449e0c3ba2f7f410"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = " \
    file://${WORKDIR}/git/LICENSE;md5=82a03598249f1a848c93ed67816b30ca \
"

S = "${WORKDIR}/git/src"

DEPENDS = "libftdi libusb1 popt"

do_install(){
    install -d "${D}${bindir}"
    install -m 0755 "${S}/sdwire" "${D}${bindir}/printnanny-sdwire"
}

FILES:${PN} = "${bindir}/printnanny-sdwire"
