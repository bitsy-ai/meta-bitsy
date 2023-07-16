
SUMMARY = "Python client for Sentry (https://sentry.io)"
HOMEPAGE = "https://github.com/getsentry/sentry-python"
AUTHOR = "Sentry Team and Contributors <hello@sentry.io>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7fcb29c83dd48cb7b112d0dd81111a89"

SRC_URI = "https://files.pythonhosted.org/packages/87/87/373b4f6cb536ecc22db4fd58972a5e8fcd818a30d70262ab434372faac38/sentry-sdk-1.28.1.tar.gz"
SRC_URI[md5sum] = "3ca8964b8678eeb1ae920acd4de2b2c1"
SRC_URI[sha256sum] = "dcd88c68aa64dae715311b5ede6502fd684f70d00a7cd4858118f0ba3153a3ae"

S = "${WORKDIR}/sentry-sdk-1.28.1"

RDEPENDS:${PN} = "python3-certifi"

inherit setuptools3
