
SUMMARY = "printnanny-api-client"
HOMEPAGE = ""
AUTHOR = "Leigh Johnson <leigh@printnanny.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://setup.py;md5=c9953a6c755b2ff3fb0e8740e0dfe627"

PYPI_PACKAGE = "printnanny-api-client"

SRC_URI[sha256sum] = "fcc681a08a46a0afca347db5282f0b2f4a4c66cb6c6e6bc6911cd779511794cd"
S = "${WORKDIR}/printnanny-api-client-0.131.7"

RDEPENDS:${PN} = "python3-aiohttp python3-protobuf python3-python-dateutil python3-six python3-urllib3"

inherit setuptools3 pypi
