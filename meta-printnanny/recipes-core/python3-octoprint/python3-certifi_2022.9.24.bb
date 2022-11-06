
SUMMARY = "Python package for providing Mozilla's CA Bundle."
HOMEPAGE = "https://github.com/certifi/python-certifi"
AUTHOR = "Kenneth Reitz <me@kennethreitz.com>"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3c2b7404369c587c3559afb604fce2f2"

SRC_URI = "https://files.pythonhosted.org/packages/cb/a4/7de7cd59e429bd0ee6521ba58a75adaec136d32f91a761b28a11d8088d44/certifi-2022.9.24.tar.gz"
SRC_URI[md5sum] = "ff9c8d5c7e7fb083de6b874609c5ca68"
SRC_URI[sha256sum] = "0d9c601124e5a6ba9712dbc60d9c53c21e34f5f641fe83002317394311bdce14"

S = "${WORKDIR}/certifi-2022.9.24"

RDEPENDS:${PN} = ""

inherit setuptools3
