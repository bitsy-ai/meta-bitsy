
SUMMARY = "Get notified when defects are detected in your print."
HOMEPAGE = "https://github.com/bitsy-ai/octoprint-nanny-plugin"
AUTHOR = "Leigh Johnson <leigh@printnanny.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08657324f94cfae679f345f428c68f9b"

SRC_URI = "https://files.pythonhosted.org/packages/2d/18/483340ff7605627c8532165c3c9d67db8ec20181c94de663a9dc99544269/OctoPrint-Nanny-0.15.7.tar.gz"
SRC_URI[sha256sum] = "d99dd3663282f25ceef5fd11076a023b2f818b631d9f93984a5537f6bb65b59e"

S = "${WORKDIR}/OctoPrint-Nanny-0.15.7"

RDEPENDS:${PN} = "python3-case-converter python3-octoprint python3-cryptography python3-pytz python3-aiohttp python3-printnanny-api-client python3-backoff python3-nats-py"

inherit setuptools3
