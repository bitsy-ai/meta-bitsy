
SUMMARY = "World timezone definitions, modern and historical"
HOMEPAGE = "http://pythonhosted.org/pytz"
AUTHOR = "Stuart Bishop <stuart@stuartbishop.net>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=1a67fc46c1b596cce5d21209bbe75999"

SRC_URI = "https://files.pythonhosted.org/packages/cf/80/8246892889a36f4a12f719da27c72faea1c2bdb6998afbfffc4284dcd457/pytz-2022.2.tar.gz"
SRC_URI[md5sum] = "e20a1ed819e34985df779d2cc409f0cb"
SRC_URI[sha256sum] = "bc824559e43e8ab983426a49525079d186b25372ff63aa3430ccd527d95edc3a"

S = "${WORKDIR}/pytz-2022.2"

RDEPENDS:${PN} = ""

inherit setuptools3
