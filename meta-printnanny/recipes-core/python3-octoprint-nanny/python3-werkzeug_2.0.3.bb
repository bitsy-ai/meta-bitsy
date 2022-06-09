
SUMMARY = "The comprehensive WSGI web application library."
HOMEPAGE = "https://palletsprojects.com/p/werkzeug/"
AUTHOR = "Armin Ronacher <armin.ronacher@active-4.com>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=5dc88300786f1c214c1e9827a5229462"

SRC_URI = "https://files.pythonhosted.org/packages/6c/a8/60514fade2318e277453c9588545d0c335ea3ea6440ce5cdabfca7f73117/Werkzeug-2.0.3.tar.gz"
SRC_URI[md5sum] = "467e7b13f30479dd6d2c8c1eeb42515f"
SRC_URI[sha256sum] = "b863f8ff057c522164b6067c9e28b041161b4be5ba4d0daceeaa50a163822d3c"

S = "${WORKDIR}/Werkzeug-2.0.3"

RDEPENDS:${PN} = ""

inherit setuptools3
