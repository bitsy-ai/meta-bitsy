
SUMMARY = "A simple immutable dictionary"
HOMEPAGE = "https://github.com/Marco-Sulla/python-frozendict"
AUTHOR = "Marco Sulla <marcosullaroma@gmail.com>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3000208d539ec061b899bce1d9ce9404"

SRC_URI = "https://files.pythonhosted.org/packages/90/c9/92204146ee2833ef1d509076b22705448c05b623cc7bed4716b2dff1d096/frozendict-2.3.2.tar.gz"
SRC_URI[md5sum] = "ccddc98900accefe753483ad01b3f618"
SRC_URI[sha256sum] = "7fac4542f0a13fbe704db4942f41ba3abffec5af8b100025973e59dff6a09d0d"

S = "${WORKDIR}/frozendict-2.3.2"

RDEPENDS:${PN} = ""

inherit setuptools3
