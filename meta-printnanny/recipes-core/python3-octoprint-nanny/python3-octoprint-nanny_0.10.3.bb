
SUMMARY = "Get notified when defects are detected in your print."
HOMEPAGE = "https://github.com/bitsy-ai/octoprint-nanny-plugin"
AUTHOR = "Leigh Johnson <leigh@bitsy.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08657324f94cfae679f345f428c68f9b"

SRC_URI[sha256sum] = "f7436b660666b66926f4a14c889f0ece0295ffafa7d1635c5ba3723f59bfb58e"
PYPI_PACKAGE = "OctoPrint-Nanny"
inherit python_setuptools3_rust setuptools3 pypi


RDEPENDS:${PN} = "python3-octoprint python3-pip python3-cryptography python3-pytz python3-aiohttp python3-printnanny-api-client python3-backoff"
