
SUMMARY = "The comprehensive WSGI web application library."
HOMEPAGE = ""
AUTHOR = " <>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=5dc88300786f1c214c1e9827a5229462"

SRC_URI = "https://files.pythonhosted.org/packages/d1/7e/c35cea5749237d40effc50ed1a1c7518d9f2e768fcf30b4e9ea119e74975/Werkzeug-2.3.6.tar.gz"
SRC_URI[md5sum] = "de26f240d6f95689a8d15170c2d958b6"
SRC_URI[sha256sum] = "98c774df2f91b05550078891dee5f0eb0cb797a522c757a2452b9cee5b202330"

S = "${WORKDIR}/Werkzeug-2.3.6"

RDEPENDS:${PN} = "python3-markupsafe"

inherit python_setuptools_build_meta