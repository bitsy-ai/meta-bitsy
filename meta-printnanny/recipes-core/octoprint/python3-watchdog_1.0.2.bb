
SUMMARY = "Filesystem events monitoring"
HOMEPAGE = "https://github.com/gorakhargosh/watchdog"
AUTHOR = "Yesudeep Mangalapilly <yesudeep@gmail.com>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://files.pythonhosted.org/packages/5f/39/e9e2aa6f22983b682dda2daccd3151c706d3da66d989c78c038d6b94b962/watchdog-1.0.2.tar.gz"
SRC_URI[md5sum] = "076a319ef10f6db3a709bfbf46ca6819"
SRC_URI[sha256sum] = "376cbc2a35c0392b0fe7ff16fbc1b303fd99d4dd9911ab5581ee9d69adc88982"

S = "${WORKDIR}/watchdog-1.0.2"

RDEPENDS:${PN} = ""

inherit setuptools3
