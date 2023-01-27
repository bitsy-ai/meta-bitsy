
SUMMARY = "World timezone definitions, modern and historical"
HOMEPAGE = "http://pythonhosted.org/pytz"
AUTHOR = "Stuart Bishop <stuart@stuartbishop.net>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=1a67fc46c1b596cce5d21209bbe75999"

SRC_URI = "https://files.pythonhosted.org/packages/76/63/1be349ff0a44e4795d9712cc0b2d806f5e063d4d34631b71b832fac715a8/pytz-2022.6.tar.gz"
SRC_URI[md5sum] = "bf46b54a7e9bcb65ea38f54646181979"
SRC_URI[sha256sum] = "e89512406b793ca39f5971bc999cc538ce125c0e51c27941bef4568b460095e2"

S = "${WORKDIR}/pytz-2022.6"

RDEPENDS:${PN} = ""

inherit setuptools3
