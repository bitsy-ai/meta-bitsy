
SUMMARY = "YAML parser and emitter for Python"
HOMEPAGE = "https://pyyaml.org/"
AUTHOR = "Kirill Simonov <xi@resolvent.net>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6d8242660a8371add5fe547adf083079"

SRC_URI = "https://files.pythonhosted.org/packages/36/2b/61d51a2c4f25ef062ae3f74576b01638bebad5e045f747ff12643df63844/PyYAML-6.0.tar.gz"
SRC_URI[md5sum] = "1d19c798f25e58e3e582f0f8c977dbb8"
SRC_URI[sha256sum] = "68fb519c14306fec9720a2a5b45bc9f0c8d1b9c72adf45c37baedfcd949c35a2"

S = "${WORKDIR}/PyYAML-6.0"

RDEPENDS_${PN} = ""

inherit setuptools3
