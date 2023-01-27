
SUMMARY = "Alternative regular expression module, to replace re."
HOMEPAGE = "https://github.com/mrabarnett/mrab-regex"
AUTHOR = "Matthew Barnett <regex@mrabarnett.plus.com>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

SRC_URI = "https://files.pythonhosted.org/packages/27/b5/92d404279fd5f4f0a17235211bb0f5ae7a0d9afb7f439086ec247441ed28/regex-2022.10.31.tar.gz"
SRC_URI[md5sum] = "a85ced10be8bfe76fed4f30c42d32d5c"
SRC_URI[sha256sum] = "a3a98921da9a1bf8457aeee6a551948a83601689e5ecdd736894ea9bbec77e83"

S = "${WORKDIR}/regex-2022.10.31"

RDEPENDS:${PN} = ""

inherit setuptools3
