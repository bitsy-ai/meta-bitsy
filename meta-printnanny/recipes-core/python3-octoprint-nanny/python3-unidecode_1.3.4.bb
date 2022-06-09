
SUMMARY = "ASCII transliterations of Unicode text"
HOMEPAGE = ""
AUTHOR = "Tomaz Solc <tomaz.solc@tablix.org>"
LICENSE = "GPL-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "https://files.pythonhosted.org/packages/41/16/ee78864c2c2ba9bddba3978baa378f83270c8b7810eb7900f84e62a9ffac/Unidecode-1.3.4.tar.gz"
SRC_URI[md5sum] = "9cc5ae6c5d6ee1324091dfc54be727ac"
SRC_URI[sha256sum] = "8e4352fb93d5a735c788110d2e7ac8e8031eb06ccbfe8d324ab71735015f9342"

S = "${WORKDIR}/Unidecode-1.3.4"

RDEPENDS:${PN} = ""

inherit setuptools3
