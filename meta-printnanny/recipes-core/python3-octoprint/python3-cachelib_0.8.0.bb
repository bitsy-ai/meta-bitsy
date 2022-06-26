
SUMMARY = "A collection of cache libraries in the same API interface."
HOMEPAGE = "https://github.com/pallets/cachelib/"
AUTHOR = " <>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=64768ac879e3507b7e00379a63c2075b"

SRC_URI = "https://files.pythonhosted.org/packages/95/c2/cf202f4bcf25946eb39067fbf17f558f8c68ceab36f2a84d203179898fcb/cachelib-0.8.0.tar.gz"
SRC_URI[md5sum] = "9c03d7f5c82bf52d08e5e2f53eef3edf"
SRC_URI[sha256sum] = "e358f6f82cf633891f0dbd3996e300b4657716ac44b301df33b9cb2cfd6eea6d"

S = "${WORKDIR}/cachelib-0.8.0"

RDEPENDS:${PN} = ""

inherit setuptools3
