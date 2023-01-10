
SUMMARY = "Get notified when defects are detected in your print."
HOMEPAGE = "https://github.com/bitsy-ai/octoprint-nanny-plugin"
AUTHOR = "Leigh Johnson <leigh@printnanny.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08657324f94cfae679f345f428c68f9b"

SRC_URI = "https://files.pythonhosted.org/packages/3e/56/a071c93ee2f79eabcd79a50d722868fbcba953abf1daebddd52a8427e459/OctoPrint-Nanny-0.15.4.tar.gz"
SRC_URI[sha256sum] = "8b02980f77715bc25d6c8c8aaabd48ffa724ccd8ce8cb83a1e803fc9f18a34bd"

S = "${WORKDIR}/OctoPrint-Nanny-0.15.4"

RDEPENDS:${PN} = "python3-case-converter python3-octoprint python3-cryptography python3-pytz python3-aiohttp python3-printnanny-api-client python3-backoff python3-nats-py"

inherit setuptools3
