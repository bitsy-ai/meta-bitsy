
SUMMARY = "The secure Argon2 password hashing algorithm."
HOMEPAGE = ""
AUTHOR = " <Hynek Schlawack <hs@ox.cx>>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4ab25949a73fe7d4fdee93bcbdbf8ff"

SRC_URI = "https://files.pythonhosted.org/packages/3f/18/20bb5b6bf55e55d14558b57afc3d4476349ab90e0c43e60f27a7c2187289/argon2-cffi-21.3.0.tar.gz"
SRC_URI[md5sum] = "b7843e8690c790f8e743d37bb75c25a8"
SRC_URI[sha256sum] = "d384164d944190a7dd7ef22c6aa3ff197da12962bd04b17f64d4e93d934dba5b"

S = "${WORKDIR}/argon2-cffi-21.3.0"

RDEPENDS:${PN} = "python3-argon2-cffi-bindings"

inherit python_setuptools_build_meta
