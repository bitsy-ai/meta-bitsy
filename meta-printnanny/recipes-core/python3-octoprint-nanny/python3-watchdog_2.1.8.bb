
SUMMARY = "Filesystem events monitoring"
HOMEPAGE = "https://github.com/gorakhargosh/watchdog"
AUTHOR = "Yesudeep Mangalapilly <yesudeep@gmail.com>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://files.pythonhosted.org/packages/90/61/ddbf959d24fab35a98a8311e95d581e55109560e524f1a5a299ee991499d/watchdog-2.1.8.tar.gz"
SRC_URI[md5sum] = "44ed9dfb922e3716bcf8169a4cc3cf74"
SRC_URI[sha256sum] = "6d03149126864abd32715d4e9267d2754cede25a69052901399356ad3bc5ecff"

S = "${WORKDIR}/watchdog-2.1.8"

RDEPENDS_${PN} = ""

inherit setuptools3
