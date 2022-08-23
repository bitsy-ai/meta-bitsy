
SUMMARY = "A string case conversion package."
HOMEPAGE = "https://github.com/chrisdoherty4/python-case-converter"
AUTHOR = "Chris Doherty <chris@chrisdoherty.io>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=410d299bce10eeba0916a78b0350b1b4"

SRC_URI = "https://files.pythonhosted.org/packages/76/d9/48a4f2bb0dbea1086836a25b64ba77f5ab23652a12f45d9bbd2fe3f13d35/case-converter-1.1.0.tar.gz"
SRC_URI[md5sum] = "bf3c3631c3d1db44a46ee589a52ad2d7"
SRC_URI[sha256sum] = "2ed3fc6e3ffa8d601f9a31ffcbc8fbd19eaeb48671a79a8ef16394672824510e"

S = "${WORKDIR}/case-converter-1.1.0"

RDEPENDS:${PN} = ""

inherit setuptools3
