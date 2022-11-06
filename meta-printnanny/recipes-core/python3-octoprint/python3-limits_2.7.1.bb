
SUMMARY = "Rate limiting utilities"
HOMEPAGE = "https://limits.readthedocs.org"
AUTHOR = "Ali-Akber Saifee <ali@indydevs.org>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=9a60a272513852526711e0e1032f0832"

SRC_URI = "https://files.pythonhosted.org/packages/d9/a4/4b65bd055ab7a04e7e1804058e42b17478963c2f5a69bdd04e49fd87367b/limits-2.7.1.tar.gz"
SRC_URI[md5sum] = "438189b2127cacf95af0ca1a3ae11fd6"
SRC_URI[sha256sum] = "cdb58ef59e90d582589a0f5a8dd36ee00995342679109d64df92b060507d8f03"

S = "${WORKDIR}/limits-2.7.1"

RDEPENDS:${PN} = "python3-deprecated python3-setuptools python3-packaging python3-typing-extensions"

inherit setuptools3
