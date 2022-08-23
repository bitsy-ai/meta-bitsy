
SUMMARY = "Get notified when defects are detected in your print."
HOMEPAGE = "https://github.com/bitsy-ai/octoprint-nanny-plugin"
AUTHOR = "Leigh Johnson <leigh@bitsy.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08657324f94cfae679f345f428c68f9b"

SRC_URI = "https://files.pythonhosted.org/packages/7d/c6/c81be32428ee40db5aeb77109b9d58af90def61393f87fb434a2b8505cdc/OctoPrint-Nanny-0.13.2.tar.gz"
SRC_URI[md5sum] = "51a22ee96155c9c8acdee41b274e759c"
SRC_URI[sha256sum] = "f5b622fa4812bf51ed01a8c66a8bc293c602cb51ec1edf0c1e537c2273a7a978"

S = "${WORKDIR}/OctoPrint-Nanny-0.13.2"

RDEPENDS:${PN} = "python3-case-converter python3-octoprint python3-cryptography python3-pytz python3-aiohttp python3-printnanny-api-client python3-backoff"

inherit setuptools3
