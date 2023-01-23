
SUMMARY = "printnanny-api-client"
HOMEPAGE = ""
AUTHOR = "Leigh Johnson <leigh@printnanny.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://setup.py;md5=e84fb9d7913369060a656f638409d278"

SRC_URI = "https://files.pythonhosted.org/packages/97/b3/f15bb1e63b69c2ccdea93821dcd2dd75c6fbf4e9742f861e1aaa699b42e7/printnanny-api-client-0.124.8.tar.gz"
SRC_URI[sha256sum] = "fe33608c84b1137e6cd70967c51c0712975abbe0abe4f5f782902e2b3633c4f9"

S = "${WORKDIR}/printnanny-api-client-0.124.8"

RDEPENDS:${PN} = "python3-aiohttp python3-protobuf python3-python-dateutil python3-six python3-urllib3"

inherit setuptools3
