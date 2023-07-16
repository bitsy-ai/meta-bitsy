
SUMMARY = "comprehensive password hashing framework supporting over 30 schemes"
HOMEPAGE = "https://passlib.readthedocs.io"
AUTHOR = "Eli Collins <elic@assurancetechnologies.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c8449c5e10474d113ab787ed2753bafe"

SRC_URI = "https://files.pythonhosted.org/packages/b6/06/9da9ee59a67fae7761aab3ccc84fa4f3f33f125b370f1ccdb915bf967c11/passlib-1.7.4.tar.gz"
SRC_URI[md5sum] = "3a229cbd00dfb33e99885b43325e0591"
SRC_URI[sha256sum] = "defd50f72b65c5402ab2c573830a6978e5f202ad0d984793c8dde2c4152ebe04"

S = "${WORKDIR}/passlib-1.7.4"

RDEPENDS:${PN} = ""

inherit setuptools3
