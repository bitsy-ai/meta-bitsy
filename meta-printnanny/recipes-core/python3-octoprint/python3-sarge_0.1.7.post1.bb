
SUMMARY = "A wrapper for subprocess which provides command pipeline functionality."
HOMEPAGE = "https://docs.red-dove.com/sarge/"
AUTHOR = "Vinay Sajip <vinay_sajip@red-dove.com>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5924d2983f7af7369130f6fe5dd597b7"

SRC_URI = "https://files.pythonhosted.org/packages/3e/03/937f1f848ffe04c48e2dd0bd6c93da1a583d58695bb74a8957650ea6f0d0/sarge-0.1.7.post1.tar.gz"
SRC_URI[md5sum] = "3e71764b078181277140d1bc3d08439f"
SRC_URI[sha256sum] = "64ff42ae6ef90acbded6318ed440ed63b31a669302fb60cf41265debea282a3d"

S = "${WORKDIR}/sarge-0.1.7.post1"

RDEPENDS:${PN} = ""

inherit setuptools3_legacy
BBCLASSEXTEND = "native nativesdk"
