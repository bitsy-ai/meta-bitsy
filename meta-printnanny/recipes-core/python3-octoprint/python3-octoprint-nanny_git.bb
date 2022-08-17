
SUMMARY = "Get notified when defects are detected in your print."
HOMEPAGE = "https://github.com/bitsy-ai/octoprint-nanny-plugin"
AUTHOR = "Leigh Johnson <leigh@bitsy.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"

SRCREV = "07c307bf5ab8e7f5b701d0b0cadc0e56b3bc4e43"
SRC_URI = "git://git@github.com/bitsy-ai/octoprint-nanny-plugin.git;protocol=ssh;nobranch=1;branch=main"

PV = "git${SRCPV}"
S = "${WORKDIR}/git"

inherit setuptools3


# RDEPENDS:${PN} = "python3-aiohttp python3-backoff python3-cryptography python3-octoprint python3-printnanny-api-client python3-pytz"

# inherit setuptools3
