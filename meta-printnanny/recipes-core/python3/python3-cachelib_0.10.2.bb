
SUMMARY = "A collection of cache libraries in the same API interface."
HOMEPAGE = "https://github.com/pallets-eco/cachelib/"
AUTHOR = " <>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=64768ac879e3507b7e00379a63c2075b"

SRC_URI = "https://files.pythonhosted.org/packages/70/0b/e7647e072ff60997d69517072145ef56898278afda7deff7cc6858b1541f/cachelib-0.10.2.tar.gz"
SRC_URI[md5sum] = "c3ed6f78aebb05a9d2454cb0f0e3184b"
SRC_URI[sha256sum] = "593faeee62a7c037d50fc835617a01b887503f972fb52b188ae7e50e9cb69740"

S = "${WORKDIR}/cachelib-0.10.2"

RDEPENDS:${PN} = ""

inherit setuptools3
