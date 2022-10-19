
SUMMARY = "The secure Argon2 password hashing algorithm."
HOMEPAGE = "https://github.com/hynek/argon2-cffi"
AUTHOR = "Hynek Schlawack"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT"

SRC_URI[sha256sum] = "d384164d944190a7dd7ef22c6aa3ff197da12962bd04b17f64d4e93d934dba5b"
inherit pypi setuptools3
PYPI_PACKAGE = "argon2-cffi"
