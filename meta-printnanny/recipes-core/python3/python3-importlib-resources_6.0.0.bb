
SUMMARY = "Read resources from Python packages"
HOMEPAGE = "https://github.com/python/importlib_resources"
AUTHOR = "Barry Warsaw <barry@python.org>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=141643e11c48898150daa83802dbc65f"

SRC_URI = "https://files.pythonhosted.org/packages/78/1f/65a619c18b0ecd55ac165c7ed119c846051991d01c2cfc0ff7818e4573f0/importlib_resources-6.0.0.tar.gz"
SRC_URI[md5sum] = "81b4070989c8ae661532543049ca528d"
SRC_URI[sha256sum] = "4cf94875a8368bd89531a756df9a9ebe1f150e0f885030b461237bc7f2d905f2"

S = "${WORKDIR}/importlib_resources-6.0.0"

DEPENDS += "${PYTHON_PN}-setuptools-scm-native"
RDEPENDS:${PN} = ""

inherit python_setuptools_build_meta
