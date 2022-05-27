LICENSE = "AGPLv3"

inherit pypi setuptools3

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

LIC_FILES_CHKSUM = "file://${S}/LICENSE.txt;md5=73f1eb20517c55bf9493b7dd6e480788"
SRC_URI[sha256sum] = "d4109d854c6b1a4155af3360597b31aed28a1a20df146d77105060ed74d05f21"
PYPI_PACKAGE = "OctoPrint-Nanny"

RDEPENDS:${PN} = "\
    python3 \
    python3-pip \
"
RPROVIDES:${PN} = "octoprint-nanny-plugin"
