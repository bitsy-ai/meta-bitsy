
SUMMARY = "Module for decorators, wrappers and monkey patching."
HOMEPAGE = "https://github.com/GrahamDumpleton/wrapt"
AUTHOR = "Graham Dumpleton <Graham.Dumpleton@gmail.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7a4e084dbc322d180bc74f26cdf8236e"

SRC_URI = "https://files.pythonhosted.org/packages/11/eb/e06e77394d6cf09977d92bff310cb0392930c08a338f99af6066a5a98f92/wrapt-1.14.1.tar.gz"
SRC_URI[md5sum] = "6e7340264f038efdefcba707250c91c2"
SRC_URI[sha256sum] = "380a85cf89e0e69b7cfbe2ea9f765f004ff419f34194018a6827ac0e3edfed4d"

S = "${WORKDIR}/wrapt-1.14.1"

RDEPENDS_${PN} = ""

inherit setuptools3
