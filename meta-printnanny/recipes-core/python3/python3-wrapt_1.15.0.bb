
SUMMARY = "Module for decorators, wrappers and monkey patching."
HOMEPAGE = "https://github.com/GrahamDumpleton/wrapt"
AUTHOR = "Graham Dumpleton <Graham.Dumpleton@gmail.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dc34cbad60bc961452eb7ade801d25f7"

SRC_URI = "https://files.pythonhosted.org/packages/f8/7d/73e4e3cdb2c780e13f9d87dc10488d7566d8fd77f8d68f0e416bfbd144c7/wrapt-1.15.0.tar.gz"
SRC_URI[md5sum] = "1d5b17810f1fb5db543185651ddb0fce"
SRC_URI[sha256sum] = "d06730c6aed78cee4126234cf2d071e01b44b915e725a6cb439a879ec9754a3a"

S = "${WORKDIR}/wrapt-1.15.0"

RDEPENDS:${PN} = ""

inherit setuptools3
