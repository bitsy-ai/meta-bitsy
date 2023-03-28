
SUMMARY = "printnanny-api-client"
HOMEPAGE = ""
AUTHOR = "Leigh Johnson <leigh@printnanny.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://setup.py;md5=573659899e2fdf2f6948fab4f0b5df24"

PYPI_PACKAGE = "printnanny-api-client"

SRC_URI[sha256sum] = "1a6060234b52160d21c9e27bbbcb74d3d48393e4062572954d76075981521110"
S = "${WORKDIR}/printnanny-api-client-0.131.6"

RDEPENDS:${PN} = "python3-aiohttp python3-protobuf python3-python-dateutil python3-six python3-urllib3"

inherit setuptools3 pypi
