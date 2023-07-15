
SUMMARY = "Fast, simple object-to-object and broadcast signaling"
HOMEPAGE = ""
AUTHOR = " <Jason Kirtland <jek@discorporate.us>>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=42cd19c88fc13d1307a4efd64ee90e4e"

SRC_URI = "https://files.pythonhosted.org/packages/e8/f9/a05287f3d5c54d20f51a235ace01f50620984bc7ca5ceee781dc645211c5/blinker-1.6.2.tar.gz"
SRC_URI[md5sum] = "1c7375d100a67ba368d9cde0ab2d8cfa"
SRC_URI[sha256sum] = "4afd3de66ef3a9f8067559fb7a1cbe555c17dcbe15971b05d1b625c3e7abe213"

S = "${WORKDIR}/blinker-1.6.2"

RDEPENDS:${PN} = ""

inherit python_setuptools_build_meta
