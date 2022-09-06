DESCRIPTION = "Async I/O extension package for the Python Serial Port Extension for OSX, Linux, BSD"
HOMEPAGE = "https://github.com/pyserial/pyserial-asyncio"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=9a79418f241689e78034391d51162d24"

PYPI_PACKAGE = "pyserial-asyncio"
SRC_URI[sha256sum] = "b6032923e05e9d75ec17a5af9a98429c46d2839adfaf80604d52e0faacd7a32f"

inherit pypi setuptools3
BBCLASSEXTEND = "native nativesdk"
