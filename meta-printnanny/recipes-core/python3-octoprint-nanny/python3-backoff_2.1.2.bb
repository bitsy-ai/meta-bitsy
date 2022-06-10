
SUMMARY = "Function decoration for backoff and retry"
HOMEPAGE = "https://github.com/litl/backoff"
AUTHOR = "Bob Green <rgreen@aquent.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=11aa62344867e52ff1061aeb075eaa42"

SRC_URI = "https://files.pythonhosted.org/packages/3b/22/53182ff2977aa653cb61f30592cbfb5d3e0764368c8eaa8ec096e6899b7a/backoff-2.1.2.tar.gz"
SRC_URI[md5sum] = "f1be3b587c8fb50b7142eb659836d819"
SRC_URI[sha256sum] = "407f1bc0f22723648a8880821b935ce5df8475cf04f7b6b5017ae264d30f6069"

S = "${WORKDIR}/backoff-2.1.2"

RDEPENDS:${PN} = ""

inherit setuptools3
