
SUMMARY = "The Real First Universal Charset Detector. Open, modern and actively maintained alternative to Chardet."
HOMEPAGE = "https://github.com/ousret/charset_normalizer"
AUTHOR = "Ahmed TAHRI @Ousret <ahmed.tahri@cloudnursery.dev>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0974a390827087287db39928f7c524b5"

SRC_URI = "https://files.pythonhosted.org/packages/a1/34/44964211e5410b051e4b8d2869c470ae8a68ae274953b1c7de6d98bbcf94/charset-normalizer-2.1.1.tar.gz"
SRC_URI[md5sum] = "a70f9fc85b6b8265c982eca6fe51381f"
SRC_URI[sha256sum] = "5a3d016c7c547f69d6f81fb0db9449ce888b418b5b9952cc5e6e66843e9dd845"

S = "${WORKDIR}/charset-normalizer-2.1.1"

RDEPENDS_${PN} = ""

inherit setuptools3
