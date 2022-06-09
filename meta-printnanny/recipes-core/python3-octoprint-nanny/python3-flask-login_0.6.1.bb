
SUMMARY = "User authentication and session management for Flask."
HOMEPAGE = "https://github.com/maxcountryman/flask-login"
AUTHOR = "Matthew Frazier <leafstormrush@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8aa87a1cd9fa41d969ad32cfdac2c596"

SRC_URI = "https://files.pythonhosted.org/packages/3c/0a/e376d599eb6a8999b803a8d390e32451e43a346dbe540350dad48be0069c/Flask-Login-0.6.1.tar.gz"
SRC_URI[md5sum] = "0a1576eab473c2a8bb576348333d5ef5"
SRC_URI[sha256sum] = "1306d474a270a036d6fd14f45640c4d77355e4f1c67ca4331b372d3448997b8c"

S = "${WORKDIR}/Flask-Login-0.6.1"

RDEPENDS_${PN} = "python3-flask python3-werkzeug"

inherit setuptools3
