LICENSE = "AGPLv3"

inherit pypi setuptools3

LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"
SRC_URI[sha256sum] = "d4109d854c6b1a4155af3360597b31aed28a1a20df146d77105060ed74d05f21"
PYPI_PACKAGE = "OctoPrint"

# SYSTEMD_SERVICE:${PN} = "octoprint.service"
# SYSTEMD_AUTO_ENABLE = "enable"

RDEPENDS:${PN}:append = " python3-pip"
