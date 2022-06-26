
SUMMARY = "Python client for Sentry (https://sentry.io)"
HOMEPAGE = "https://github.com/getsentry/sentry-python"
AUTHOR = "Sentry Team and Contributors <hello@sentry.io>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0c79f8d3c91fc847350efd28bfe0a341"

SRC_URI = "https://files.pythonhosted.org/packages/a0/ff/bcbcea86a61228572fb04b678bbf656470d72363936288a9cfe0a92c9890/sentry-sdk-1.6.0.tar.gz"
SRC_URI[md5sum] = "31fd4ab37e5dcc02dc042bbec74ecb37"
SRC_URI[sha256sum] = "b82ad57306d5546713f15d5d70daea0408cf7f998c7566db16e0e6257e51e561"

S = "${WORKDIR}/sentry-sdk-1.6.0"

RDEPENDS:${PN} = "python3-urllib3 python3-certifi"

inherit setuptools3
