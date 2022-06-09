
SUMMARY = "The comprehensive WSGI web application library."
HOMEPAGE = "https://palletsprojects.com/p/werkzeug/"
AUTHOR = "Armin Ronacher <armin.ronacher@active-4.com>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=5dc88300786f1c214c1e9827a5229462"

SRC_URI = "https://files.pythonhosted.org/packages/10/cf/97eb1a3847c01ae53e8376bc21145555ac95279523a935963dc8ff96c50b/Werkzeug-2.1.2.tar.gz"
SRC_URI[md5sum] = "5835c8738b8081c53367cbcc5db8784c"
SRC_URI[sha256sum] = "1ce08e8093ed67d638d63879fd1ba3735817f7a80de3674d293f5984f25fb6e6"

S = "${WORKDIR}/Werkzeug-2.1.2"

RDEPENDS_${PN} = ""

inherit setuptools3
