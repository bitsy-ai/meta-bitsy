
SUMMARY = ""
HOMEPAGE = "https://developers.google.com/protocol-buffers/"
AUTHOR = "protobuf@googlegroups.com <protobuf@googlegroups.com>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=37b5762e07f0af8c74ce80a8bda4266b"

SRC_URI = "https://files.pythonhosted.org/packages/0f/cd/165eaac1c43a5ba391a36087dc909e03c3ae3f7dbcab74f287631208ba92/protobuf-4.21.9.tar.gz"
SRC_URI[md5sum] = "6aecaf19d552f238e77119f37597f7fd"
SRC_URI[sha256sum] = "61f21493d96d2a77f9ca84fefa105872550ab5ef71d21c458eb80edcf4885a99"

S = "${WORKDIR}/protobuf-4.21.9"

RDEPENDS:${PN} = ""

inherit setuptools3
