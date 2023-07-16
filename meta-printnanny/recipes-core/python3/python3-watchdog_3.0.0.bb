
SUMMARY = "Filesystem events monitoring"
HOMEPAGE = "https://github.com/gorakhargosh/watchdog"
AUTHOR = "Yesudeep Mangalapilly <yesudeep@gmail.com>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://files.pythonhosted.org/packages/95/a6/d6ef450393dac5734c63c40a131f66808d2e6f59f6165ab38c98fbe4e6ec/watchdog-3.0.0.tar.gz"
SRC_URI[md5sum] = "95f80dbc1f567b509a67bb18919ce780"
SRC_URI[sha256sum] = "4d98a320595da7a7c5a18fc48cb633c2e73cda78f93cac2ef42d42bf609a33f9"

S = "${WORKDIR}/watchdog-3.0.0"

RDEPENDS:${PN} = ""

inherit setuptools3
