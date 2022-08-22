
SUMMARY = "Python package for providing Mozilla's CA Bundle."
HOMEPAGE = "https://github.com/certifi/python-certifi"
AUTHOR = "Kenneth Reitz <me@kennethreitz.com>"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=67da0714c3f9471067b729eca6c9fbe8"

SRC_URI = "https://files.pythonhosted.org/packages/cc/85/319a8a684e8ac6d87a1193090e06b6bbb302717496380e225ee10487c888/certifi-2022.6.15.tar.gz"
SRC_URI[md5sum] = "d8a2f5d006b656e2b9ee102a3be11a26"
SRC_URI[sha256sum] = "84c85a9078b11105f04f3036a9482ae10e4621616db313fe045dd24743a0820d"

S = "${WORKDIR}/certifi-2022.6.15"

RDEPENDS_${PN} = ""

inherit setuptools3
