
SUMMARY = "A public-key signature system based on Ed25519 for the NATS ecosystem."
HOMEPAGE = "https://github.com/nats-io/nkeys.py"
AUTHOR = " <Waldemar Quevedo <wally@synadia.com>>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "https://files.pythonhosted.org/packages/73/fe/d788a4fe70442e527d73f52d3091be3a980d539b63b8574349b5a3732881/nkeys-0.1.0.tar.gz"
SRC_URI[md5sum] = "870fd02211baf8536c19fe6713c29ba4"
SRC_URI[sha256sum] = "93482ab08ff9625882b988c3ea58fd1a6ef0061b60f95946742cc1394578760a"

S = "${WORKDIR}/nkeys-0.1.0"

RDEPENDS:${PN} = "ed25519"

inherit setuptools3
