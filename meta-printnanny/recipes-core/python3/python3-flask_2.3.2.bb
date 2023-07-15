
SUMMARY = "A simple framework for building complex web applications."
HOMEPAGE = ""
AUTHOR = " <Armin Ronacher <armin.ronacher@active-4.com>>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=ffeffa59c90c9c4a033c7574f8f3fb75"

SRC_URI = "https://files.pythonhosted.org/packages/4d/00/ef81c18da32fdfcde6381c315f4b11597fb6691180a330418848efee0ae7/Flask-2.3.2.tar.gz"
SRC_URI[md5sum] = "a5d5fe05dff5c6e0d28ece3fb03ef5cd"
SRC_URI[sha256sum] = "8c2f9abd47a9e8df7f0c3f091ce9497d011dc3b31effcf4c85a6e2b50f4114ef"

S = "${WORKDIR}/Flask-2.3.2"

RDEPENDS:${PN} = "python3-werkzeug python3-jinja2 python3-itsdangerous python3-click python3-blinker"

inherit python_setuptools_build_meta
