
SUMMARY = "Get notified when defects are detected in your print."
HOMEPAGE = "https://github.com/bitsy-ai/octoprint-nanny-plugin"
AUTHOR = "Leigh Johnson <leigh@bitsy.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08657324f94cfae679f345f428c68f9b"
SRC_URI[sha256sum] = "e899cfb163aaf929036b446ebf0384a924f0b90d1ea9fa617ae7ce2e9d5e9c06"
S = "${WORKDIR}/OctoPrint-Nanny-0.13.5"

inherit pypi setuptools3

PYPI_PACKAGE = "OctoPrint-Nanny"
RDEPENDS:${PN} = "python3-case-converter python3-octoprint python3-cryptography python3-pytz python3-aiohttp python3-printnanny-api-client python3-backoff"

