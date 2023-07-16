
SUMMARY = "Python implementation of John Gruber's Markdown."
HOMEPAGE = ""
AUTHOR = "Manfred Stienstra, Yuri Takhteyev <Waylan limberg <python.markdown@gmail.com>>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=745aaad0c69c60039e638bff9ffc59ed"

SRC_URI = "https://files.pythonhosted.org/packages/9d/80/cc67bfb7deb973d5ae662ee6454d2dafaa8f7c106feafd0d1572666ebde5/Markdown-3.4.3.tar.gz"
SRC_URI[md5sum] = "39083df5b9a5e70286fe7c557ef61312"
SRC_URI[sha256sum] = "8bf101198e004dc93e84a12a7395e31aac6a9c9942848ae1d99b9d72cf9b3520"

S = "${WORKDIR}/Markdown-3.4.3"

RDEPENDS:${PN} = ""

inherit python_setuptools_build_meta
