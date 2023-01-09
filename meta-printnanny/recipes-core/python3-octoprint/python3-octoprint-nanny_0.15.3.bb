
SUMMARY = "Get notified when defects are detected in your print."
HOMEPAGE = "https://github.com/bitsy-ai/octoprint-nanny-plugin"
AUTHOR = "Leigh Johnson <leigh@printnanny.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08657324f94cfae679f345f428c68f9b"

SRC_URI = "https://files.pythonhosted.org/packages/b2/e4/2868d649eb74de268fc303dc987ddaf186033dcf9dbc70464578048362d9/OctoPrint-Nanny-0.15.3.tar.gz"
SRC_URI[md5sum] = "f7bf47ba9ffc0470e66cdeef0d1cc754	"
SRC_URI[sha256sum] = "62302d7b2f8b8c3cb1d9b6826f695ddb9e1b1960542454e1607d1c57e09b0e6d"

S = "${WORKDIR}/OctoPrint-Nanny-0.15.3"

RDEPENDS:${PN} = "python3-case-converter python3-octoprint python3-cryptography python3-pytz python3-aiohttp python3-printnanny-api-client python3-backoff python3-nats-py"

inherit setuptools3
