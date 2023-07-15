
SUMMARY = "World timezone definitions, modern and historical"
HOMEPAGE = "http://pythonhosted.org/pytz"
AUTHOR = "Stuart Bishop <stuart@stuartbishop.net>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=1a67fc46c1b596cce5d21209bbe75999"

SRC_URI = "https://files.pythonhosted.org/packages/5e/32/12032aa8c673ee16707a9b6cdda2b09c0089131f35af55d443b6a9c69c1d/pytz-2023.3.tar.gz"
SRC_URI[md5sum] = "fe54c8f8a1544b4e78b523b264ab071b"
SRC_URI[sha256sum] = "1d8ce29db189191fb55338ee6d0387d82ab59f3d00eac103412d64e0ebd0c588"

S = "${WORKDIR}/pytz-2023.3"

RDEPENDS:${PN} = ""

inherit setuptools3
