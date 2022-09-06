DESCRIPTION = "distro provides information about the OS distribution it runs on, such as a reliable machine-readable ID, or version information."
HOMEPAGE = "http://eclipse.org/paho"
LICENSE = "OSI-Approved"
LIC_FILES_CHKSUM = "file://LICENSE;md5=28a8c10291bba0bc0f8b9d5e87c0d826"

PYPI_PACKAGE = "paho-mqtt"
SRC_URI[sha256sum] = "9feb068e822be7b3a116324e01fb6028eb1d66412bf98595ae72698965cb1cae"

inherit pypi setuptools3
BBCLASSEXTEND = "native nativesdk"
