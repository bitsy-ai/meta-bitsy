
SUMMARY = "cChardet is high speed universal character encoding detector."
HOMEPAGE = "https://github.com/PyYoshi/cChardet"
AUTHOR = "PyYoshi <myoshi321go@gmail.com>"
LICENSE = "MPL"
LIC_FILES_CHKSUM = "file://COPYING;md5=6ecda54f6f525388d71d6b3cd92f7474"

SRC_URI = "https://files.pythonhosted.org/packages/a8/5d/090c9f0312b7988a9433246c9cf0b566b1ae1374368cfb8ac897218a4f65/cchardet-2.1.7.tar.gz"
SRC_URI[md5sum] = "8a76472ad09c68c12069203ea9348ee3"
SRC_URI[sha256sum] = "c428b6336545053c2589f6caf24ea32276c6664cb86db817e03a94c60afa0eaf"

S = "${WORKDIR}/cchardet-2.1.7"

RDEPENDS:${PN} = ""

inherit setuptools3
