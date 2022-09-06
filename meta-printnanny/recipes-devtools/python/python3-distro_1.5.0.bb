DESCRIPTION = "distro provides information about the OS distribution it runs on, such as a reliable machine-readable ID, or version information."
HOMEPAGE = "https://github.com/siddhantgoel/streaming-form-data"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d2794c0df5b907fdace235a619d80314"

PYPI_PACKAGE = "distro"
SRC_URI[sha256sum] = "0e58756ae38fbd8fc3020d54badb8eae17c5b9dcbed388b17bb55b8a5928df92"

inherit pypi setuptools3
BBCLASSEXTEND = "native nativesdk"
