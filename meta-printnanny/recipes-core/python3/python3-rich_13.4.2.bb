
SUMMARY = "Render rich text, tables, progress bars, syntax highlighting, markdown and more to the terminal"
HOMEPAGE = "https://github.com/Textualize/rich"
AUTHOR = "Will McGugan <willmcgugan@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b5f0b94fbc94f5ad9ae4efcf8a778303"

SRC_URI = "https://files.pythonhosted.org/packages/e3/12/67d0098eb77005f5e068de639e6f4cfb8f24e6fcb0fd2037df0e1d538fee/rich-13.4.2.tar.gz"
SRC_URI[md5sum] = "67df537898c4d7c22219c2a6881d4ea3"
SRC_URI[sha256sum] = "d653d6bccede5844304c605d5aac802c7cf9621efd700b46c7ec2b51ea914898"

S = "${WORKDIR}/rich-13.4.2"

RDEPENDS:${PN} = "python3-pygments python3-markdown-it-py"

inherit python_poetry_core
