DESCRIPTION = "Push Notifications that work with just about every platform!"
HOMEPAGE = "https://github.com/caronc/apprise"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9a79418f241689e78034391d51162d24"

PYPI_PACKAGE = "apprise"
SRC_URI[sha256sum] = "9653900331f8bd1f4efa9cda2c2b9e27b69aafb2adf14b2bce65797f75333acb"

inherit pypi setuptools3
BBCLASSEXTEND = "native nativesdk"
