
SUMMARY = "Backported and Experimental Type Hints for Python 3.7+"
HOMEPAGE = ""
AUTHOR = " <"Guido van Rossum, Jukka Lehtosalo, Łukasz Langa, Michael Lee" <levkivskyi@gmail.com>>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f16b323917992e0f8a6f0071bc9913e2"

SRC_URI = "https://files.pythonhosted.org/packages/e3/a7/8f4e456ef0adac43f452efc2d0e4b242ab831297f1bac60ac815d37eb9cf/typing_extensions-4.4.0.tar.gz"
SRC_URI[md5sum] = "5cfcb56ea6fc4972c3600c0030f4d136"
SRC_URI[sha256sum] = "1511434bb92bf8dd198c12b1cc812e800d4181cfcb867674e0f8279cc93087aa"

S = "${WORKDIR}/typing_extensions-4.4.0"

RDEPENDS_${PN} = ""

inherit python_flit_core
