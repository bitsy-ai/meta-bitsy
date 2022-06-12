
SUMMARY = "Adds i18n/l10n support to Flask applications"
HOMEPAGE = "http://github.com/python-babel/flask-babel"
AUTHOR = "Armin Ronacher <armin.ronacher@active-4.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=51917f3e8e858f5ae295a7d0e2eb3cc9"

SRC_URI = "https://files.pythonhosted.org/packages/d7/fe/655e6a5a99ceb815fe839f0698956a9d6c7d5bcc06ca1ee7c6eb6dac154b/Flask-Babel-2.0.0.tar.gz"
SRC_URI[md5sum] = "50d5e92d96ef58787bf85b5a1b0a5567"
SRC_URI[sha256sum] = "f9faf45cdb2e1a32ea2ec14403587d4295108f35017a7821a2b1acb8cfd9257d"

S = "${WORKDIR}/Flask-Babel-2.0.0"

RDEPENDS:${PN} = "python3-pytz python3-flask python3-babel python3-jinja2"

inherit setuptools3
