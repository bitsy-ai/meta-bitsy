
SUMMARY = "Get notified when defects are detected in your print."
HOMEPAGE = "https://github.com/bitsy-ai/octoprint-nanny-plugin"
AUTHOR = "Leigh Johnson <leigh@printnanny.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4c7666365b99572e1d53d81fd679d2d"

SRC_URI = "https://files.pythonhosted.org/packages/19/2e/1ee047e46c81612203694b02d80ba45855ba26a44274c7f2e1a705e4deb4/OctoPrint-Nanny-0.15.10.tar.gz"
SRC_URI[sha256sum] = "093b37577f8ca99723a9d821cd17ec6cde629954fe1b3a80892abbafc5f3d1f7"

S = "${WORKDIR}/OctoPrint-Nanny-0.15.10"

RDEPENDS:${PN} = "python3-case-converter python3-octoprint python3-cryptography python3-pytz python3-aiohttp python3-printnanny-api-client python3-backoff python3-nats-py"

inherit setuptools3
