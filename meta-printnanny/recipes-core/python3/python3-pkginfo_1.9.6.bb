
SUMMARY = "Query metadata from sdists / bdists / installed packages."
HOMEPAGE = "https://code.launchpad.net/~tseaver/pkginfo/trunk"
AUTHOR = "Tres Seaver, Agendaless Consulting <tseaver@agendaless.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=6fc86b61c6077306ca1f5edc8edcc490"

SRC_URI = "https://files.pythonhosted.org/packages/b4/1c/89b38e431c20d6b2389ed8b3926c2ab72f58944733ba029354c6d9f69129/pkginfo-1.9.6.tar.gz"
SRC_URI[md5sum] = "8c1c78c8ee593e745c69080663c26df6"
SRC_URI[sha256sum] = "8fd5896e8718a4372f0ea9cc9d96f6417c9b986e23a4d116dda26b62cc29d046"

S = "${WORKDIR}/pkginfo-1.9.6"

RDEPENDS:${PN} = ""

inherit setuptools3
