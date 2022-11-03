DESCRIPTION = "A zero-dependency DBus library for Python with asyncio support"
HOMEPAGE = "https://github.com/altdesktop/python-dbus-next"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=94e750c96e56788499b56c81de91431c"

inherit pypi setuptools3
PYPI_PACKAGE = "dbus-next"
PYPI_SRC_URI = "https://files.pythonhosted.org/packages/ce/45/6a40fbe886d60a8c26f480e7d12535502b5ba123814b3b9a0b002ebca198/dbus_next-${PV}.tar.gz"
SRC_URI[sha256sum] = "f4eae26909332ada528c0a3549dda8d4f088f9b365153952a408e28023a626a5"

S = "${WORKDIR}/dbus_next-${PV}"


BBCLASSEXTEND = "native nativesdk"
