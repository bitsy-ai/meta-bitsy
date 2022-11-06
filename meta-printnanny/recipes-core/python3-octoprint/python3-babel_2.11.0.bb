
SUMMARY = "Internationalization utilities"
HOMEPAGE = "https://babel.pocoo.org/"
AUTHOR = "Armin Ronacher <armin.ronacher@active-4.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fb98e9f202b978d6569807b9525cc691"

SRC_URI = "https://files.pythonhosted.org/packages/ff/80/45b42203ecc32c8de281f52e3ec81cb5e4ef16127e9e8543089d8b1649fb/Babel-2.11.0.tar.gz"
SRC_URI[md5sum] = "9ee7784fd452d456206ecd3a12694010"
SRC_URI[sha256sum] = "5ef4b3226b0180dedded4229651c8b0e1a3a6a2837d45a073272f313e4cf97f6"

S = "${WORKDIR}/Babel-2.11.0"

RDEPENDS:${PN} = "python3-pytz"

inherit setuptools3
