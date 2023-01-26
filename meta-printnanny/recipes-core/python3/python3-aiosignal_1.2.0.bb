
SUMMARY = "aiosignal: a list of registered asynchronous callbacks"
HOMEPAGE = "https://github.com/aio-libs/aiosignal"
AUTHOR = "Nikolay Kim <fafhrd91@gmail.com>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cf056e8e7a0a5477451af18b7b5aa98c"

SRC_URI = "https://files.pythonhosted.org/packages/27/6b/a89fbcfae70cf53f066ec22591938296889d3cc58fec1e1c393b10e8d71d/aiosignal-1.2.0.tar.gz"
SRC_URI[md5sum] = "011700c3acc576a3a38deade6a4860cb"
SRC_URI[sha256sum] = "78ed67db6c7b7ced4f98e495e572106d5c432a93e1ddd1bf475e1dc05f5b7df2"

S = "${WORKDIR}/aiosignal-1.2.0"

RDEPENDS:${PN} = "python3-frozenlist"

inherit setuptools3
