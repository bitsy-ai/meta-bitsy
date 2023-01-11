
SUMMARY = "Get notified when defects are detected in your print."
HOMEPAGE = "https://github.com/bitsy-ai/octoprint-nanny-plugin"
AUTHOR = "Leigh Johnson <leigh@printnanny.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08657324f94cfae679f345f428c68f9b"

SRC_URI = "https://files.pythonhosted.org/packages/d1/23/43b687e2d7d694a07b1a57c2236b6e8859f3e0198831b871450bc39cc013/OctoPrint-Nanny-0.15.8.tar.gz"
SRC_URI[sha256sum] = "c850377871668ad3f1833146bb3617d58f17649804364ea6850fe9d260130527"

S = "${WORKDIR}/OctoPrint-Nanny-0.15.8"

RDEPENDS:${PN} = "python3-case-converter python3-octoprint python3-cryptography python3-pytz python3-aiohttp python3-printnanny-api-client python3-backoff python3-nats-py"

inherit setuptools3
