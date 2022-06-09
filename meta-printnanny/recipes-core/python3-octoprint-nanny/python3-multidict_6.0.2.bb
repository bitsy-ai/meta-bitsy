
SUMMARY = "multidict implementation"
HOMEPAGE = "https://github.com/aio-libs/multidict"
AUTHOR = "Andrew Svetlov <andrew.svetlov@gmail.com>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84c63e2bcd84e619d249af5181e2147f"

SRC_URI = "https://files.pythonhosted.org/packages/fa/a7/71c253cdb8a1528802bac7503bf82fe674367e4055b09c28846fdfa4ab90/multidict-6.0.2.tar.gz"
SRC_URI[md5sum] = "f8230905ad1f50c87e8d9cc6b0bb7ca2"
SRC_URI[sha256sum] = "5ff3bd75f38e4c43f1f470f2df7a4d430b821c4ce22be384e1459cb57d6bb013"

S = "${WORKDIR}/multidict-6.0.2"

RDEPENDS_${PN} = ""

inherit setuptools3
