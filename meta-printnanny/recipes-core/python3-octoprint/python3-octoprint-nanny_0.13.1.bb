
SUMMARY = "Get notified when defects are detected in your print."
HOMEPAGE = "https://github.com/bitsy-ai/octoprint-nanny-plugin"
AUTHOR = "Leigh Johnson <leigh@bitsy.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08657324f94cfae679f345f428c68f9b"

SRC_URI = "https://files.pythonhosted.org/packages/01/1f/31126c87c30336129e1231e0f75824826b0148835ce21ef6fe1c52ab5a18/OctoPrint-Nanny-0.13.1.tar.gz"
SRC_URI[md5sum] = "c5419e788552dbfad13d600792d4aad4"
SRC_URI[sha256sum] = "0ab0c72658f175dcb2d5daaa2aaf4cac14c27d2a551088f29e2ec03e0b59f342"

S = "${WORKDIR}/OctoPrint-Nanny-0.13.1"

RDEPENDS:${PN} = "python3-case-converter python3-octoprint python3-cryptography python3-pytz python3-aiohttp python3-printnanny-api-client python3-backoff"

inherit setuptools3
