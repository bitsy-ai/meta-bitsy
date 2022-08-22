
SUMMARY = "Get notified when defects are detected in your print."
HOMEPAGE = "https://github.com/bitsy-ai/octoprint-nanny-plugin"
AUTHOR = "Leigh Johnson <leigh@bitsy.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08657324f94cfae679f345f428c68f9b"

SRC_URI = "https://files.pythonhosted.org/packages/1b/a8/c65f663da05e085deb4b8cbdb31b7bf8f5f683378c04a96ea6634f124337/OctoPrint-Nanny-0.13.0.tar.gz"
SRC_URI[md5sum] = "35a7c6cdba363a705519d39a9d68d013"
SRC_URI[sha256sum] = "d6c647331acfecf1931406977e3054dddeeb67c6b9f76b2e72b51571b5b795ca"

S = "${WORKDIR}/OctoPrint-Nanny-0.13.0"

RDEPENDS:${PN} = "python3-case-converter python3-octoprint python3-cryptography python3-pytz python3-aiohttp python3-printnanny-api-client python3-backoff"

inherit setuptools3
