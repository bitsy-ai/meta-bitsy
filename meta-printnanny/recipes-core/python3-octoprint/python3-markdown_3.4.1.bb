
SUMMARY = "Python implementation of Markdown."
HOMEPAGE = "https://Python-Markdown.github.io/"
AUTHOR = "Manfred Stienstra, Yuri takhteyev and Waylan limberg <python.markdown@gmail.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=745aaad0c69c60039e638bff9ffc59ed"

SRC_URI = "https://files.pythonhosted.org/packages/85/7e/133e943e97a943d2f1d8bae0c5060f8ac50e6691754eb9dbe036b047a9bb/Markdown-3.4.1.tar.gz"
SRC_URI[md5sum] = "597656cf4feadf1998b0511201620202"
SRC_URI[sha256sum] = "3b809086bb6efad416156e00a0da66fe47618a5d6918dd688f53f40c8e4cfeff"

S = "${WORKDIR}/Markdown-3.4.1"

RDEPENDS:${PN} = ""

inherit setuptools3
