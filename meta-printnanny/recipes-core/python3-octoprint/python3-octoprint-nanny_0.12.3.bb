
SUMMARY = "Get notified when defects are detected in your print."
HOMEPAGE = "https://github.com/bitsy-ai/octoprint-nanny-plugin"
AUTHOR = "Leigh Johnson <leigh@bitsy.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08657324f94cfae679f345f428c68f9b"

SRC_URI = "https://files.pythonhosted.org/packages/be/d0/f8f1f0e351188358ebe02506890cb96bd066e77dc7abfc0d00d89e6ccbde/OctoPrint-Nanny-0.12.3.tar.gz"
SRC_URI[md5sum] = "27da3d2ba11155541e4738ea2f09caa2"
SRC_URI[sha256sum] = "150301a48dc41e7bcb7ebca64e95b6175ad8cf748571855d296a115442871d06"

S = "${WORKDIR}/OctoPrint-Nanny-0.12.3"

RDEPENDS:${PN} = "python3-aiohttp python3-backoff python3-cryptography python3-octoprint python3-printnanny-api-client python3-pytz"

inherit setuptools3
