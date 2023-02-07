
SUMMARY = "Get notified when defects are detected in your print."
HOMEPAGE = "https://github.com/bitsy-ai/octoprint-nanny-plugin"
AUTHOR = "Leigh Johnson <leigh@printnanny.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08657324f94cfae679f345f428c68f9b"

SRC_URI = "https://files.pythonhosted.org/packages/72/dd/eb1d4a9e13b3a2c063c456e1907e955ed7e910a6bb5bd57242a11adb0f8c/OctoPrint-Nanny-0.15.11.tar.gz"
SRC_URI[sha256sum] = "773f5f73d0781f97bf10b090af8e67a8b08c35849717c480f18be502bad85459"

S = "${WORKDIR}/OctoPrint-Nanny-0.15.11"

RDEPENDS:${PN} = "python3-case-converter python3-octoprint python3-cryptography python3-pytz python3-aiohttp python3-printnanny-api-client python3-backoff python3-nats-py"

inherit setuptools3
