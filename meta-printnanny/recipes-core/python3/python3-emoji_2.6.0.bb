
SUMMARY = "Emoji for Python"
HOMEPAGE = "https://github.com/carpedm20/emoji/"
AUTHOR = "Taehoon Kim, Kevin Wurster <carpedm20@gmail.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=40d4d8c9053144ce320e358a5bb592f4"

SRC_URI = "https://files.pythonhosted.org/packages/de/e6/4a7eb9de0d78022cb759994c8cf517d19eb3fd12720cdf8ec4d92773c91e/emoji-2.6.0.tar.gz"
SRC_URI[md5sum] = "dc70520ffccc70c94f63294e816da757"
SRC_URI[sha256sum] = "39ad95c9ba270cdfbd141d20c2ebcfc4e295d010b605de66908a098a3ba63a3c"

S = "${WORKDIR}/emoji-2.6.0"

RDEPENDS:${PN} = ""

inherit setuptools3
