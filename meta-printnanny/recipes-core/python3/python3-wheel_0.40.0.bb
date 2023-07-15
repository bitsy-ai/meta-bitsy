
SUMMARY = "A built-package format for Python"
HOMEPAGE = ""
AUTHOR = " <Daniel Holth <dholth@fastmail.fm>>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7ffb0db04527cfe380e4f2726bd05ebf"

SRC_URI = "https://files.pythonhosted.org/packages/fc/ef/0335f7217dd1e8096a9e8383e1d472aa14717878ffe07c4772e68b6e8735/wheel-0.40.0.tar.gz"
SRC_URI[md5sum] = "ec5004c46d1905da98bb5bc1a10ddd21"
SRC_URI[sha256sum] = "cd1196f3faee2b31968d626e1731c94f99cbdb67cf5a46e4f5656cbee7738873"

S = "${WORKDIR}/wheel-0.40.0"

RDEPENDS:${PN} = ""

inherit setuptools3
