
SUMMARY = ""
HOMEPAGE = "https://developers.google.com/protocol-buffers/"
AUTHOR = "protobuf@googlegroups.com <protobuf@googlegroups.com>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=37b5762e07f0af8c74ce80a8bda4266b"

SRC_URI = "https://files.pythonhosted.org/packages/06/86/643f14a2ef25774fdcada5762b61ffbe1678bbf428748d0c9e0ad7576960/protobuf-4.21.1.tar.gz"
SRC_URI[md5sum] = "94dcbf03b03034370e30f3d07c5c75b5"
SRC_URI[sha256sum] = "5d9b5c8270461706973c3871c6fbdd236b51dfe9dab652f1fb6a36aa88287e47"

S = "${WORKDIR}/protobuf-4.21.1"

RDEPENDS:${PN} = ""

inherit setuptools3
