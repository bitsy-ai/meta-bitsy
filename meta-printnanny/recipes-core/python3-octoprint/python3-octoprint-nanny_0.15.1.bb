
SUMMARY = "Get notified when defects are detected in your print."
HOMEPAGE = "https://github.com/bitsy-ai/octoprint-nanny-plugin"
AUTHOR = "Leigh Johnson <leigh@printnanny.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08657324f94cfae679f345f428c68f9b"

SRC_URI = "https://files.pythonhosted.org/packages/ad/f5/9135defc046e114c1cf47e0c9909a1b4adf60a532f14e8616131edf259e9/OctoPrint-Nanny-0.15.1.tar.gz"
SRC_URI[md5sum] = "d3cd1937d5c6ca10d4898da576c16b28"
SRC_URI[sha256sum] = "ff2b592b90a94a6196cec41ed7d3f371524e4bebed085d15dac42d8f02e1ed5e"

S = "${WORKDIR}/OctoPrint-Nanny-0.15.1"

RDEPENDS:${PN} = "python3-case-converter python3-octoprint python3-cryptography python3-pytz python3-aiohttp python3-printnanny-api-client python3-backoff python3-nats-py"

inherit setuptools3
