
SUMMARY = "The comprehensive WSGI web application library."
HOMEPAGE = ""
AUTHOR = " <>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=5dc88300786f1c214c1e9827a5229462"

RDEPENDS:${PN} = "python3-markupsafe"

PYPI_PACKAGE = "Werkzeug"
SRC_URI[sha256sum] = "2e1ccc9417d4da358b9de6f174e3ac094391ea1d4fbef2d667865d819dfd0afe"

inherit pypi python_setuptools_build_meta