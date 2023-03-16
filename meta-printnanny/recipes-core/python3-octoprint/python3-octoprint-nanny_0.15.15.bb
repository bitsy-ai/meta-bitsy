
SUMMARY = "Get notified when defects are detected in your print."
HOMEPAGE = "https://github.com/bitsy-ai/octoprint-nanny-plugin"
AUTHOR = "Leigh Johnson <leigh@printnanny.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08657324f94cfae679f345f428c68f9b"

SRC_URI = "https://files.pythonhosted.org/packages/81/95/56ab37e9f315a09f5ba3fae4c61111fb7742c9c1d05bafa08f2754c6bb59/OctoPrint-Nanny-0.15.15.tar.gz"
SRC_URI[sha256sum] = "33ec21d35becf7b7918e49d03e8e7f4d5e41ea0903dcec5df5370b2ed8b749a4"

S = "${WORKDIR}/OctoPrint-Nanny-0.15.15"

RDEPENDS:${PN} = "python3-case-converter python3-octoprint python3-cryptography python3-pytz python3-aiohttp python3-printnanny-api-client python3-backoff python3-nats-py"

inherit setuptools3
