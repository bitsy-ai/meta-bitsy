
SUMMARY = "Get notified when defects are detected in your print."
HOMEPAGE = "https://github.com/bitsy-ai/octoprint-nanny-plugin"
AUTHOR = "Leigh Johnson <leigh@bitsy.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08657324f94cfae679f345f428c68f9b"

SRC_URI[sha256sum] = "e0cb84de5dfacb2d22b1f9566b56f3f87a682dcac5352c9969d1f9eb91d3b66b"
PYPI_PACKAGE = "OctoPrint-Nanny"
inherit python_setuptools3_rust setuptools3 pypi


RDEPENDS:${PN} = "python3-octoprint python3-pip python3-cryptography python3-pytz python3-aiohttp python3-printnanny-api-client python3-backoff"
