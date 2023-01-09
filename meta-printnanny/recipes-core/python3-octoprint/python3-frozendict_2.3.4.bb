
SUMMARY = "A simple immutable dictionary"
HOMEPAGE = "https://github.com/Marco-Sulla/python-frozendict"
AUTHOR = "Marco Sulla <marcosullaroma@gmail.com>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3000208d539ec061b899bce1d9ce9404"

SRC_URI = "https://files.pythonhosted.org/packages/2d/ad/96e39d15df0c825d55dc0481016a7c743ad646d7fd4c11caf9306c606f93/frozendict-2.3.4.tar.gz"
SRC_URI[md5sum] = "f97c3c77b6bbcc069985bcb1cac2c348"
SRC_URI[sha256sum] = "15b4b18346259392b0d27598f240e9390fafbff882137a9c48a1e0104fb17f78"

S = "${WORKDIR}/frozendict-2.3.4"

RDEPENDS:${PN} = ""

inherit setuptools3
BBCLASSEXTEND = "native nativesdk"
