
SUMMARY = "Get notified when defects are detected in your print."
HOMEPAGE = "https://github.com/bitsy-ai/octoprint-nanny-plugin"
AUTHOR = "Leigh Johnson <leigh@bitsy.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08657324f94cfae679f345f428c68f9b"

SRC_URI = "https://files.pythonhosted.org/packages/5b/dd/fd478b06ab6a50ae96c4e593276725922dfd21e6dce8a75f002274fa45af/OctoPrint-Nanny-0.11.4.tar.gz"
SRC_URI[md5sum] = "9bc71926af1118ee006b83691c31f8da"
SRC_URI[sha256sum] = "5affaa25649240ecd6ac8d64bf1fb90049be8e3eea86b135223ef0b3cc7255a9"

S = "${WORKDIR}/OctoPrint-Nanny-0.11.4"

RDEPENDS:${PN} = "python3-aiohttp python3-backoff python3-cryptography python3-octoprint python3-printnanny-api-client python3-pytz"

inherit setuptools3
