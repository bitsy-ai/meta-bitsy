
SUMMARY = "A collection of cache libraries in the same API interface."
HOMEPAGE = "https://github.com/pallets/cachelib/"
AUTHOR = " <>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=64768ac879e3507b7e00379a63c2075b"

SRC_URI[sha256sum] = "dcb5fafe6b6b544aaa8d0cacb12d70bbf9bbf72c041f17fcad1618db7bedeada"

RDEPENDS:${PN} = ""

inherit setuptools3 pypi
