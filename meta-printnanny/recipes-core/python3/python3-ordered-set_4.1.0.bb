
SUMMARY = "An OrderedSet is a custom MutableSet that remembers its order, so that every"
HOMEPAGE = ""
AUTHOR = " <Elia Robyn Lake <gh@arborelia.net>>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://MIT-LICENSE;md5=3bf5e1ad64c0d99032c3143361fa234e"

SRC_URI = "https://files.pythonhosted.org/packages/4c/ca/bfac8bc689799bcca4157e0e0ced07e70ce125193fc2e166d2e685b7e2fe/ordered-set-4.1.0.tar.gz"
SRC_URI[md5sum] = "2a9ba8d1a962c26f9a4fbe246b62ee77"
SRC_URI[sha256sum] = "694a8e44c87657c59292ede72891eb91d34131f6531463aab3009191c77364a8"

S = "${WORKDIR}/ordered-set-4.1.0"

RDEPENDS:${PN} = ""

inherit setuptools3
