
SUMMARY = "Tornado is a Python web framework and asynchronous networking library, originally developed at FriendFeed."
HOMEPAGE = "http://www.tornadoweb.org/"
AUTHOR = "Facebook <python-tornado@googlegroups.com>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://files.pythonhosted.org/packages/30/f0/6e5d85d422a26fd696a1f2613ab8119495c1ebb8f49e29f428d15daf79cc/tornado-6.3.2.tar.gz"
SRC_URI[md5sum] = "cabfe39cb7eb09d8128d4ac3deb934ce"
SRC_URI[sha256sum] = "4b927c4f19b71e627b13f3db2324e4ae660527143f9e1f2e2fb404f3a187e2ba"

S = "${WORKDIR}/tornado-6.3.2"

RDEPENDS:${PN} = ""

inherit setuptools3
