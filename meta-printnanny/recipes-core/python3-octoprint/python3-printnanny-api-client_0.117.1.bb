
SUMMARY = "printnanny-api-client"
HOMEPAGE = ""
AUTHOR = "Leigh Johnson <leigh@printnanny.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://setup.py;md5=c3061e52945a4a46f460df5a358e606c"

SRC_URI = "https://files.pythonhosted.org/packages/35/c4/7dd6750fb93e31229ff75ce6109d56f428167b7ba2718f8dc71538c5cd65/printnanny-api-client-0.117.1.tar.gz"
SRC_URI[md5sum] = "6fda142f23a8d5c2f10fb71b593f0f3b"
SRC_URI[sha256sum] = "c11ff9dc8a2f56d88822d2b69fce8466f84a6299d82c36c8e9f491492280d0bc"

S = "${WORKDIR}/printnanny-api-client-0.117.1"

RDEPENDS:${PN} = "python3-aiohttp python3-protobuf python3-python-dateutil python3-six python3-urllib3"

inherit setuptools3
