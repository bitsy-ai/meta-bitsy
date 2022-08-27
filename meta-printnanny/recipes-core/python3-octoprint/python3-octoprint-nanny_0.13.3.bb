
SUMMARY = "Get notified when defects are detected in your print."
HOMEPAGE = "https://github.com/bitsy-ai/octoprint-nanny-plugin"
AUTHOR = "Leigh Johnson <leigh@bitsy.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08657324f94cfae679f345f428c68f9b"

SRC_URI = "https://files.pythonhosted.org/packages/c1/37/f4a1557869b9533d88e9105815a8330a02a1c32867a0663a3087609a35cf/OctoPrint-Nanny-0.13.3.tar.gz"
SRC_URI[md5sum] = "373088a19b3aa2c1c000c2d114ab2293"
SRC_URI[sha256sum] = "0f1acffe924cf583ab7db41d27c5051e84e7f87b8dcfa28197fdbbcf0292ad7e"

S = "${WORKDIR}/OctoPrint-Nanny-0.13.3"

RDEPENDS:${PN} = "python3-case-converter python3-octoprint python3-cryptography python3-pytz python3-aiohttp python3-printnanny-api-client python3-backoff"

inherit setuptools3
