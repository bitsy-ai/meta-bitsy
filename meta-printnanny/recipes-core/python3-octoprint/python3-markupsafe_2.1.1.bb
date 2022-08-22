
SUMMARY = "Safely add untrusted strings to HTML/XML markup."
HOMEPAGE = "https://palletsprojects.com/p/markupsafe/"
AUTHOR = "Armin Ronacher <armin.ronacher@active-4.com>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=ffeffa59c90c9c4a033c7574f8f3fb75"

SRC_URI = "https://files.pythonhosted.org/packages/1d/97/2288fe498044284f39ab8950703e88abbac2abbdf65524d576157af70556/MarkupSafe-2.1.1.tar.gz"
SRC_URI[md5sum] = "9809f9fdd98bc835b0c21aa8f79cbf30"
SRC_URI[sha256sum] = "7f91197cc9e48f989d12e4e6fbc46495c446636dfc81b9ccf50bb0ec74b91d4b"

S = "${WORKDIR}/MarkupSafe-2.1.1"

RDEPENDS:${PN} = ""

inherit setuptools3
