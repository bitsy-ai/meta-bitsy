
SUMMARY = "HTTP library with thread-safe connection pooling, file post, and more."
HOMEPAGE = "https://urllib3.readthedocs.io/"
AUTHOR = "Andrey Petrov <andrey.petrov@shazow.net>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c2823cb995439c984fd62a973d79815c"

SRC_URI = "https://files.pythonhosted.org/packages/b2/56/d87d6d3c4121c0bcec116919350ca05dc3afd2eeb7dc88d07e8083f8ea94/urllib3-1.26.12.tar.gz"
SRC_URI[md5sum] = "ba308b52b9092184cf4905bc59a88fc0"
SRC_URI[sha256sum] = "3fa96cf423e6987997fc326ae8df396db2a8b7c667747d47ddd8ecba91f4a74e"

S = "${WORKDIR}/urllib3-1.26.12"

RDEPENDS_${PN} = ""

inherit setuptools3
