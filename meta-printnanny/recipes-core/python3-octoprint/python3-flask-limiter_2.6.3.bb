
SUMMARY = "Rate limiting for flask applications"
HOMEPAGE = "https://passlib.readthedocs.io/en/stable/"
AUTHOR = "Ali-Akber Saifee <ali@indydevs.org>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI[sha256sum] = "01c32180e6136e6f68aeb60852a9a2881cc350eca8932ef9b4591a7ef9f9581c"
inherit pypi setuptools3
PYPI_PACKAGE = "Flask-Limiter"
