
SUMMARY = "Markdown URL utilities"
HOMEPAGE = ""
AUTHOR = " <Taneli Hukkinen <hukkin@users.noreply.github.com>>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=aca1dc6b9088f1dda81c89cad2c77ad1"

SRC_URI = "https://files.pythonhosted.org/packages/d6/54/cfe61301667036ec958cb99bd3efefba235e65cdeb9c84d24a8293ba1d90/mdurl-0.1.2.tar.gz"
SRC_URI[md5sum] = "f18eca6522b438354be2378f216a5a94"
SRC_URI[sha256sum] = "bb413d29f5eea38f31dd4754dd7377d4465116fb207585f97bf925588687c1ba"

S = "${WORKDIR}/mdurl-0.1.2"

RDEPENDS:${PN} = ""

inherit python_flit_core
