
SUMMARY = "Python bindings to the Ed25519 public-key signature system."
HOMEPAGE = "https://github.com/nats-io/nkeys.py"
AUTHOR = "Brian Warner <warner-python-ed25519@lothar.com>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "https://files.pythonhosted.org/packages/58/38/72ec85c953b90552fb015f31248256ef19e89a164a40ff8fef680259a608/ed25519-1.5.tar.gz"
SRC_URI[md5sum] = "70961da37e5b15eee0a85b31807f7578"
SRC_URI[sha256sum] = "02053ee019ceef0df97294be2d4d5a8fc120fc86e81e08bec1245fc0f9403358"

S = "${WORKDIR}/nkeys-0.1.0"

RDEPENDS:${PN} = ""

inherit setuptools3
