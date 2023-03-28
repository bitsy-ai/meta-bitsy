
SUMMARY = "printnanny-api-client"
HOMEPAGE = ""
AUTHOR = "Leigh Johnson <leigh@printnanny.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://setup.py;md5=573659899e2fdf2f6948fab4f0b5df24"

PYPI_PACKAGE = "printnanny-api-client"

SRC_URI[sha256sum] = "770a2f7c3a2d6246bbd561e8bc3873ee060d4c9c9385faa24ae73b8c4ad83c56"
S = "${WORKDIR}/printnanny-api-client-0.131.2"

RDEPENDS:${PN} = "python3-aiohttp python3-protobuf python3-python-dateutil python3-six python3-urllib3"

inherit setuptools3 pypi
