
SUMMARY = "A least recently used (LRU) cache implementation"
HOMEPAGE = "https://github.com/jlhutch/pylru"
AUTHOR = "Jay Hutchinson <jlhutch+pylru@gmail.com>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "https://files.pythonhosted.org/packages/95/8e/2a0d3426738db0b41d69d36243bdd00420ad231e802d09dad8db02005d13/pylru-1.2.1.tar.gz"
SRC_URI[md5sum] = "101486c319fa219f147b8811975780d9"
SRC_URI[sha256sum] = "47ad140a63ab9389648dadfbb4330700e0ffeeb28ec04664ee47d37ed133b0f4"

S = "${WORKDIR}/pylru-1.2.1"

RDEPENDS:${PN} = ""

inherit setuptools3
BBCLASSEXTEND = "native nativesdk"
