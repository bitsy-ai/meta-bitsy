SUMMARY = "Python3 uritools"
HOMEPAGE = "https://github.com/tkem/uritools"
AUTHOR = "Thomas Kemmer"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4940c38d79bc5dca0630466d7c54b004"

SRC_URI = "https://files.pythonhosted.org/packages/ab/1c/e9aa4a907806743298171510042447adc20cd5cf5b95436206a067e14496/uritools-2.2.0.tar.gz"
SRC_URI[sha256sum] = "80e8e23cafad54fd85811b5d9ba0fc595d933f5727c61c3937945eec09f99e2b"

S = "${WORKDIR}/uritools"

inherit setuptools3
