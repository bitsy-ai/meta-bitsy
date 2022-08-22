
SUMMARY = "Alternative regular expression module, to replace re."
HOMEPAGE = "https://github.com/mrabarnett/mrab-regex"
AUTHOR = "Matthew Barnett <regex@mrabarnett.plus.com>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

SRC_URI = "https://files.pythonhosted.org/packages/f7/e1/8b46ff54516faea4ea9469c4f5b50f2e9e73131f54d19e6827141698a822/regex-2022.8.17.tar.gz"
SRC_URI[md5sum] = "6b3c706a4d275af24f01496c10d516fa"
SRC_URI[sha256sum] = "5c77eab46f3a2b2cd8bbe06467df783543bf7396df431eb4a144cc4b89e9fb3c"

S = "${WORKDIR}/regex-2022.8.17"

RDEPENDS:${PN} = ""

inherit setuptools3
