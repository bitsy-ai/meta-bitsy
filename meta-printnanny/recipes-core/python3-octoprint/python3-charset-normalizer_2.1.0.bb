
SUMMARY = "The Real First Universal Charset Detector. Open, modern and actively maintained alternative to Chardet."
HOMEPAGE = "https://github.com/ousret/charset_normalizer"
AUTHOR = "Ahmed TAHRI @Ousret <ahmed.tahri@cloudnursery.dev>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0974a390827087287db39928f7c524b5"

SRC_URI = "https://files.pythonhosted.org/packages/93/1d/d9392056df6670ae2a29fcb04cfa5cee9f6fbde7311a1bb511d4115e9b7a/charset-normalizer-2.1.0.tar.gz"
SRC_URI[md5sum] = "c1be418ec00773d84d793f23b2bbc3cd"
SRC_URI[sha256sum] = "575e708016ff3a5e3681541cb9d79312c416835686d054a23accb873b254f413"

S = "${WORKDIR}/charset-normalizer-2.1.0"

RDEPENDS:${PN} = ""

inherit setuptools3
