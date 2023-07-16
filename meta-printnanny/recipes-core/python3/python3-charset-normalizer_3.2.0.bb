
SUMMARY = "The Real First Universal Charset Detector. Open, modern and actively maintained alternative to Chardet."
HOMEPAGE = "https://github.com/Ousret/charset_normalizer"
AUTHOR = "Ahmed TAHRI <ahmed.tahri@cloudnursery.dev>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0974a390827087287db39928f7c524b5"

SRC_URI = "https://files.pythonhosted.org/packages/2a/53/cf0a48de1bdcf6ff6e1c9a023f5f523dfe303e4024f216feac64b6eb7f67/charset-normalizer-3.2.0.tar.gz"
SRC_URI[md5sum] = "dbb8c5b745beddbaae67d06dce0b7c29"
SRC_URI[sha256sum] = "3bb3d25a8e6c0aedd251753a79ae98a093c7e7b471faa3aa9a93a81431987ace"

S = "${WORKDIR}/charset-normalizer-3.2.0"

RDEPENDS:${PN} = ""

inherit setuptools3
