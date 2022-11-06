
SUMMARY = "Get notified when defects are detected in your print."
HOMEPAGE = "https://github.com/bitsy-ai/octoprint-nanny-plugin"
AUTHOR = "Leigh Johnson <leigh@printnanny.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08657324f94cfae679f345f428c68f9b"

SRC_URI = "https://files.pythonhosted.org/packages/85/b4/215683221973f2f48934f8dd1cb739bb6b2a6c58bbf1ca6321b920e8d12b/OctoPrint-Nanny-0.14.3.tar.gz"
SRC_URI[md5sum] = "43cc7d310e01ec1df7b325cb780f6049"
SRC_URI[sha256sum] = "a6e1b894c4fa4900c93fe8073f99041aba288845adf2a62173a0238c8458a4e6"

S = "${WORKDIR}/OctoPrint-Nanny-0.14.3"

RDEPENDS:${PN} = "python3-case-converter python3-octoprint python3-cryptography python3-pytz python3-aiohttp python3-printnanny-api-client python3-backoff python3-nats-py"

inherit setuptools3
