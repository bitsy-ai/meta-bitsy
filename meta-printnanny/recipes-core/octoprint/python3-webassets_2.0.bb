
SUMMARY = "Merges, minifies and compresses Javascript and CSS files, supporting a variety of different filters, including YUI, jsmin, jspacker or CSS tidy. Also supports URL rewriting in CSS files."
HOMEPAGE = "https://github.com/miracle2k/webassets/"
AUTHOR = "Michael Elsdoerfer <michael@elsdoerfer.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=01c7e9175fd063ebb0a6304af80e9874"

SRC_URI[md5sum] = "25270b7a0452cf8a0af29898e0411c2e"
SRC_URI[sha256sum] = "167132337677c8cedc9705090f6d48da3fb262c8e0b2773b29f3352f050181cd"

PYPI_PACKAGE = "webassets"

RDEPENDS:${PN} = ""

inherit pypi setuptools3
