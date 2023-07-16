
SUMMARY = "A modern and easy to use streamable zip file generator"
HOMEPAGE = "https://github.com/pR0Ps/zipstream-ng"
AUTHOR = " <>"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3000208d539ec061b899bce1d9ce9404"

SRC_URI = "https://files.pythonhosted.org/packages/5d/48/8927c36fb7521068c895e39585cf3be2c756fff5b38caaaa8e94e8d564f4/zipstream-ng-1.6.0.tar.gz"
SRC_URI[md5sum] = "2471b33fc2f46682bc9d5b197b98350b"
SRC_URI[sha256sum] = "149dc502c0fcfb62718e89cb7e46380bd1c3409bb8479ed64ae779388b5321ac"

S = "${WORKDIR}/zipstream-ng-1.6.0"

RDEPENDS:${PN} = ""

inherit setuptools3
