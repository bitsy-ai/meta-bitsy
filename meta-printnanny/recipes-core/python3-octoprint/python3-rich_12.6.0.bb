
SUMMARY = "Render rich text, tables, progress bars, syntax highlighting, markdown and more to the terminal"
HOMEPAGE = "https://github.com/willmcgugan/rich"
AUTHOR = "Will McGugan <willmcgugan@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b5f0b94fbc94f5ad9ae4efcf8a778303"

SRC_URI = "https://files.pythonhosted.org/packages/11/23/814edf09ec6470d52022b9e95c23c1bef77f0bc451761e1504ebd09606d3/rich-12.6.0.tar.gz"
SRC_URI[md5sum] = "6e4970bdc1ac762e5855bd67b08f873e"
SRC_URI[sha256sum] = "ba3a3775974105c221d31141f2c116f4fd65c5ceb0698657a11e9f295ec93fd0"

S = "${WORKDIR}/rich-12.6.0"

RDEPENDS_${PN} = "python3-pygments python3-commonmark"

inherit setuptools3
