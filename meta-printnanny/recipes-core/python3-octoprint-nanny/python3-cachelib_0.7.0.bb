
SUMMARY = "A collection of cache libraries in the same API interface."
HOMEPAGE = "https://github.com/pallets/cachelib/"
AUTHOR = " <>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=64768ac879e3507b7e00379a63c2075b"

SRC_URI = "https://files.pythonhosted.org/packages/66/c5/97b924d700ffa3827c86c5cbcf85b41326c732cba1a6a891c82d3b4ad793/cachelib-0.7.0.tar.gz"
SRC_URI[md5sum] = "3a82f98689f7df8c447cb6c3719aca95"
SRC_URI[sha256sum] = "df254f3b900dc8684d8ebdd146c731ddb45edc6233a6cf7e3e834c949f360726"

S = "${WORKDIR}/cachelib-0.7.0"

RDEPENDS:${PN} = ""

inherit setuptools3
