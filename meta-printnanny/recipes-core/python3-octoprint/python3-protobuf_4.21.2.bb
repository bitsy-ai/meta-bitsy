
SUMMARY = ""
HOMEPAGE = "https://developers.google.com/protocol-buffers/"
AUTHOR = "protobuf@googlegroups.com <protobuf@googlegroups.com>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=37b5762e07f0af8c74ce80a8bda4266b"

SRC_URI = "https://files.pythonhosted.org/packages/28/01/d85a74fb076a172519f9d24cc68cdcf9a0cdc7c62ec6ae27feb33a88b602/protobuf-4.21.2.tar.gz"
SRC_URI[md5sum] = "f8aab8ac44108c8388fce0a30840c7d4"
SRC_URI[sha256sum] = "863f65e137d9de4a76cac39ae731a19bea1c30997f512ecf0dc9348112313401"

S = "${WORKDIR}/protobuf-4.21.2"

RDEPENDS:${PN} = ""

inherit setuptools3
