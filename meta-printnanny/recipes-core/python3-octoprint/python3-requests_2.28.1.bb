
SUMMARY = "Python HTTP for Humans."
HOMEPAGE = "https://requests.readthedocs.io"
AUTHOR = "Kenneth Reitz <me@kennethreitz.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=34400b68072d710fecd0a2940a0d1658"

SRC_URI = "https://files.pythonhosted.org/packages/a5/61/a867851fd5ab77277495a8709ddda0861b28163c4613b011bc00228cc724/requests-2.28.1.tar.gz"
SRC_URI[md5sum] = "796ea875cdae283529c03b9203d9c454"
SRC_URI[sha256sum] = "7c5599b102feddaa661c826c56ab4fee28bfd17f5abca1ebbe3e7f19d7c97983"

S = "${WORKDIR}/requests-2.28.1"

RDEPENDS_${PN} = "python3-charset-normalizer python3-idna python3-urllib3 python3-certifi"

inherit setuptools3
