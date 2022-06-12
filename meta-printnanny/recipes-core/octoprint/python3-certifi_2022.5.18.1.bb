
SUMMARY = "Python package for providing Mozilla's CA Bundle."
HOMEPAGE = "https://github.com/certifi/python-certifi"
AUTHOR = "Kenneth Reitz <me@kennethreitz.com>"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=67da0714c3f9471067b729eca6c9fbe8"

SRC_URI = "https://files.pythonhosted.org/packages/07/10/75277f313d13a2b74fc56e29239d5c840c2bf09f17bf25c02b35558812c6/certifi-2022.5.18.1.tar.gz"
SRC_URI[md5sum] = "70f3688480b8fc4556c033f3ea655d36"
SRC_URI[sha256sum] = "9c5705e395cd70084351dd8ad5c41e65655e08ce46f2ec9cf6c2c08390f71eb7"

S = "${WORKDIR}/certifi-2022.5.18.1"

RDEPENDS:${PN} = ""

inherit setuptools3
