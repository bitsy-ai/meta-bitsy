
SUMMARY = "cryptography is a package which provides cryptographic recipes and primitives to Python developers."
HOMEPAGE = "https://github.com/pyca/cryptography"
AUTHOR = "The Python Cryptographic Authority and individual contributors <cryptography-dev@python.org>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE.PSF;md5=43c37d21e1dbad10cddcd150ba2c0595"

SRC_URI = "https://files.pythonhosted.org/packages/51/05/bb2b681f6a77276fc423d04187c39dafdb65b799c8d87b62ca82659f9ead/cryptography-37.0.2.tar.gz"
SRC_URI[md5sum] = "7477bd10af69e78aed4c83accd401416"
SRC_URI[sha256sum] = "f224ad253cc9cea7568f49077007d2263efa57396a2f2f78114066fd54b5c68e"

S = "${WORKDIR}/cryptography-37.0.2"

RDEPENDS_${PN} = "python3-cffi"

inherit setuptools3
