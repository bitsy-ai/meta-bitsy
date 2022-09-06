DESCRIPTION = "A zero-dependency DBus library for Python with asyncio support"
HOMEPAGE = "https://github.com/altdesktop/python-dbus-next"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9a79418f241689e78034391d51162d24"

PYPI_PACKAGE = "dbus-next"
# SRC_URI[sha256sum] = "a863ad18ff478f5545924057887cdae422e1b2746e41674615f687498ea5b88a"

inherit pypi setuptools3
BBCLASSEXTEND = "native nativesdk"
