
SUMMARY = "Get notified when defects are detected in your print."
HOMEPAGE = "https://github.com/bitsy-ai/octoprint-nanny-plugin"
AUTHOR = "Leigh Johnson <leigh@bitsy.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08657324f94cfae679f345f428c68f9b"
SRC_URI[sha256sum] = "24e1a2cfa90c77d8c8c29de2b536797b688b1c15f36975a2ef71aff7e1b2ae6d"
S = "${WORKDIR}/OctoPrint-Nanny-0.13.6"

inherit pypi setuptools3

PYPI_PACKAGE = "OctoPrint-Nanny"
RDEPENDS:${PN} = "python3-case-converter python3-octoprint python3-cryptography python3-pytz python3-aiohttp python3-printnanny-api-client python3-backoff"

