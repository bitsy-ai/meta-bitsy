DESCRIPTION = "distro provides information about the OS distribution it runs on, such as a reliable machine-readable ID, or version information."
HOMEPAGE = "http://eclipse.org/paho"
LICENSE = "OSI-Approved"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=eb48c6ee2cb9f5b8b9fe75e6f817bdfc"

PYPI_PACKAGE = "paho-mqtt"
SRC_URI[sha256sum] = "9feb068e822be7b3a116324e01fb6028eb1d66412bf98595ae72698965cb1cae"

inherit pypi setuptools3
BBCLASSEXTEND = "native nativesdk"
