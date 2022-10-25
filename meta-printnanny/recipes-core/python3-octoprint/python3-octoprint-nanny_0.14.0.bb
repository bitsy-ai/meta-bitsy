
SUMMARY = "Get notified when defects are detected in your print."
HOMEPAGE = "https://github.com/bitsy-ai/octoprint-nanny-plugin"
AUTHOR = "Leigh Johnson <leigh@bitsy.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08657324f94cfae679f345f428c68f9b"
SRC_URI[sha256sum] = "b61c5abbb7291703181703ca1bb2d9cf0847936621da3c7937740e8c3779ca49"
S = "${WORKDIR}/OctoPrint-Nanny-0.14.0"

inherit pypi setuptools3

PYPI_PACKAGE = "OctoPrint-Nanny"
RDEPENDS:${PN} = "python3-case-converter python3-octoprint python3-cryptography python3-pytz python3-aiohttp python3-printnanny-api-client python3-backoff"

