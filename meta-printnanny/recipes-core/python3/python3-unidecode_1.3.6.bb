
SUMMARY = "ASCII transliterations of Unicode text"
HOMEPAGE = ""
AUTHOR = "Tomaz Solc <tomaz.solc@tablix.org>"
LICENSE = "GPL-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "https://files.pythonhosted.org/packages/0b/25/37c77fc07821cd06592df3f18281f5e716bc891abd6822ddb9ff941f821e/Unidecode-1.3.6.tar.gz"
SRC_URI[md5sum] = "05d6d2fa527ba8538eadd5c611e9e0d8"
SRC_URI[sha256sum] = "fed09cf0be8cf415b391642c2a5addfc72194407caee4f98719e40ec2a72b830"

S = "${WORKDIR}/Unidecode-1.3.6"

RDEPENDS:${PN} = ""

inherit setuptools3
