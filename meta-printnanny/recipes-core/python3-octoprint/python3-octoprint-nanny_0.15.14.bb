
SUMMARY = "Get notified when defects are detected in your print."
HOMEPAGE = "https://github.com/bitsy-ai/octoprint-nanny-plugin"
AUTHOR = "Leigh Johnson <leigh@printnanny.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08657324f94cfae679f345f428c68f9b"

SRC_URI = "https://files.pythonhosted.org/packages/aa/d3/06eab8a6cbb95193fb9c880b592f29733b4362db249171c876c3d4efda82/OctoPrint-Nanny-0.15.14.tar.gz"
SRC_URI[sha256sum] = "e667dca02a61f029fbe87db54ae65d521202df88e5dd4ad82529b574345dfe6f"

S = "${WORKDIR}/OctoPrint-Nanny-0.15.14"

RDEPENDS:${PN} = "python3-case-converter python3-octoprint python3-cryptography python3-pytz python3-aiohttp python3-printnanny-api-client python3-backoff python3-nats-py"

inherit setuptools3
