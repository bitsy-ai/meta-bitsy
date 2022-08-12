
SUMMARY = "printnanny-api-client"
HOMEPAGE = ""
AUTHOR = "Leigh Johnson <leigh@printnanny.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://setup.py;md5=f1b6e9786233ec8105628c6e61611f08"

SRC_URI = "https://files.pythonhosted.org/packages/80/17/3e375e6b28eab8beec2fc9865141471305ac7b13c72d2ea7536362e46f0f/printnanny-api-client-0.100.10.tar.gz"
SRC_URI[md5sum] = "1c215f80d6d6171ade6102df8226cfea"
SRC_URI[sha256sum] = "09e9748de72d37772f25f703142432f15985f9a152cd56ef9a74f4f0cc950658"

S = "${WORKDIR}/printnanny-api-client-0.100.10"

RDEPENDS:${PN} = "python3-urllib3 python3-six python3-python-dateutil python3-protobuf python3-aiohttp"

inherit setuptools3
