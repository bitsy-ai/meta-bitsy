
SUMMARY = "A collection of cache libraries in the same API interface."
HOMEPAGE = "https://github.com/pallets/cachelib/"
AUTHOR = " <>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=64768ac879e3507b7e00379a63c2075b"

SRC_URI = "https://files.pythonhosted.org/packages/79/f2/1c76df4d295789bbc836eea50b813d64f86e640c29fe8f0a3686e9c4e3e9/cachelib-0.9.0.tar.gz"
SRC_URI[md5sum] = "63abb06e173a29a90a401f92130dc805"
SRC_URI[sha256sum] = "38222cc7c1b79a23606de5c2607f4925779e37cdcea1c2ad21b8bae94b5425a5"

S = "${WORKDIR}/cachelib-0.9.0"

RDEPENDS_${PN} = ""

inherit setuptools3
