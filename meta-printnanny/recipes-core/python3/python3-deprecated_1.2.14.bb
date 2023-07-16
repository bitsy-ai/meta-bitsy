
SUMMARY = "Python @deprecated decorator to deprecate old python classes, functions or methods."
HOMEPAGE = "https://github.com/tantale/deprecated"
AUTHOR = "Laurent LAPORTE <tantale.solutions@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=44288e26f4896bdab14072d4fa35ff01"

SRC_URI = "https://files.pythonhosted.org/packages/92/14/1e41f504a246fc224d2ac264c227975427a85caf37c3979979edb9b1b232/Deprecated-1.2.14.tar.gz"
SRC_URI[md5sum] = "57e0ded86d04f22c65033dea230ad035"
SRC_URI[sha256sum] = "e5323eb936458dccc2582dc6f9c322c852a775a27065ff2b0c4970b9d53d01b3"

S = "${WORKDIR}/Deprecated-1.2.14"

RDEPENDS:${PN} = "python3-wrapt"

inherit setuptools3
