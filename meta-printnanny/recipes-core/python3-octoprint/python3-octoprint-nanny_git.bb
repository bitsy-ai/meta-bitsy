
SUMMARY = "Get notified when defects are detected in your print."
HOMEPAGE = "https://github.com/bitsy-ai/octoprint-nanny-plugin"
AUTHOR = "Leigh Johnson <leigh@printnanny.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a0216e78f3d3bfc0f11def8c1537e15c"


SRC_URI += "git://git@github.com/bitsy-ai/octoprint-nanny.git;protocol=ssh;nobranch=1;branch=main"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"

RDEPENDS:${PN} = "python3-case-converter python3-octoprint python3-cryptography python3-pytz python3-aiohttp python3-printnanny-api-client python3-backoff python3-nats-py"

inherit setuptools3
