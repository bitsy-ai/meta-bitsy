
SUMMARY = "pathvalidate is a Python library to sanitize/validate a string such as filenames/file-paths/etc."
HOMEPAGE = "https://github.com/thombashi/pathvalidate"
AUTHOR = "Tsuyoshi Hombashi <tsuyoshi.hombashi@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c83e45046b59fcd90b15acc1c54e1c00"

SRC_URI = "https://files.pythonhosted.org/packages/04/45/3787d66cf2eb8f520dd26f1ab016305942b57e67be0bf1c4f42159d58b4d/pathvalidate-3.0.0.tar.gz"
SRC_URI[md5sum] = "397ac70dd3316df0b04ff5dd4fa2b7aa"
SRC_URI[sha256sum] = "cfca1886f3cd8862b10bce18a87f4dc02d6418399e539ede2b010dc8588991ce"

S = "${WORKDIR}/pathvalidate-3.0.0"

RDEPENDS:${PN} = ""

inherit setuptools3
