
SUMMARY = "A modern and easy to use streamable zip file generator"
HOMEPAGE = "https://github.com/pR0Ps/zipstream-ng"
AUTHOR = " <>"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3000208d539ec061b899bce1d9ce9404"

SRC_URI = "https://files.pythonhosted.org/packages/8f/ea/9436abb4d2aa1e2f91ead252377e33aea6d95506c47c8feec0018e105d4d/zipstream-ng-1.3.4.tar.gz"
SRC_URI[md5sum] = "d554185129c5681f4d17bc24f516e485"
SRC_URI[sha256sum] = "69fe93aee98b597d98c631930a62d3af429e6038297ac1aaf0b3b148fe8ffdf7"

S = "${WORKDIR}/zipstream-ng-1.3.4"

RDEPENDS:${PN} = ""

inherit setuptools3
