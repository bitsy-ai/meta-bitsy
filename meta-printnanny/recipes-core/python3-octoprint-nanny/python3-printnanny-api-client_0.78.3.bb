
SUMMARY = "printnanny-api-client"
HOMEPAGE = ""
AUTHOR = "Leigh Johnson <leigh@printnanny.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://setup.py;md5=fa129ec32bf0de8de3a12f00e72f060d"

SRC_URI = "https://files.pythonhosted.org/packages/77/bc/f7bd5e1ea1ea64a406a9414d9dfed8c089d63ad26d7a180294a58238384f/printnanny-api-client-0.78.3.tar.gz"
SRC_URI[md5sum] = "c77ca5e89621ec33f2892f5c634df038"
SRC_URI[sha256sum] = "6cc429ebfe9c6abd788b3e2d953c4e0b81c57afa632ba7ba56d9fa227f94efdd"

S = "${WORKDIR}/printnanny-api-client-0.78.3"

RDEPENDS_${PN} = "python3-urllib3 python3-six python3-python-dateutil python3-protobuf python3-aiohttp"

inherit setuptools3
