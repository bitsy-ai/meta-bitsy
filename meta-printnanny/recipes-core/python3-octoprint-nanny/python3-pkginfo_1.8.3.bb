
SUMMARY = "Query metadatdata from sdists / bdists / installed packages."
HOMEPAGE = "https://code.launchpad.net/~tseaver/pkginfo/trunk"
AUTHOR = "Tres Seaver, Agendaless Consulting <tseaver@agendaless.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=6fc86b61c6077306ca1f5edc8edcc490"

SRC_URI = "https://files.pythonhosted.org/packages/00/91/fe0806e3ebded8c4e52f93ab4d963eef34bb33595c7aa7b5591d32ab5b92/pkginfo-1.8.3.tar.gz"
SRC_URI[md5sum] = "e67d8f6e37ca37b5512384655bbce760"
SRC_URI[sha256sum] = "a84da4318dd86f870a9447a8c98340aa06216bfc6f2b7bdc4b8766984ae1867c"

S = "${WORKDIR}/pkginfo-1.8.3"

RDEPENDS_${PN} = ""

inherit setuptools3
