
SUMMARY = "Tornado is a Python web framework and asynchronous networking library, originally developed at FriendFeed."
HOMEPAGE = "http://www.tornadoweb.org/"
AUTHOR = "Facebook <python-tornado@googlegroups.com>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://files.pythonhosted.org/packages/f3/9e/225a41452f2d9418d89be5e32cf824c84fe1e639d350d6e8d49db5b7f73a/tornado-6.2.tar.gz"
SRC_URI[md5sum] = "32fbad606b439c3e1bf4e79d4e872741"
SRC_URI[sha256sum] = "9b630419bde84ec666bfd7ea0a4cb2a8a651c2d5cccdbdd1972a0c859dfc3c13"

S = "${WORKDIR}/tornado-6.2"

RDEPENDS:${PN} = ""

inherit setuptools3
BBCLASSEXTEND = "native nativesdk"
