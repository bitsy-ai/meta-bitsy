
SUMMARY = "Get notified when defects are detected in your print."
HOMEPAGE = "https://github.com/bitsy-ai/octoprint-nanny-plugin"
AUTHOR = "Leigh Johnson <leigh@printnanny.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08657324f94cfae679f345f428c68f9b"

SRC_URI = "https://files.pythonhosted.org/packages/05/99/54e039fc01d169cc588de10c2aabd8c77f239193f044edc8d1248c92c155/OctoPrint-Nanny-0.15.12.tar.gz"
SRC_URI[sha256sum] = "dfc18682e49c26a7011a507d04c79072172d0a2037f2e7725420ddd85dea1b26"

S = "${WORKDIR}/OctoPrint-Nanny-0.15.12"

RDEPENDS:${PN} = "python3-case-converter python3-octoprint python3-cryptography python3-pytz python3-aiohttp python3-printnanny-api-client python3-backoff python3-nats-py"

inherit setuptools3
