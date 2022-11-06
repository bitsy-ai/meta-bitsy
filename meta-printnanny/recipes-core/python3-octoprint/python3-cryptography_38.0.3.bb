
SUMMARY = "cryptography is a package which provides cryptographic recipes and primitives to Python developers."
HOMEPAGE = "https://github.com/pyca/cryptography"
AUTHOR = "The Python Cryptographic Authority and individual contributors <cryptography-dev@python.org>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE.PSF;md5=43c37d21e1dbad10cddcd150ba2c0595"

SRC_URI = "https://files.pythonhosted.org/packages/13/dd/a9608b7aebe5d2dc0c98a4b2090a6b815628efa46cc1c046b89d8cd25f4c/cryptography-38.0.3.tar.gz"
SRC_URI[md5sum] = "2148f1283f22df0677e204e46bccaf06"
SRC_URI[sha256sum] = "bfbe6ee19615b07a98b1d2287d6a6073f734735b49ee45b11324d85efc4d5cbd"

S = "${WORKDIR}/cryptography-38.0.3"

RDEPENDS:${PN} = "python3-cffi"

inherit setuptools3
