
SUMMARY = "Python client for Sentry (https://sentry.io)"
HOMEPAGE = "https://github.com/getsentry/sentry-python"
AUTHOR = "Sentry Team and Contributors <hello@sentry.io>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0c79f8d3c91fc847350efd28bfe0a341"

SRC_URI = "https://files.pythonhosted.org/packages/43/37/89598a56119199b69a3c4b13e2ce1b57ff69f68313ed393016086d6b487b/sentry-sdk-1.10.1.tar.gz"
SRC_URI[md5sum] = "7f31bd0d6d968c711f8b1d928836eaaa"
SRC_URI[sha256sum] = "105faf7bd7b7fa25653404619ee261527266b14103fe1389e0ce077bd23a9691"

S = "${WORKDIR}/sentry-sdk-1.10.1"

RDEPENDS:${PN} = "python3-certifi"

inherit setuptools3
