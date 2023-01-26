
SUMMARY = "A very fast and expressive template engine."
HOMEPAGE = "https://palletsprojects.com/p/jinja/"
AUTHOR = "Armin Ronacher <armin.ronacher@active-4.com>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=5dc88300786f1c214c1e9827a5229462"

SRC_URI = "https://files.pythonhosted.org/packages/7a/ff/75c28576a1d900e87eb6335b063fab47a8ef3c8b4d88524c4bf78f670cce/Jinja2-3.1.2.tar.gz"
SRC_URI[md5sum] = "d31148abd89c1df1cdb077a55db27d02"
SRC_URI[sha256sum] = "31351a702a408a9e7595a8fc6150fc3f43bb6bf7e319770cbc0db9df9437e852"

S = "${WORKDIR}/Jinja2-3.1.2"

RDEPENDS:${PN} = "python3-markupsafe"

inherit setuptools3
