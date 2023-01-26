
SUMMARY = "Python client for Sentry (https://sentry.io)"
HOMEPAGE = "https://github.com/getsentry/sentry-python"
AUTHOR = "Sentry Team and Contributors <hello@sentry.io>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0c79f8d3c91fc847350efd28bfe0a341"

SRC_URI = "https://files.pythonhosted.org/packages/40/25/703701c8d6507eda6ab3d66edd5274950fbad31ad3318c79e59432ce73f5/sentry-sdk-1.9.5.tar.gz"
SRC_URI[md5sum] = "39e02c9a07029a12394447ef5443c65d"
SRC_URI[sha256sum] = "2d7ec7bc88ebbdf2c4b6b2650b3257893d386325a96c9b723adcd31033469b63"

S = "${WORKDIR}/sentry-sdk-1.9.5"

RDEPENDS:${PN} = "python3-certifi"

inherit setuptools3
