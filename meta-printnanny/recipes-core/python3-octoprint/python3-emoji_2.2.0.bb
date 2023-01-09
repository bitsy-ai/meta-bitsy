
SUMMARY = "Emoji for Python"
HOMEPAGE = "https://github.com/carpedm20/emoji/"
AUTHOR = "Taehoon Kim, Kevin Wurster and Tahir Jalilov <carpedm20@gmail.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=4c1af0cdc2cbba3314054cacba89223e"

SRC_URI = "https://files.pythonhosted.org/packages/56/3c/26aefc6bbfa015e1dabbabd6881103e236c7ae67fabb3265fef0c85e89b5/emoji-2.2.0.tar.gz"
SRC_URI[md5sum] = "b6405409383fdf244929c5d37343964a"
SRC_URI[sha256sum] = "a2986c21e4aba6b9870df40ef487a17be863cb7778dcf1c01e25917b7cd210bb"

S = "${WORKDIR}/emoji-2.2.0"

RDEPENDS:${PN} = ""

inherit setuptools3
BBCLASSEXTEND = "native nativesdk"
