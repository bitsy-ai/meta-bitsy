
SUMMARY = "Composable command line interface toolkit"
HOMEPAGE = "https://palletsprojects.com/p/click/"
AUTHOR = " <>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=1fa98232fd645608937a0fdc82e999b8"

SRC_URI = "https://files.pythonhosted.org/packages/7e/ad/7a6a96fab480fb2fbf52f782b2deb3abe1d2c81eca3ef68a575b5a6a4f2e/click-8.1.5.tar.gz"
SRC_URI[md5sum] = "7ca55ba4d82321d69594e3a1a4164132"
SRC_URI[sha256sum] = "4be4b1af8d665c6d942909916d31a213a106800c47d0eeba73d34da3cbc11367"

S = "${WORKDIR}/click-8.1.5"

RDEPENDS:${PN} = ""

inherit setuptools3
