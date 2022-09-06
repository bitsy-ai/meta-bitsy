
SUMMARY = "Get notified when defects are detected in your print."
HOMEPAGE = "https://github.com/bitsy-ai/octoprint-nanny-plugin"
AUTHOR = "Leigh Johnson <leigh@bitsy.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08657324f94cfae679f345f428c68f9b"
SRC_URI[sha256sum] = "4ba86fc7b76390d9677516d93ed72ee76e125c19ebffbdc2b535ce5c9866ce4e"
S = "${WORKDIR}/OctoPrint-Nanny-0.13.4"

inherit pypi setuptools3

PYPI_PACKAGE = "OctoPrint-Nanny"
RDEPENDS:${PN} = "python3-case-converter python3-octoprint python3-cryptography python3-pytz python3-aiohttp python3-printnanny-api-client python3-backoff"

