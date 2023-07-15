
SUMMARY = "Adds i18n/l10n support to Flask applications"
HOMEPAGE = "http://github.com/python-babel/flask-babel"
AUTHOR = "Armin Ronacher <armin.ronacher@active-4.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=51917f3e8e858f5ae295a7d0e2eb3cc9"

SRC_URI = "https://files.pythonhosted.org/packages/35/83/f31a4ff688168f9c8a73d80ebfc785dcd7703474a0802b25a78d54edd07c/flask_babel-3.1.0.tar.gz"
SRC_URI[md5sum] = "ad0a1b69044dde430ad9319d3a2f7b47"
SRC_URI[sha256sum] = "be015772c5d7f046f3b99c508dcf618636eb93d21b713b356db79f3e79f69f39"

S = "${WORKDIR}/Flask-Babel-3.1.0"

RDEPENDS:${PN} = "python3-pytz python3-flask python3-babel python3-jinja2"

inherit setuptools3
BBCLASSEXTEND = "native nativesdk"
