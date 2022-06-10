
SUMMARY = "WebSocket client for Python with low level API options"
HOMEPAGE = "https://github.com/websocket-client/websocket-client.git"
AUTHOR = "liris <liris.pp@gmail.com>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b969e9612325987c823fc0737063ebc8"

SRC_URI = "https://files.pythonhosted.org/packages/7c/de/9f5354b4b37df453b7d664f587124c70a75c81805095d491d39f5b591818/websocket-client-1.3.2.tar.gz"
SRC_URI[md5sum] = "7331d3ab81da9bdff17ff08094bd00d9"
SRC_URI[sha256sum] = "50b21db0058f7a953d67cc0445be4b948d7fc196ecbeb8083d68d94628e4abf6"

S = "${WORKDIR}/websocket-client-1.3.2"

RDEPENDS:${PN} = ""

inherit setuptools3
