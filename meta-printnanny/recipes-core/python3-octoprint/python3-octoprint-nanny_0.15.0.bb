
SUMMARY = "Get notified when defects are detected in your print."
HOMEPAGE = "https://github.com/bitsy-ai/octoprint-nanny-plugin"
AUTHOR = "Leigh Johnson <leigh@printnanny.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08657324f94cfae679f345f428c68f9b"

SRC_URI = "https://files.pythonhosted.org/packages/a7/79/2da79274b70eed59dd9c5b1e7b0ecb782e8994ee91e7705aa3129d26d421/OctoPrint-Nanny-0.15.0.tar.gz"
SRC_URI[md5sum] = "76416cd8a75821d4b239d45cc5e17676"
SRC_URI[sha256sum] = "46c2bfd234bdaa73afd7b2bbccdba52077cd31eb84f2b81e1b127602c26e6c10"

S = "${WORKDIR}/OctoPrint-Nanny-0.15.0"

RDEPENDS:${PN} = "python3-case-converter python3-octoprint python3-cryptography python3-pytz python3-aiohttp python3-printnanny-api-client python3-backoff python3-nats-py"

inherit setuptools3
