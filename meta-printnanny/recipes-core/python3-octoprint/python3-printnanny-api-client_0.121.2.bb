
SUMMARY = "printnanny-api-client"
HOMEPAGE = ""
AUTHOR = "Leigh Johnson <leigh@printnanny.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://setup.py;md5=d9e6a09edf4ce93eb11a8e7a35657c19"

SRC_URI = "https://files.pythonhosted.org/packages/c2/b8/b7ca63727e67dfce6ba8a1c676815a92290fe42fa92bfe1b323889d356de/printnanny-api-client-0.121.2.tar.gz"
SRC_URI[md5sum] = "4ac579488c1c2b4d59a51ad858b5a262"
SRC_URI[sha256sum] = "63c4b5d1148e06ed9ab327b945a6bc2a180e5616b6fbf68e6202fc5632a86917"

S = "${WORKDIR}/printnanny-api-client-0.121.2"

RDEPENDS:${PN} = "python3-aiohttp python3-protobuf python3-python-dateutil python3-six python3-urllib3"

inherit setuptools3
