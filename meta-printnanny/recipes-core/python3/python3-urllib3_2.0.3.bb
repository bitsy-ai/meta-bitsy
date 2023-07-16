
SUMMARY = "HTTP library with thread-safe connection pooling, file post, and more."
HOMEPAGE = "https://urllib3.readthedocs.io/"
AUTHOR = " <Andrey Petrov <andrey.petrov@shazow.net>>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=52d273a3054ced561275d4d15260ecda"

SRC_URI = "https://files.pythonhosted.org/packages/d6/af/3b4cfedd46b3addab52e84a71ab26518272c23c77116de3c61ead54af903/urllib3-2.0.3.tar.gz"
SRC_URI[md5sum] = "39c1af575eac4938c33e9bdf4549c1dd"
SRC_URI[sha256sum] = "bee28b5e56addb8226c96f7f13ac28cb4c301dd5ea8a6ca179c0b9835e032825"

S = "${WORKDIR}/urllib3-2.0.3"

RDEPENDS:${PN} = ""

inherit python_hatchling
