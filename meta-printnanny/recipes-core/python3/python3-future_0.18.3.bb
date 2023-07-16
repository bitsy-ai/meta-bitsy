
SUMMARY = "Clean single-source support for Python 3 and 2"
HOMEPAGE = "https://python-future.org"
AUTHOR = "Ed Schofield <ed@pythoncharmers.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a253924061f8ecc41ad7a2ba1560e8e7"

SRC_URI = "https://files.pythonhosted.org/packages/8f/2e/cf6accf7415237d6faeeebdc7832023c90e0282aa16fd3263db0eb4715ec/future-0.18.3.tar.gz"
SRC_URI[md5sum] = "dedcb70d14b23388670d54145aab8be4"
SRC_URI[sha256sum] = "34a17436ed1e96697a86f9de3d15a3b0be01d8bc8de9c1dffd59fb8234ed5307"

S = "${WORKDIR}/future-0.18.3"

RDEPENDS:${PN} = ""

inherit setuptools3
