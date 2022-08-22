
SUMMARY = "printnanny-api-client"
HOMEPAGE = ""
AUTHOR = "Leigh Johnson <leigh@printnanny.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://setup.py;md5=0576fd57d0930b3c999c3a4502c6c706"

SRC_URI = "https://files.pythonhosted.org/packages/60/c6/b1e54c13a28eca3b490120b99dad23a76d06deab2214756986a2bd10e1b2/printnanny-api-client-0.103.2.tar.gz"
SRC_URI[md5sum] = "f578b3b133b421400ecba1004a0c50d3"
SRC_URI[sha256sum] = "e845428583b9dd0faf4cabcf9bd538842921d5a6b48656120948dbcb4f917ef9"

S = "${WORKDIR}/printnanny-api-client-0.103.2"

RDEPENDS:${PN} = "python3-urllib3 python3-six python3-python-dateutil python3-protobuf python3-aiohttp"

inherit setuptools3
