
SUMMARY = "More routines for operating on iterables, beyond itertools"
HOMEPAGE = ""
AUTHOR = " <Erik Rose <erikrose@grinchcentral.com>>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3396ea30f9d21389d7857719816f83b5"

SRC_URI = "https://files.pythonhosted.org/packages/2e/d0/bea165535891bd1dcb5152263603e902c0ec1f4c9a2e152cc4adff6b3a38/more-itertools-9.1.0.tar.gz"
SRC_URI[md5sum] = "5361460cc76a8f4a84e402d3a5d47ade"
SRC_URI[sha256sum] = "cabaa341ad0389ea83c17a94566a53ae4c9d07349861ecb14dc6d0345cf9ac5d"

S = "${WORKDIR}/more-itertools-9.1.0"

RDEPENDS:${PN} = ""

inherit python_flit_core
