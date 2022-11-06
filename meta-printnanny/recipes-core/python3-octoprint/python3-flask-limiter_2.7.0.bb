
SUMMARY = "Rate limiting for flask applications"
HOMEPAGE = "https://flask-limiter.readthedocs.org"
AUTHOR = "Ali-Akber Saifee <ali@indydevs.org>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=9a60a272513852526711e0e1032f0832"

SRC_URI = "https://files.pythonhosted.org/packages/36/6a/91a4f7122d2bc084cade793beae28da814a428c5b00d174c2c53b893601c/Flask-Limiter-2.7.0.tar.gz"
SRC_URI[md5sum] = "138be7f9679d96109fa4104c7f932ac1"
SRC_URI[sha256sum] = "a83164ab3fd264c7e565eeebd1f825cfd014ef4972cc742dbcf0d221e3c38092"

S = "${WORKDIR}/Flask-Limiter-2.7.0"

RDEPENDS:${PN} = "python3-limits python3-flask python3-rich python3-typing-extensions"

inherit setuptools3
