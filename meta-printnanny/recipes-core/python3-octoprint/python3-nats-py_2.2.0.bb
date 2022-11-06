
SUMMARY = "NATS client for Python"
HOMEPAGE = ""
AUTHOR = " <Waldemar Quevedo <wally@synadia.com>>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "https://files.pythonhosted.org/packages/21/00/831ef555466bcde9419fc953ded17cb83e255733b248bf0e72a0a11759b6/nats-py-2.2.0.tar.gz"
SRC_URI[md5sum] = "355a8145fb70088a2c364a898463f52e"
SRC_URI[sha256sum] = "e45a0bafde2d04fb2d2bd6b0527b95bc77f371beaf7b6237354be0234ff9bba9"

S = "${WORKDIR}/nats-py-2.2.0"

RDEPENDS:${PN} = ""

inherit setuptools3
