
SUMMARY = "HTTP library with thread-safe connection pooling, file post, and more."
HOMEPAGE = "https://urllib3.readthedocs.io/"
AUTHOR = "Andrey Petrov <andrey.petrov@shazow.net>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c2823cb995439c984fd62a973d79815c"

SRC_URI = "https://files.pythonhosted.org/packages/6d/d5/e8258b334c9eb8eb78e31be92ea0d5da83ddd9385dc967dd92737604d239/urllib3-1.26.11.tar.gz"
SRC_URI[md5sum] = "0a37b04e936ad24f3c5bf6b6e952bc21"
SRC_URI[sha256sum] = "ea6e8fb210b19d950fab93b60c9009226c63a28808bc8386e05301e25883ac0a"

S = "${WORKDIR}/urllib3-1.26.11"

RDEPENDS:${PN} = ""

inherit setuptools3
