
SUMMARY = "Internationalization utilities"
HOMEPAGE = "https://babel.pocoo.org/"
AUTHOR = "Armin Ronacher <armin.ronacher@active-4.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1b3f4650099e6d6a73e5a7fc8774ff18"

SRC_URI = "https://files.pythonhosted.org/packages/51/27/81e9cf804a34a550a47cc2f0f57fe4935281d479ae3a0ac093d69476f221/Babel-2.10.3.tar.gz"
SRC_URI[md5sum] = "809ed21b4f643167d0f6f5e936bbfbdc"
SRC_URI[sha256sum] = "7614553711ee97490f732126dc077f8d0ae084ebc6a96e23db1482afabdb2c51"

S = "${WORKDIR}/Babel-2.10.3"

RDEPENDS:${PN} = "python3-pytz"

inherit setuptools3
