
SUMMARY = "Universal feed parser, handles RSS 0.9x, RSS 1.0, RSS 2.0, CDF, Atom 0.3, and Atom 1.0 feeds"
HOMEPAGE = "https://github.com/kurtmckee/feedparser"
AUTHOR = "Kurt McKee <contactme@kurtmckee.org>"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4940c38d79bc5dca0630466d7c54b004"

SRC_URI = "https://files.pythonhosted.org/packages/63/9a/824e3c036dec4f0adb4e7c36dcf4cbffc9ee317a4985218cb1663c7ab4ad/feedparser-6.0.10.tar.gz"
SRC_URI[md5sum] = "45716da638688577c7b0587a0a839a21"
SRC_URI[sha256sum] = "27da485f4637ce7163cdeab13a80312b93b7d0c1b775bef4a47629a3110bca51"

S = "${WORKDIR}/feedparser-6.0.10"

RDEPENDS:${PN} = "python3-sgmllib3k"

inherit setuptools3
BBCLASSEXTEND = "native nativesdk"
