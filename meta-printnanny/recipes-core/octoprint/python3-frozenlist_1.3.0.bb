
SUMMARY = "A list-like structure which implements collections.abc.MutableSequence"
HOMEPAGE = "https://github.com/aio-libs/frozenlist"
AUTHOR = " <>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cf056e8e7a0a5477451af18b7b5aa98c"

SRC_URI = "https://files.pythonhosted.org/packages/f4/f7/8dfeb76d2a52bcea2b0718427af954ffec98be1d34cd8f282034b3e36829/frozenlist-1.3.0.tar.gz"
SRC_URI[md5sum] = "e65d870bd189ba3c21ab7eb10eab22b7"
SRC_URI[sha256sum] = "ce6f2ba0edb7b0c1d8976565298ad2deba6f8064d2bebb6ffce2ca896eb35b0b"

S = "${WORKDIR}/frozenlist-1.3.0"

RDEPENDS:${PN} = ""

inherit setuptools3
