
SUMMARY = "printnanny-api-client"
HOMEPAGE = ""
AUTHOR = "Leigh Johnson <leigh@printnanny.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://setup.py;md5=c3061e52945a4a46f460df5a358e606c"

SRC_URI = "https://files.pythonhosted.org/packages/cb/48/73a83211cd4556238c5730d8dff5e466e6c84fda9c595fc756d1d751687d/printnanny-api-client-0.117.2.tar.gz"
SRC_URI[md5sum] = "b1ea58f62d673d5bdc9ca931888487e1"
SRC_URI[sha256sum] = "6364a9af39f2fa0eaa6e3a5ff59cc3d10266d07f7eecbbe59bfaa9ce771b1d3a"

S = "${WORKDIR}/printnanny-api-client-0.117.2"

RDEPENDS:${PN} = "python3-aiohttp python3-protobuf python3-python-dateutil python3-six python3-urllib3"

inherit setuptools3
