
SUMMARY = "The Real First Universal Charset Detector. Open, modern and actively maintained alternative to Chardet."
HOMEPAGE = "https://github.com/ousret/charset_normalizer"
AUTHOR = "Ahmed TAHRI @Ousret <ahmed.tahri@cloudnursery.dev>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0974a390827087287db39928f7c524b5"

SRC_URI = "https://files.pythonhosted.org/packages/56/31/7bcaf657fafb3c6db8c787a865434290b726653c912085fbd371e9b92e1c/charset-normalizer-2.0.12.tar.gz"
SRC_URI[md5sum] = "f6664e0e90dbb3cc9cfc154a980f9864"
SRC_URI[sha256sum] = "2857e29ff0d34db842cd7ca3230549d1a697f96ee6d3fb071cfa6c7393832597"

S = "${WORKDIR}/charset-normalizer-2.0.12"

RDEPENDS_${PN} = ""

inherit setuptools3
