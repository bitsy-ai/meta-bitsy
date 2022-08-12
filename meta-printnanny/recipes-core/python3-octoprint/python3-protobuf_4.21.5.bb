
SUMMARY = ""
HOMEPAGE = "https://developers.google.com/protocol-buffers/"
AUTHOR = "protobuf@googlegroups.com <protobuf@googlegroups.com>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=37b5762e07f0af8c74ce80a8bda4266b"

SRC_URI = "https://files.pythonhosted.org/packages/51/90/d2bf065b8753951e5fdba822af358edae6dac055b81f018e1ec74d8ba71e/protobuf-4.21.5.tar.gz"
SRC_URI[md5sum] = "b18b93ecd83ab036b908b9d7fca23b46"
SRC_URI[sha256sum] = "eb1106e87e095628e96884a877a51cdb90087106ee693925ec0a300468a9be3a"

S = "${WORKDIR}/protobuf-4.21.5"

RDEPENDS:${PN} = ""

inherit setuptools3
