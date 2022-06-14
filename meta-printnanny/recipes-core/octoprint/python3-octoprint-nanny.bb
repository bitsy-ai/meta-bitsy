
SUMMARY = "Get notified when defects are detected in your print."
HOMEPAGE = "https://github.com/bitsy-ai/octoprint-nanny-plugin"
AUTHOR = "Leigh Johnson <leigh@bitsy.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08657324f94cfae679f345f428c68f9b"

PV = "0.11.1"
SRC_URI = "git://git@github.com/bitsy-ai/octoprint-nanny-plugin.git;branch=main"
SRCREV = "3e8d3e3864a3f525496122131f76fca8c5a1ac98"
S = "${WORKDIR}/git"

inherit python_setuptools3_rust setuptools3
RDEPENDS:${PN} = "python3-octoprint python3-pip python3-cryptography python3-pytz python3-aiohttp python3-printnanny-api-client python3-backoff"
