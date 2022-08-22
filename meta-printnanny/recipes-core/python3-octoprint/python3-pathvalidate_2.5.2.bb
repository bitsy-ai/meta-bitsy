
SUMMARY = "pathvalidate is a Python library to sanitize/validate a string such as filenames/file-paths/etc."
HOMEPAGE = "https://github.com/thombashi/pathvalidate"
AUTHOR = "Tsuyoshi Hombashi <tsuyoshi.hombashi@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c83e45046b59fcd90b15acc1c54e1c00"

SRC_URI = "https://files.pythonhosted.org/packages/60/f7/ff244fdd8ed98e98d4f9acecfe74a890e5e3245ce55253ef88db51e94652/pathvalidate-2.5.2.tar.gz"
SRC_URI[md5sum] = "541238984572fb21db2da2af1d70a993"
SRC_URI[sha256sum] = "5ff57d0fabe5ecb7a4f1e4957bfeb5ad8ab5ab4c0fa71f79c6bbc24bd9b7d14d"

S = "${WORKDIR}/pathvalidate-2.5.2"

RDEPENDS_${PN} = ""

inherit setuptools3
