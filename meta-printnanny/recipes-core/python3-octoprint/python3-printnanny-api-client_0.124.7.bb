
SUMMARY = "printnanny-api-client"
HOMEPAGE = ""
AUTHOR = "Leigh Johnson <leigh@printnanny.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://setup.py;md5=e84fb9d7913369060a656f638409d278"

SRC_URI = "https://files.pythonhosted.org/packages/96/f4/b6029b20c701950dbf09d814161bb072f13706fa4b9136c260cac0afe516/printnanny-api-client-0.124.7.tar.gz"
SRC_URI[sha256sum] = "003bd11420201d50098403cb131bb29683bfdf7e592baa337395a47cad00bab8"

S = "${WORKDIR}/printnanny-api-client-0.124.7"

RDEPENDS:${PN} = "python3-aiohttp python3-protobuf python3-python-dateutil python3-six python3-urllib3"

inherit setuptools3
