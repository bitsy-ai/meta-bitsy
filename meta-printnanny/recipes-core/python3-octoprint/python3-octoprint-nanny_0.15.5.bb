
SUMMARY = "Get notified when defects are detected in your print."
HOMEPAGE = "https://github.com/bitsy-ai/octoprint-nanny-plugin"
AUTHOR = "Leigh Johnson <leigh@printnanny.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08657324f94cfae679f345f428c68f9b"

SRC_URI = "https://files.pythonhosted.org/packages/4f/38/b962638886f8aea3ef2cef3a08512c362e5608e8616c5967aa0c931dbc27/OctoPrint-Nanny-0.15.5.tar.gz"
SRC_URI[sha256sum] = "e10f441bf95da26342a658b2723255f9b22da10664a69ddbc0284dc35e871879"

S = "${WORKDIR}/OctoPrint-Nanny-0.15.5"

RDEPENDS:${PN} = "python3-case-converter python3-octoprint python3-cryptography python3-pytz python3-aiohttp python3-printnanny-api-client python3-backoff python3-nats-py"

inherit setuptools3
