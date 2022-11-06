
SUMMARY = "WebSocket client for Python with low level API options"
HOMEPAGE = "https://github.com/websocket-client/websocket-client.git"
AUTHOR = "liris <liris.pp@gmail.com>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b969e9612325987c823fc0737063ebc8"

SRC_URI = "https://files.pythonhosted.org/packages/75/af/1d13b93e7a21aca7f8ab8645fcfcfad21fc39716dc9dce5dc2a97f73ff78/websocket-client-1.4.2.tar.gz"
SRC_URI[md5sum] = "26d1d8db59c9417570d8ec73ace1687b"
SRC_URI[sha256sum] = "d6e8f90ca8e2dd4e8027c4561adeb9456b54044312dba655e7cae652ceb9ae59"

S = "${WORKDIR}/websocket-client-1.4.2"

RDEPENDS:${PN} = ""

inherit setuptools3
