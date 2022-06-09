
SUMMARY = "Classes Without Boilerplate"
HOMEPAGE = "https://www.attrs.org/"
AUTHOR = "Hynek Schlawack <hs@ox.cx>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4ab25949a73fe7d4fdee93bcbdbf8ff"

SRC_URI = "https://files.pythonhosted.org/packages/d7/77/ebb15fc26d0f815839ecd897b919ed6d85c050feeb83e100e020df9153d2/attrs-21.4.0.tar.gz"
SRC_URI[md5sum] = "5a9b5e9ceebc380a13fb93235b11bbda"
SRC_URI[sha256sum] = "626ba8234211db98e869df76230a137c4c40a12d72445c45d5f5b716f076e2fd"

S = "${WORKDIR}/attrs-21.4.0"

RDEPENDS_${PN} = ""

inherit setuptools3
