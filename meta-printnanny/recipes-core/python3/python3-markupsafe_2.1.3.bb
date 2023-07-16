
SUMMARY = "Safely add untrusted strings to HTML/XML markup."
HOMEPAGE = "https://palletsprojects.com/p/markupsafe/"
AUTHOR = " <>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=ffeffa59c90c9c4a033c7574f8f3fb75"

SRC_URI = "https://files.pythonhosted.org/packages/6d/7c/59a3248f411813f8ccba92a55feaac4bf360d29e2ff05ee7d8e1ef2d7dbf/MarkupSafe-2.1.3.tar.gz"
SRC_URI[md5sum] = "ca33f119bd0551ce15837f58bb180214"
SRC_URI[sha256sum] = "af598ed32d6ae86f1b747b82783958b1a4ab8f617b06fe68795c7f026abbdcad"

S = "${WORKDIR}/MarkupSafe-2.1.3"

RDEPENDS:${PN} = ""

inherit setuptools3
