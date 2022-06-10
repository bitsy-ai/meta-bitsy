
SUMMARY = "Get notified when defects are detected in your print."
HOMEPAGE = "https://github.com/bitsy-ai/octoprint-nanny-plugin"
AUTHOR = "Leigh Johnson <leigh@bitsy.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08657324f94cfae679f345f428c68f9b"

SRC_URI[sha256sum] = "1dc1c9d7a4c4827ce8c2d2781f0ec966e9a491cd4bfaedd94e49ea11eb1bc6ee"
PYPI_PACKAGE = "OctoPrint-Nanny"
inherit python_setuptools3_rust setuptools3 pypi


RDEPENDS:${PN} = "python3-octoprint python3-pip python3-cryptography python3-pytz python3-aiohttp python3-printnanny-api-client python3-backoff"
