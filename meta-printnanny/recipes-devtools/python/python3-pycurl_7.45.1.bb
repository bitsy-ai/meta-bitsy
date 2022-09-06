DESCRIPTION = "PycURL -- A Python Interface To The cURL library"
HOMEPAGE = "http://pycurl.io/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING-MIT;md5=be42e1b1e58c8d59c2901fd747bfc55d"

PYPI_PACKAGE = "pycurl"
SRC_URI[sha256sum] = "a863ad18ff478f5545924057887cdae422e1b2746e41674615f687498ea5b88a"

DEPENDS = "curl"
inherit pypi setuptools3
BBCLASSEXTEND = "native nativesdk"
