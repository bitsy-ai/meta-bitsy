
SUMMARY = "The comprehensive WSGI web application library."
HOMEPAGE = "https://palletsprojects.com/p/werkzeug/"
AUTHOR = "Armin Ronacher <armin.ronacher@active-4.com>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=5dc88300786f1c214c1e9827a5229462"

SRC_URI = "https://files.pythonhosted.org/packages/f8/c1/1c8e539f040acd80f844c69a5ef8e2fccdf8b442dabb969e497b55d544e1/Werkzeug-2.2.2.tar.gz"
SRC_URI[md5sum] = "9d7e50c5bb3a9fc12823b5faf374b90e"
SRC_URI[sha256sum] = "7ea2d48322cc7c0f8b3a215ed73eabd7b5d75d0b50e31ab006286ccff9e00b8f"

S = "${WORKDIR}/Werkzeug-2.2.2"

RDEPENDS:${PN} = "python3-markupsafe"

inherit setuptools3
