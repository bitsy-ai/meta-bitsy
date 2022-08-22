
SUMMARY = "WebSocket client for Python with low level API options"
HOMEPAGE = "https://github.com/websocket-client/websocket-client.git"
AUTHOR = "liris <liris.pp@gmail.com>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b969e9612325987c823fc0737063ebc8"

SRC_URI = "https://files.pythonhosted.org/packages/0e/e7/e705ead133d21de4be752af4b3a0cb1f02514ff45bf165b3955c1ce22077/websocket-client-1.3.3.tar.gz"
SRC_URI[md5sum] = "d1c0798bbc5929657807c36de47d3137"
SRC_URI[sha256sum] = "d58c5f284d6a9bf8379dab423259fe8f85b70d5fa5d2916d5791a84594b122b1"

S = "${WORKDIR}/websocket-client-1.3.3"

RDEPENDS_${PN} = ""

inherit setuptools3
