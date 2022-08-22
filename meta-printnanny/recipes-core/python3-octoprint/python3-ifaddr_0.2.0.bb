
SUMMARY = "Cross-platform network interface and IP address enumeration library"
HOMEPAGE = "https://github.com/pydron/ifaddr"
AUTHOR = "Stefan C. Mueller <scm@smurn.org>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8debe8d42320ec0ff24665319b625a5e"

SRC_URI = "https://files.pythonhosted.org/packages/e8/ac/fb4c578f4a3256561548cd825646680edcadb9440f3f68add95ade1eb791/ifaddr-0.2.0.tar.gz"
SRC_URI[md5sum] = "b1cac02b5dc354d68dd6d853bc9565a7"
SRC_URI[sha256sum] = "cc0cbfcaabf765d44595825fb96a99bb12c79716b73b44330ea38ee2b0c4aed4"

S = "${WORKDIR}/ifaddr-0.2.0"

RDEPENDS_${PN} = ""

inherit setuptools3
