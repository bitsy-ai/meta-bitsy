
SUMMARY = "printnanny-api-client"
HOMEPAGE = ""
AUTHOR = "Leigh Johnson <leigh@printnanny.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://setup.py;md5=e5cc2e881cd39f5f14c022aed2207d5d"

SRC_URI = "https://files.pythonhosted.org/packages/32/96/003eab0b23367c8ecf3e2d1955586c80bceb20c9976ccb9fc126f3995aa5/printnanny-api-client-0.89.1.tar.gz"
SRC_URI[md5sum] = "1867e2a27ab6722428ab3a74f0fd2bdb"
SRC_URI[sha256sum] = "d7f30a27911bda2eb3c735380baf793b496a64c8ed0cfc6395a4a62351a02e10"

S = "${WORKDIR}/printnanny-api-client-0.89.1"

RDEPENDS:${PN} = "python3-urllib3 python3-six python3-python-dateutil python3-protobuf python3-aiohttp"

inherit setuptools3
