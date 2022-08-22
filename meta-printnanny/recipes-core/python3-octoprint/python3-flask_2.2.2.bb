
SUMMARY = "A simple framework for building complex web applications."
HOMEPAGE = "https://palletsprojects.com/p/flask"
AUTHOR = "Armin Ronacher <armin.ronacher@active-4.com>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=ffeffa59c90c9c4a033c7574f8f3fb75"

SRC_URI = "https://files.pythonhosted.org/packages/69/b6/53cfa30eed5aa7343daff36622843688ba8c6fe9829bb2b92e193ab1163f/Flask-2.2.2.tar.gz"
SRC_URI[md5sum] = "c0d2276cb7d59a06d62c915da9c77ba6"
SRC_URI[sha256sum] = "642c450d19c4ad482f96729bd2a8f6d32554aa1e231f4f6b4e7e5264b16cca2b"

S = "${WORKDIR}/Flask-2.2.2"

RDEPENDS:${PN} = "python3-werkzeug python3-jinja2 python3-itsdangerous python3-click"

inherit setuptools3
