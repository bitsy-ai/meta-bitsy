
SUMMARY = "Add colours to the output of Python's logging module."
HOMEPAGE = "https://github.com/borntyping/python-colorlog"
AUTHOR = "Sam Clements <sam@borntyping.co.uk>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5c3c6ebdec7792ae12df8d1c0a46b26a"

SRC_URI = "https://files.pythonhosted.org/packages/8e/8f/1537ebed273d43edd3bb21f1e5861549b7cfcb1d47523d7277cab988cec2/colorlog-6.6.0.tar.gz"
SRC_URI[md5sum] = "4d8908b85fd6278a330a7f980393137e"
SRC_URI[sha256sum] = "344f73204009e4c83c5b6beb00b3c45dc70fcdae3c80db919e0a4171d006fde8"

S = "${WORKDIR}/colorlog-6.6.0"

RDEPENDS:${PN} = ""

inherit setuptools3
