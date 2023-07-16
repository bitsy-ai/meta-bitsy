
SUMMARY = "Easily download, build, install, upgrade, and uninstall Python packages"
HOMEPAGE = "https://github.com/pypa/setuptools"
AUTHOR = "Python Packaging Authority <distutils-sig@python.org>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=141643e11c48898150daa83802dbc65f"

SRC_URI = "https://files.pythonhosted.org/packages/dc/98/5f896af066c128669229ff1aa81553ac14cfb3e5e74b6b44594132b8540e/setuptools-68.0.0.tar.gz"
SRC_URI[md5sum] = "c5e4ff6557d99204464aa300c0bad7d4"
SRC_URI[sha256sum] = "baf1fdb41c6da4cd2eae722e135500da913332ab3f2f5c7d33af9b492acb5235"

S = "${WORKDIR}/setuptools-68.0.0"

RDEPENDS:${PN} = ""

inherit setuptools3
