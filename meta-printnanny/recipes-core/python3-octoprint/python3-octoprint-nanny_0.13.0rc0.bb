
SUMMARY = "Get notified when defects are detected in your print."
HOMEPAGE = "https://github.com/bitsy-ai/octoprint-nanny-plugin"
AUTHOR = "Leigh Johnson <leigh@bitsy.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08657324f94cfae679f345f428c68f9b"
SRC_URI[sha256sum] = "5d06c5ff966d29c805c18115b77d49dd3b02ef0534c38a15d4cad2444bc94ed0"
inherit pypi setuptools3
PYPI_PACKAGE = "OctoPrint-Nanny"

# RDEPENDS:${PN} = "python3-aiohttp python3-backoff python3-cryptography python3-octoprint python3-printnanny-api-client python3-pytz"

# inherit setuptools3
