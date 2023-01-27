
SUMMARY = "Pygments is a syntax highlighting package written in Python."
HOMEPAGE = "https://pygments.org/"
AUTHOR = "Georg Brandl <georg@python.org>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=36a13c90514e2899f1eba7f41c3ee592"

SRC_URI = "https://files.pythonhosted.org/packages/e0/ef/5905cd3642f2337d44143529c941cc3a02e5af16f0f65f81cbef7af452bb/Pygments-2.13.0.tar.gz"
SRC_URI[md5sum] = "6ccae578d28d18968b30a4711652fd9a"
SRC_URI[sha256sum] = "56a8508ae95f98e2b9bdf93a6be5ae3f7d8af858b43e02c5a2ff083726be40c1"

S = "${WORKDIR}/Pygments-2.13.0"

RDEPENDS:${PN} = ""

inherit setuptools3
