
SUMMARY = "Get notified when defects are detected in your print."
HOMEPAGE = "https://github.com/bitsy-ai/octoprint-nanny-plugin"
AUTHOR = "Leigh Johnson <leigh@bitsy.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08657324f94cfae679f345f428c68f9b"

SRC_URI = "https://files.pythonhosted.org/packages/62/6e/80adbfb3bae903f4db41266625f48ae2b93ac00f3539e77b5fbae2a51921/OctoPrint-Nanny-0.11.3.tar.gz"
SRC_URI[md5sum] = "7bc7c4f8cf982568eb74880412b14826"
SRC_URI[sha256sum] = "ce9f06388c823bdfe7a7a268d7c7c558e09f53e031f432a388cf651c55f7c928"

S = "${WORKDIR}/OctoPrint-Nanny-0.11.3"

RDEPENDS:${PN} = "python3-aiohttp python3-backoff python3-cryptography python3-octoprint python3-printnanny-api-client python3-pytz"

inherit setuptools3
