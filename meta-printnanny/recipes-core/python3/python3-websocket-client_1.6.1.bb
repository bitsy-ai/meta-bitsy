
SUMMARY = "WebSocket client for Python with low level API options"
HOMEPAGE = "https://github.com/websocket-client/websocket-client.git"
AUTHOR = "liris <liris.pp@gmail.com>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6eae3bb7247ccb2c3a087ea8de759c01"

SRC_URI = "https://files.pythonhosted.org/packages/b1/34/3a5cae1e07d9566ad073fa6d169bf22c03a3ba7b31b3c3422ec88d039108/websocket-client-1.6.1.tar.gz"
SRC_URI[md5sum] = "86bc69b61947943627afc1b351c0b5db"
SRC_URI[sha256sum] = "c951af98631d24f8df89ab1019fc365f2227c0892f12fd150e935607c79dd0dd"

S = "${WORKDIR}/websocket-client-1.6.1"

RDEPENDS:${PN} = ""

inherit setuptools3
