
SUMMARY = "NATS client for Python"
HOMEPAGE = "https://github.com/nats-io/nats.py"
AUTHOR = " <Waldemar Quevedo <wally@synadia.com>>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRC_URI = "https://files.pythonhosted.org/packages/21/00/831ef555466bcde9419fc953ded17cb83e255733b248bf0e72a0a11759b6/nats-py-2.2.0.tar.gz"
SRC_URI[md5sum] = "355a8145fb70088a2c364a898463f52e"
SRC_URI[sha256sum] = "e45a0bafde2d04fb2d2bd6b0527b95bc77f371beaf7b6237354be0234ff9bba9"

S = "${WORKDIR}/nats-py-2.2.0"

RDEPENDS:${PN} = "python3-nkeys"

inherit setuptools3
