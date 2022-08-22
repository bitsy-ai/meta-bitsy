
SUMMARY = "cryptography is a package which provides cryptographic recipes and primitives to Python developers."
HOMEPAGE = "https://github.com/pyca/cryptography"
AUTHOR = "The Python Cryptographic Authority and individual contributors <cryptography-dev@python.org>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE.PSF;md5=43c37d21e1dbad10cddcd150ba2c0595"

SRC_URI = "https://files.pythonhosted.org/packages/89/d9/5fcd312d5cce0b4d7ee8b551a0ea99e4ea9db0fdbf6dd455a19042e3370b/cryptography-37.0.4.tar.gz"
SRC_URI[md5sum] = "9225cc6cc33b6acd2add39f7fb77faf7"
SRC_URI[sha256sum] = "63f9c17c0e2474ccbebc9302ce2f07b55b3b3fcb211ded18a42d5764f5c10a82"

S = "${WORKDIR}/cryptography-37.0.4"

RDEPENDS:${PN} = "python3-cffi"

inherit setuptools3
