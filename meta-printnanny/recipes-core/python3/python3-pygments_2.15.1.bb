
SUMMARY = "Pygments is a syntax highlighting package written in Python."
HOMEPAGE = ""
AUTHOR = " <Georg Brandl <georg@python.org>>"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=36a13c90514e2899f1eba7f41c3ee592"

SRC_URI = "https://files.pythonhosted.org/packages/89/6b/2114e54b290824197006e41be3f9bbe1a26e9c39d1f5fa20a6d62945a0b3/Pygments-2.15.1.tar.gz"
SRC_URI[md5sum] = "e40631bb812bbd15954027c23b23013a"
SRC_URI[sha256sum] = "8ace4d3c1dd481894b2005f560ead0f9f19ee64fe983366be1a21e171d12775c"

S = "${WORKDIR}/Pygments-2.15.1"

RDEPENDS:${PN} = ""

inherit python_setuptools_build_meta
