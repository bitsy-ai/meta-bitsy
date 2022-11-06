
SUMMARY = "The Real First Universal Charset Detector. Open, modern and actively maintained alternative to Chardet."
HOMEPAGE = "https://github.com/Ousret/charset_normalizer"
AUTHOR = "Ahmed TAHRI <ahmed.tahri@cloudnursery.dev>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0974a390827087287db39928f7c524b5"

SRC_URI = "https://files.pythonhosted.org/packages/fe/77/6d5d367b7cfee812a88573e80bbe25cea2d015ed2c3490e4464951ff3232/charset-normalizer-3.0.0.tar.gz"
SRC_URI[md5sum] = "169527085be8e6bb7874164c24481eca"
SRC_URI[sha256sum] = "b27d10ad15740b45fd55f76e6901a4391e6dca3917ef48ecdcf17edf6e00d770"

S = "${WORKDIR}/charset-normalizer-3.0.0"

RDEPENDS:${PN} = ""

inherit setuptools3
