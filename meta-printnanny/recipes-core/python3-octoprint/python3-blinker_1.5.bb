
SUMMARY = "Fast, simple object-to-object and broadcast signaling"
HOMEPAGE = "https://blinker.readthedocs.io"
AUTHOR = "Jason Kirtland <jek@discorporate.us>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=42cd19c88fc13d1307a4efd64ee90e4e"

SRC_URI = "https://files.pythonhosted.org/packages/2b/12/82786486cefb68685bb1c151730f510b0f4e5d621d77f245bc0daf9a6c64/blinker-1.5.tar.gz"
SRC_URI[md5sum] = "e1c3eec8e52210f69ef59d299c6cca07"
SRC_URI[sha256sum] = "923e5e2f69c155f2cc42dafbbd70e16e3fde24d2d4aa2ab72fbe386238892462"

S = "${WORKDIR}/blinker-1.5"

RDEPENDS:${PN} = ""

inherit setuptools3
