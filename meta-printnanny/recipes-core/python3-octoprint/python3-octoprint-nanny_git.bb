
SUMMARY = "Get notified when defects are detected in your print."
HOMEPAGE = "https://github.com/bitsy-ai/octoprint-nanny-plugin"
AUTHOR = "Leigh Johnson <leigh@bitsy.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08657324f94cfae679f345f428c68f9b"

SRC_BRANCH ?= "shim-startwebrtc-fn"
SRC_URI = "git://github.com/bitsy-ai/octoprint-nanny-plugin.git;branch=${SRC_BRANCH};protocol=https"
SRCREV = "9a055240da3eae8c1e9330b17260223563fd7eca"

S = "${WORKDIR}/git"

RDEPENDS:${PN} = "python3-aiohttp python3-cchardet python3-backoff python3-cryptography python3-octoprint python3-printnanny-api-client python3-pytz"

inherit setuptools3
