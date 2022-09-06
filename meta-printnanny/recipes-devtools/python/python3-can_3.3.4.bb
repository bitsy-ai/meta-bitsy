DESCRIPTION = "Controller Area Network interface module for Python"
HOMEPAGE = "https://github.com/hardbyte/python-can"
LICENSE = "LGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e6a600fd5e1d9cbde2d983680233ad02"

PYPI_PACKAGE = "python-can"
SRC_URI[sha256sum] = "2d3c223b7adc4dd46ce258d4a33b7e0dbb6c339e002faa40ee4a69d5fdce9449"

inherit pypi setuptools3
BBCLASSEXTEND = "native nativesdk"
