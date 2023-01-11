
SUMMARY = "Get notified when defects are detected in your print."
HOMEPAGE = "https://github.com/bitsy-ai/octoprint-nanny-plugin"
AUTHOR = "Leigh Johnson <leigh@printnanny.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08657324f94cfae679f345f428c68f9b"

SRC_URI = "https://files.pythonhosted.org/packages/7b/68/d4e5552de905ef1e163c8988604cc9f713381458e909fd6d88194d4a9de9/OctoPrint-Nanny-0.15.6.tar.gz"
SRC_URI[sha256sum] = "194bab3cd214735ea17257291ca7648cf665883e6563efee63198acfa5f0794f"

S = "${WORKDIR}/OctoPrint-Nanny-0.15.6"

RDEPENDS:${PN} = "python3-case-converter python3-octoprint python3-cryptography python3-pytz python3-aiohttp python3-printnanny-api-client python3-backoff python3-nats-py"

inherit setuptools3
