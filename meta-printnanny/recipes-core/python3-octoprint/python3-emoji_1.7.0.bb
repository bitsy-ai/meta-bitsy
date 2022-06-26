
SUMMARY = "Emoji for Python"
HOMEPAGE = "https://github.com/carpedm20/emoji/"
AUTHOR = "Taehoon Kim, Kevin Wurster and Tahir Jalilov <carpedm20@gmail.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=af8276871b79ce45d11d70c8c244aa2b"

SRC_URI = "https://files.pythonhosted.org/packages/68/8a/b08dd0b946f0843cba782e3784cd979c33f144e5e7c37fb0162dc47acd43/emoji-1.7.0.tar.gz"
SRC_URI[md5sum] = "0958b71dd630c28a22c95ed19098e8e4"
SRC_URI[sha256sum] = "65c54533ea3c78f30d0729288998715f418d7467de89ec258a31c0ce8660a1d1"

S = "${WORKDIR}/emoji-1.7.0"

RDEPENDS:${PN} = ""

inherit setuptools3
