
SUMMARY = "Get notified when defects are detected in your print."
HOMEPAGE = "https://github.com/bitsy-ai/octoprint-nanny-plugin"
AUTHOR = "Leigh Johnson <leigh@bitsy.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08657324f94cfae679f345f428c68f9b"

SRC_URI = "https://files.pythonhosted.org/packages/5c/2f/05af1a2455f974e4c5be1691b95643df8c911300ca3a73692ada5852a5e0/OctoPrint-Nanny-0.10.2.tar.gz"
SRC_URI[md5sum] = "bf746350194468c56cd2608249f33ded"
SRC_URI[sha256sum] = "c9ac98b45a38b23852ac40478f974c09961b3b0a5aa0a6397b37ba061d7e8f10"

S = "${WORKDIR}/OctoPrint-Nanny-0.10.2"

RDEPENDS_${PN} = "python3-octoprint python3-cryptography python3-pytz python3-aiohttp python3-printnanny-api-client python3-backoff"

inherit setuptools3
