
SUMMARY = "Get notified when defects are detected in your print."
HOMEPAGE = "https://github.com/bitsy-ai/octoprint-nanny-plugin"
AUTHOR = "Leigh Johnson <leigh@printnanny.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08657324f94cfae679f345f428c68f9b"

SRC_URI = "https://files.pythonhosted.org/packages/5b/0d/d976d8f9215e41d47777a3fecb8aeb9d47ab410886bac3679cb411ce4bdb/OctoPrint-Nanny-0.15.9.tar.gz"
SRC_URI[sha256sum] = "3c2d931559f06f3a4f18370807cf384d829936706642b83f3e43139eec43f10b"

S = "${WORKDIR}/OctoPrint-Nanny-0.15.9"

RDEPENDS:${PN} = "python3-case-converter python3-octoprint python3-cryptography python3-pytz python3-aiohttp python3-printnanny-api-client python3-backoff python3-nats-py"

inherit setuptools3
