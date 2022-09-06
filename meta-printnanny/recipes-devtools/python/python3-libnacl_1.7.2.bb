DESCRIPTION = "Python bindings for libsodium based on ctypes"
HOMEPAGE = "https://libnacl.readthedocs.org/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9a79418f241689e78034391d51162d24"

PYPI_PACKAGE = "libnacl"
SRC_URI[sha256sum] = "b53999817435d24bf87bc9c7a2fb95e865f8ff7dc6a36655c28d6c62443c3d6b"

inherit pypi setuptools3
BBCLASSEXTEND = "native nativesdk"
