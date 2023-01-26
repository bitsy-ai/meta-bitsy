
SUMMARY = "Yet another URL library"
HOMEPAGE = "https://github.com/aio-libs/yarl/"
AUTHOR = "Andrew Svetlov <andrew.svetlov@gmail.com>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e581798a7b985311f29fa3e163ea27ae"

SRC_URI = "https://files.pythonhosted.org/packages/d6/04/255c68974ec47fa754564c4abba8f61f9ed68b869bbbb854198d6259c4f7/yarl-1.8.1.tar.gz"
SRC_URI[md5sum] = "ff8f2843481cd11c3c674ce4f6fa167b"
SRC_URI[sha256sum] = "af887845b8c2e060eb5605ff72b6f2dd2aab7a761379373fd89d314f4752abbf"

S = "${WORKDIR}/yarl-1.8.1"

RDEPENDS:${PN} = "python3-multidict python3-idna"

inherit setuptools3
