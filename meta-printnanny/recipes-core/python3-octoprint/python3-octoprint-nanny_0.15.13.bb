
SUMMARY = "Get notified when defects are detected in your print."
HOMEPAGE = "https://github.com/bitsy-ai/octoprint-nanny-plugin"
AUTHOR = "Leigh Johnson <leigh@printnanny.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08657324f94cfae679f345f428c68f9b"

SRC_URI = "https://files.pythonhosted.org/packages/f3/fc/902082a796c2a04002a1a5686eda21ef1863732425859e3f997f69c9ad89/OctoPrint-Nanny-0.15.13.tar.gz"
SRC_URI[sha256sum] = "c5562af27cb429b3123d604f7dd9088a60cf6072d553fce0955ba8f9b2083285"

S = "${WORKDIR}/OctoPrint-Nanny-0.15.13"

RDEPENDS:${PN} = "python3-case-converter python3-octoprint python3-cryptography python3-pytz python3-aiohttp python3-printnanny-api-client python3-backoff python3-nats-py"

inherit setuptools3
