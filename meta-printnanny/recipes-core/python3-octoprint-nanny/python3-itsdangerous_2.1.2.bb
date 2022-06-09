
SUMMARY = "Safely pass data to untrusted environments and back."
HOMEPAGE = "https://palletsprojects.com/p/itsdangerous/"
AUTHOR = "Armin Ronacher <armin.ronacher@active-4.com>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=4cda9a0ebd516714f360b0e9418cfb37"

SRC_URI = "https://files.pythonhosted.org/packages/7f/a1/d3fb83e7a61fa0c0d3d08ad0a94ddbeff3731c05212617dff3a94e097f08/itsdangerous-2.1.2.tar.gz"
SRC_URI[md5sum] = "c1bc730ddf53b8374eaa823f24eb6438"
SRC_URI[sha256sum] = "5dbbc68b317e5e42f327f9021763545dc3fc3bfe22e6deb96aaf1fc38874156a"

S = "${WORKDIR}/itsdangerous-2.1.2"

RDEPENDS:${PN} = ""

inherit setuptools3
