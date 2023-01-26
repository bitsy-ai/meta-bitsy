
SUMMARY = "Function decoration for backoff and retry"
HOMEPAGE = "https://github.com/litl/backoff"
AUTHOR = "Bob Green <rgreen@aquent.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=11aa62344867e52ff1061aeb075eaa42"

SRC_URI = "https://files.pythonhosted.org/packages/47/d7/5bbeb12c44d7c4f2fb5b56abce497eb5ed9f34d85701de869acedd602619/backoff-2.2.1.tar.gz"
SRC_URI[md5sum] = "b91bb50f190d683e166b9cdf13252493"
SRC_URI[sha256sum] = "03f829f5bb1923180821643f8753b0502c3b682293992485b0eef2807afa5cba"

S = "${WORKDIR}/backoff-2.2.1"

RDEPENDS:${PN} = ""

inherit setuptools3
