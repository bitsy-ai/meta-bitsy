
SUMMARY = "Rate limiting utilities"
HOMEPAGE = "https://limits.readthedocs.org"
AUTHOR = "Ali-Akber Saifee <ali@indydevs.org>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2455d5e574bc0fc489411ca45766ac78"

SRC_URI = "https://files.pythonhosted.org/packages/f1/78/15330c57130f1a3228865ff555382a301ef5c254cc1fc7153ae5a827787d/limits-3.5.0.tar.gz"
SRC_URI[md5sum] = "feedbc077763e4f0bb8e97c71dcd2176"
SRC_URI[sha256sum] = "b728c9ab3c6163997b1d11a51d252d951efd13f0d248ea2403383952498f8a22"

S = "${WORKDIR}/limits-3.5.0"

RDEPENDS:${PN} = "python3-deprecated python3-importlib-resources python3-setuptools python3-packaging python3-typing-extensions"

inherit setuptools3
