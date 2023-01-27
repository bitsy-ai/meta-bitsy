
SUMMARY = "Rate limiting for flask applications"
HOMEPAGE = "https://flask-limiter.readthedocs.org"
AUTHOR = "Ali-Akber Saifee <ali@indydevs.org>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=9a60a272513852526711e0e1032f0832"

SRC_URI = "https://files.pythonhosted.org/packages/18/f5/0de699d3d7188a945f4d4021692ea0c3c05acd32014db131c6675ddc17a2/Flask-Limiter-2.6.3.tar.gz"
SRC_URI[md5sum] = "6cb2d2fcfd42223068f3572666231bc8"
SRC_URI[sha256sum] = "01c32180e6136e6f68aeb60852a9a2881cc350eca8932ef9b4591a7ef9f9581c"

S = "${WORKDIR}/Flask-Limiter-2.6.3"

RDEPENDS:${PN} = "python3-limits python3-flask python3-rich python3-typing-extensions"

inherit setuptools3
