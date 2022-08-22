
SUMMARY = "World timezone definitions, modern and historical"
HOMEPAGE = "http://pythonhosted.org/pytz"
AUTHOR = "Stuart Bishop <stuart@stuartbishop.net>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=1a67fc46c1b596cce5d21209bbe75999"

SRC_URI = "https://files.pythonhosted.org/packages/24/0c/401283bb1499768e33ddd2e1a35817c775405c1f047a9dc088a29ce2ea5d/pytz-2022.2.1.tar.gz"
SRC_URI[md5sum] = "5c7aa995be1a0091df9774502f84be4b"
SRC_URI[sha256sum] = "cea221417204f2d1a2aa03ddae3e867921971d0d76f14d87abb4414415bbdcf5"

S = "${WORKDIR}/pytz-2022.2.1"

RDEPENDS_${PN} = ""

inherit setuptools3
