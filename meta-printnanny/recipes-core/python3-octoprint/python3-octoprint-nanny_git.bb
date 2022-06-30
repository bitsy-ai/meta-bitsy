
SUMMARY = "Get notified when defects are detected in your print."
HOMEPAGE = "https://github.com/bitsy-ai/octoprint-nanny-plugin"
AUTHOR = "Leigh Johnson <leigh@bitsy.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08657324f94cfae679f345f428c68f9b"

SRC_BRANCH ?= "main"
SRC_URI = "git://github.com/bitsy-ai/octoprint-nanny-plugin.git;branch=${SRC_BRANCH};protocol=https"
SRCREV = "da7c2a378b38c67c60844c53c1165aa9bcf18735"

S = "${WORKDIR}/git"

RDEPENDS:${PN} = "python3-aiohttp python3-cchardet python3-backoff python3-cryptography python3-octoprint python3-printnanny-api-client python3-pytz"

inherit setuptools3
