
SUMMARY = "Get notified when defects are detected in your print."
HOMEPAGE = "https://github.com/bitsy-ai/octoprint-nanny-plugin"
AUTHOR = "Leigh Johnson <leigh@bitsy.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"

PYPI_PACKAGE = "OctoPrint-Nanny"

SRC_URI[sha256sum] = "d6c647331acfecf1931406977e3054dddeeb67c6b9f76b2e72b51571b5b795ca"

inherit pypi
inherit setuptools3

RDEPENDS:${PN} = "python3-aiohttp python3-backoff python3-cryptography python3-octoprint python3-printnanny-api-client python3-pytz python3-case-converter"
