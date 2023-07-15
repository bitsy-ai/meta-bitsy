
SUMMARY = "Add colours to the output of Python's logging module."
HOMEPAGE = "https://github.com/borntyping/python-colorlog"
AUTHOR = "Sam Clements <sam@borntyping.co.uk>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5c3c6ebdec7792ae12df8d1c0a46b26a"

SRC_URI = "https://files.pythonhosted.org/packages/78/6b/4e5481ddcdb9c255b2715f54c863629f1543e97bc8c309d1c5c131ad14f2/colorlog-6.7.0.tar.gz"
SRC_URI[md5sum] = "80b79f7824d39d4f3b11c75d1cba094e"
SRC_URI[sha256sum] = "bd94bd21c1e13fac7bd3153f4bc3a7dc0eb0974b8bc2fdf1a989e474f6e582e5"

S = "${WORKDIR}/colorlog-6.7.0"

RDEPENDS:${PN} = ""

inherit setuptools3
