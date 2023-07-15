
SUMMARY = "Extract attributes docstrings defined in various ways"
HOMEPAGE = "https://github.com/danields761/class-doc"
AUTHOR = "Daniel Daniels <danields761@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=7fe451d11cfafbd0a60b41343b95b31e"

SRC_URI = "https://files.pythonhosted.org/packages/89/1e/4378f484ba489255a8f523feb381f792eb195745a709b56efc46a22a333d/class-doc-0.2.6.tar.gz"
SRC_URI[md5sum] = "e624e059fd5d2b6f6e5a6c479f1f9208"
SRC_URI[sha256sum] = "f5e036ed9b7f6de528affdd9f038851910b342d4c1c1252983a55ff080b530e0"

S = "${WORKDIR}/class-doc-0.2.6"

RDEPENDS:${PN} = "python3-more-itertools"

inherit setuptools3
