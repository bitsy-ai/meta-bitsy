
SUMMARY = "printnanny-api-client"
HOMEPAGE = ""
AUTHOR = "Leigh Johnson <leigh@printnanny.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://setup.py;md5=e4f4f5f73e424faa019ff27b8fe5d893"

SRC_URI = "https://files.pythonhosted.org/packages/3c/94/ad3d6e8d1d7aa63f135d663441b986a45bff076df8addd1303f8b33cde5b/printnanny-api-client-0.126.0.tar.gz"
SRC_URI[sha256sum] = "1b99a90dd88cd4916e4c66c956373c9f2b9d5f68bcf380ad0c78ab1fd148f863"

S = "${WORKDIR}/printnanny-api-client-0.126.0"

RDEPENDS:${PN} = "python3-aiohttp python3-protobuf python3-python-dateutil python3-six python3-urllib3"

inherit setuptools3
