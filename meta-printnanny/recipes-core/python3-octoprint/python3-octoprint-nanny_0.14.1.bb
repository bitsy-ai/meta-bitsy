
SUMMARY = "Get notified when defects are detected in your print."
HOMEPAGE = "https://github.com/bitsy-ai/octoprint-nanny-plugin"
AUTHOR = "Leigh Johnson <leigh@bitsy.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08657324f94cfae679f345f428c68f9b"
SRC_URI[sha256sum] = "a8d8e983199472ce116f19c12bf9850afabf936a4b03f2dd9df57fce7f2f5982"
S = "${WORKDIR}/OctoPrint-Nanny-0.14.1"

inherit pypi setuptools3

PYPI_PACKAGE = "OctoPrint-Nanny"
RDEPENDS:${PN} = "python3-case-converter python3-octoprint python3-cryptography python3-pytz python3-aiohttp python3-printnanny-api-client python3-backoff"

