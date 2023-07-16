
SUMMARY = "Alternative regular expression module, to replace re."
HOMEPAGE = "https://github.com/mrabarnett/mrab-regex"
AUTHOR = "Matthew Barnett <regex@mrabarnett.plus.com>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

SRC_URI = "https://files.pythonhosted.org/packages/18/df/401fd39ffd50062ff1e0344f95f8e2c141de4fd1eca1677d2f29609e5389/regex-2023.6.3.tar.gz"
SRC_URI[md5sum] = "8bd710d62b727ca92c89ab566bdf5128"
SRC_URI[sha256sum] = "72d1a25bf36d2050ceb35b517afe13864865268dfb45910e2e17a84be6cbfeb0"

S = "${WORKDIR}/regex-2023.6.3"

RDEPENDS:${PN} = ""

inherit setuptools3
