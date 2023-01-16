SUMMARY = "PrintNanny SDWire Command-Line Tool"
HOMEPAGE = "https://github.com/bitsy-ai/printnanny-sdwire"

inherit pkgconfig

SRC_URI = "\
    https://github.com/bitsy-ai/printnanny-sdwire \
"

SRCREV = "d1b25bec8f9f476fce1ec95a9edff8ed90015654"
LICENSE = "Apache-2.0"
S = "${WORKDIR}/git"

DEPENDS = "libftdi1 libusb1"

do_install(){
    install -d "${D}${bindir}"
    install -m 0755 "${WORKDIR}/sdwire" "${D}${bindir}/printnanny-sdwire"
}

FILES:${PN} = "${bindir}/printnanny-sdwire"
