
SUMMARY = "Alternative regular expression module, to replace re."
HOMEPAGE = "https://github.com/mrabarnett/mrab-regex"
AUTHOR = "Matthew Barnett <regex@mrabarnett.plus.com>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

SRC_URI = "https://files.pythonhosted.org/packages/1a/6b/9b6b8284e88105acbcb39e71bd3bfcaffcd36c2601152ae23b00e6e04d91/regex-2022.6.2.tar.gz"
SRC_URI[md5sum] = "a2b630e676c9456b06f9f9feb0bd6166"
SRC_URI[sha256sum] = "f7b43acb2c46fb2cd506965b2d9cf4c5e64c9c612bac26c1187933c7296bf08c"

S = "${WORKDIR}/regex-2022.6.2"

RDEPENDS:${PN} = ""

inherit setuptools3
