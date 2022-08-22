
SUMMARY = "Filesystem events monitoring"
HOMEPAGE = "https://github.com/gorakhargosh/watchdog"
AUTHOR = "Yesudeep Mangalapilly <yesudeep@gmail.com>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://files.pythonhosted.org/packages/42/f7/da8e889f8626786eac9454e8d2718fc79359ed517be20cdd50c647167d39/watchdog-2.1.9.tar.gz"
SRC_URI[md5sum] = "0e60e0a2d3a8c18ba37105f8b44de810"
SRC_URI[sha256sum] = "43ce20ebb36a51f21fa376f76d1d4692452b2527ccd601950d69ed36b9e21609"

S = "${WORKDIR}/watchdog-2.1.9"

RDEPENDS_${PN} = ""

inherit setuptools3
