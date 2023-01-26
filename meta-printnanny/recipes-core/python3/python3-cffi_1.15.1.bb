
SUMMARY = "Foreign Function Interface for Python calling C code."
HOMEPAGE = "http://cffi.readthedocs.org"
AUTHOR = "Armin Rigo, Maciej Fijalkowski <python-cffi@googlegroups.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5677e2fdbf7cdda61d6dd2b57df547bf"

SRC_URI = "https://files.pythonhosted.org/packages/2b/a8/050ab4f0c3d4c1b8aaa805f70e26e84d0e27004907c5b8ecc1d31815f92a/cffi-1.15.1.tar.gz"
SRC_URI[md5sum] = "f493860a6e98cd0c4178149568a6b4f6"
SRC_URI[sha256sum] = "d400bfb9a37b1351253cb402671cea7e89bdecc294e8016a707f6d1d8ac934f9"

S = "${WORKDIR}/cffi-1.15.1"

RDEPENDS:${PN} = "python3-pycparser"

inherit setuptools3
