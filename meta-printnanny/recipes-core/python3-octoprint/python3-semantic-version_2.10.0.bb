
SUMMARY = "A library implementing the 'SemVer' scheme."
HOMEPAGE = "https://github.com/rbarrois/python-semanticversion"
AUTHOR = "Raphaël Barrois <raphael.barrois+semver@polytechnique.org>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4fb31e3c1c7eeb8b5e8c07657cdd54e2"

SRC_URI = "https://files.pythonhosted.org/packages/7d/31/f2289ce78b9b473d582568c234e104d2a342fd658cc288a7553d83bb8595/semantic_version-2.10.0.tar.gz"
SRC_URI[md5sum] = "e48abef93ba69abcd4eaf4640edfc38b"
SRC_URI[sha256sum] = "bdabb6d336998cbb378d4b9db3a4b56a1e3235701dc05ea2690d9a997ed5041c"

S = "${WORKDIR}/semantic_version-2.10.0"

RDEPENDS:${PN} = ""

inherit setuptools3
