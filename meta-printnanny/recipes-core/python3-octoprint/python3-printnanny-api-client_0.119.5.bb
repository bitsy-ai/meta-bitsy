
SUMMARY = "printnanny-api-client"
HOMEPAGE = ""
AUTHOR = "Leigh Johnson <leigh@printnanny.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://setup.py;md5=10b5ee2dc25f05e1f75ec860d777976e"

SRC_URI = "https://files.pythonhosted.org/packages/76/1b/79236bfcb6effbca5f5e22a7bd3718ae40a2af6dc5f930b5fedb4cbaa901/printnanny-api-client-0.119.5.tar.gz"
SRC_URI[md5sum] = "d47c547d76d8e23d0fd880e0a9a6661a"
SRC_URI[sha256sum] = "950cee76fa959aea8c806de5cbb579de239e467976f3a4a77bb7ba37c47a1233"

S = "${WORKDIR}/printnanny-api-client-0.119.5"

RDEPENDS:${PN} = "python3-aiohttp python3-protobuf python3-python-dateutil python3-six python3-urllib3"

inherit setuptools3
