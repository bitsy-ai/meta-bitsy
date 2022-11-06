
SUMMARY = "printnanny-api-client"
HOMEPAGE = ""
AUTHOR = "Leigh Johnson <leigh@printnanny.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://setup.py;md5=fe1a5b17dbca635d4470c844f59dd214"

SRC_URI = "https://files.pythonhosted.org/packages/51/df/8ea210355b9e5564d3c41c45dd5d163a1caf57ddff7f8721fed4cbd6dd9d/printnanny-api-client-0.115.0.tar.gz"
SRC_URI[md5sum] = "60c3a32345c4d3dd31f86bb8d62a41f1"
SRC_URI[sha256sum] = "87718d29838da019066e78b8f5468c581860925273bf8b002b93ae642fa22623"

S = "${WORKDIR}/printnanny-api-client-0.115.0"

RDEPENDS:${PN} = "python3-aiohttp python3-protobuf python3-python-dateutil python3-six python3-urllib3"

inherit setuptools3
