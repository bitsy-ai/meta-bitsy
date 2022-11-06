
SUMMARY = "pyparsing module - Classes and methods to define and execute parsing grammars"
HOMEPAGE = ""
AUTHOR = " <Paul McGuire <ptmcg.gm+pyparsing@gmail.com>>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=657a566233888513e1f07ba13e2f47f1"

SRC_URI = "https://files.pythonhosted.org/packages/71/22/207523d16464c40a0310d2d4d8926daffa00ac1f5b1576170a32db749636/pyparsing-3.0.9.tar.gz"
SRC_URI[md5sum] = "fadc2f3bf5872bf6310576a86c3566e0"
SRC_URI[sha256sum] = "2b020ecf7d21b687f219b71ecad3631f644a47f01403fa1d1036b0c6416d70fb"

S = "${WORKDIR}/pyparsing-3.0.9"

RDEPENDS:${PN} = ""

inherit setuptools3
