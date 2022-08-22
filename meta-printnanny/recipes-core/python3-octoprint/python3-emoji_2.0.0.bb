
SUMMARY = "Emoji for Python"
HOMEPAGE = "https://github.com/carpedm20/emoji/"
AUTHOR = "Taehoon Kim, Kevin Wurster and Tahir Jalilov <carpedm20@gmail.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=4c1af0cdc2cbba3314054cacba89223e"

SRC_URI = "https://files.pythonhosted.org/packages/85/f3/0a09c327f81c792707727125e0b43e4eb6b1397f77d44162a8a5115260c0/emoji-2.0.0.tar.gz"
SRC_URI[md5sum] = "5473e1a104339f907f1c5a3fbed143b8"
SRC_URI[sha256sum] = "297fac7ec9e86f7b602792c28eb6f04819ba67ab88a34c56afcde52243a9a105"

S = "${WORKDIR}/emoji-2.0.0"

RDEPENDS:${PN} = ""

inherit setuptools3
