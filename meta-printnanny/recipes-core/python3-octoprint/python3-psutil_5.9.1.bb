
SUMMARY = "Cross-platform lib for process and system monitoring in Python."
HOMEPAGE = "https://github.com/giampaolo/psutil"
AUTHOR = "Giampaolo Rodola <g.rodola@gmail.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e35fd9f271d19d5f742f20a9d1f8bb8b"

SRC_URI = "https://files.pythonhosted.org/packages/d6/de/0999ea2562b96d7165812606b18f7169307b60cd378bc29cf3673322c7e9/psutil-5.9.1.tar.gz"
SRC_URI[md5sum] = "7d6870f35116d7590dab6cbfc462f89c"
SRC_URI[sha256sum] = "57f1819b5d9e95cdfb0c881a8a5b7d542ed0b7c522d575706a80bedc848c8954"

S = "${WORKDIR}/psutil-5.9.1"

RDEPENDS:${PN} = ""

inherit setuptools3
