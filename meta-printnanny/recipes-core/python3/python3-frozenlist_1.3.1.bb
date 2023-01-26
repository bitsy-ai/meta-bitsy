
SUMMARY = "A list-like structure which implements collections.abc.MutableSequence"
HOMEPAGE = "https://github.com/aio-libs/frozenlist"
AUTHOR = " <>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cf056e8e7a0a5477451af18b7b5aa98c"

SRC_URI = "https://files.pythonhosted.org/packages/8a/95/229aacfe85daa28e2792481a98c336bc30d3729533e6a44db537880aca21/frozenlist-1.3.1.tar.gz"
SRC_URI[md5sum] = "6ac017ba79ac7a1491e47e89012efeab"
SRC_URI[sha256sum] = "3a735e4211a04ccfa3f4833547acdf5d2f863bfeb01cfd3edaffbc251f15cec8"

S = "${WORKDIR}/frozenlist-1.3.1"

RDEPENDS:${PN} = ""

inherit setuptools3
