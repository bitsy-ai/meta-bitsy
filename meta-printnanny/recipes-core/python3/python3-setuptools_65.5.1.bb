
SUMMARY = "Easily download, build, install, upgrade, and uninstall Python packages"
HOMEPAGE = "https://github.com/pypa/setuptools"
AUTHOR = "Python Packaging Authority <distutils-sig@python.org>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7a7126e068206290f3fe9f8d6c713ea6"

SRC_URI = "https://files.pythonhosted.org/packages/26/f4/ca5cb6df512f453ad50f78900bf7ec6a5491ee44bb49d0f6f76802dbdd43/setuptools-65.5.1.tar.gz"
SRC_URI[md5sum] = "3f062858ddfb5efa564c9c02a30cb104"
SRC_URI[sha256sum] = "e197a19aa8ec9722928f2206f8de752def0e4c9fc6953527360d1c36d94ddb2f"

S = "${WORKDIR}/setuptools-65.5.1"

RDEPENDS:${PN} = ""

inherit setuptools3
