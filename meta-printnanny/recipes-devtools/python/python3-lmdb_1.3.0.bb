DESCRIPTION = "Universal Python binding for the LMDB 'Lightning' Database"
HOMEPAGE = "http://github.com/jnwatson/py-lmdb/"
LICENSE = "OLDAP-2.8"
LIC_FILES_CHKSUM = "file://LICENSE;md5=153d07ef052c4a37a8fac23bc6031972"

PYPI_PACKAGE = "lmdb"
SRC_URI[sha256sum] = "60a11efc21aaf009d06518996360eed346f6000bfc9de05114374230879f992e"

inherit pypi setuptools3
BBCLASSEXTEND = "native nativesdk"
