
SUMMARY = "Rate limiting utilities"
HOMEPAGE = "https://limits.readthedocs.org"
AUTHOR = "Ali-Akber Saifee <ali@indydevs.org>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=9a60a272513852526711e0e1032f0832"

SRC_URI = "https://files.pythonhosted.org/packages/b4/95/b08b833e2a386d08df7a5e5b8b2115bb0a930320088fc4efdf9746367a1d/limits-2.7.0.tar.gz"
SRC_URI[md5sum] = "c6a3f9903a6c73cd639c358a033bd52e"
SRC_URI[sha256sum] = "847a78b24a47e822a8f8713028a1340db44003763ab1cb90e798ccf462880355"

S = "${WORKDIR}/limits-2.7.0"

RDEPENDS:${PN} = "python3-deprecated python3-setuptools python3-packaging python3-typing-extensions"

inherit setuptools3
BBCLASSEXTEND = "native nativesdk"
