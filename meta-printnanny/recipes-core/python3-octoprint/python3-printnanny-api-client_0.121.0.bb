
SUMMARY = "printnanny-api-client"
HOMEPAGE = ""
AUTHOR = "Leigh Johnson <leigh@printnanny.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://setup.py;md5=10b5ee2dc25f05e1f75ec860d777976e"

SRC_URI = "https://files.pythonhosted.org/packages/a0/96/35d0fd338a60af342cbf4946b3c5739d993c22b0b8ceffdb81ae7f9f396e/printnanny-api-client-0.121.0.tar.gz"
SRC_URI[md5sum] = "368b651778769770212996d43914bdb0"
SRC_URI[sha256sum] = "0a2c1074b896e175209c76c4eb2c198320a96e3e2236ca19bf8546b79d18cae4"

S = "${WORKDIR}/printnanny-api-client-0.121.0"

RDEPENDS:${PN} = "python3-aiohttp python3-protobuf python3-python-dateutil python3-six python3-urllib3"

inherit setuptools3
