
SUMMARY = "Core utilities for Python packages"
HOMEPAGE = ""
AUTHOR = " <Donald Stufft <donald@stufft.io>>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE.APACHE;md5=2ee41112a44fe7014dce33e26468ba93"

SRC_URI = "https://files.pythonhosted.org/packages/b9/6c/7c6658d258d7971c5eb0d9b69fa9265879ec9a9158031206d47800ae2213/packaging-23.1.tar.gz"
SRC_URI[md5sum] = "f7d5c39c6f92cc2dfa1293ba8f6c097c"
SRC_URI[sha256sum] = "a392980d2b6cffa644431898be54b0045151319d1e7ec34f0cfed48767dd334f"

S = "${WORKDIR}/packaging-23.1"

RDEPENDS:${PN} = ""

inherit python_flit_core
