
SUMMARY = "Cross-platform lib for process and system monitoring in Python."
HOMEPAGE = "https://github.com/giampaolo/psutil"
AUTHOR = "Giampaolo Rodola <g.rodola@gmail.com>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e35fd9f271d19d5f742f20a9d1f8bb8b"

SRC_URI = "https://files.pythonhosted.org/packages/de/eb/1c01a34c86ee3b058c556e407ce5b07cb7d186ebe47b3e69d6f152ca5cc5/psutil-5.9.3.tar.gz"
SRC_URI[md5sum] = "66b847f94545e96b540518ebe19740b4"
SRC_URI[sha256sum] = "7ccfcdfea4fc4b0a02ca2c31de7fcd186beb9cff8207800e14ab66f79c773af6"

S = "${WORKDIR}/psutil-5.9.3"

RDEPENDS:${PN} = ""

inherit setuptools3
