
SUMMARY = "Get notified when defects are detected in your print."
HOMEPAGE = "https://github.com/bitsy-ai/octoprint-nanny-plugin"
AUTHOR = "Leigh Johnson <leigh@printnanny.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08657324f94cfae679f345f428c68f9b"

SRC_URI = "https://files.pythonhosted.org/packages/c0/35/14db3f2daf9a04030a9f485b8bd2fae722315c015ae6488cf871a032f2b4/OctoPrint-Nanny-0.15.2.tar.gz"
SRC_URI[md5sum] = "53e96e4852abd3c3a5924642447502a9"
SRC_URI[sha256sum] = "bc559711f70dafe31d06b1b8e9dea1c92bc9cb3ea9b2ae8abb19f5cd61ec54c6"

S = "${WORKDIR}/OctoPrint-Nanny-0.15.2"

RDEPENDS:${PN} = "python3-case-converter python3-octoprint python3-cryptography python3-pytz python3-aiohttp python3-printnanny-api-client python3-backoff python3-nats-py"

inherit setuptools3
