
SUMMARY = "Infer file type and MIME type of any file/buffer. No external dependencies."
HOMEPAGE = "https://github.com/h2non/filetype.py"
AUTHOR = "Tomas Aparicio <tomas@aparicio.me>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cc0e8af5f14a75ce53b7b9db0f4bd91e"

SRC_URI = "https://files.pythonhosted.org/packages/bb/29/745f7d30d47fe0f251d3ad3dc2978a23141917661998763bebb6da007eb1/filetype-1.2.0.tar.gz"
SRC_URI[md5sum] = "915c437718ad93c2cd347eb5aa465af1"
SRC_URI[sha256sum] = "66b56cd6474bf41d8c54660347d37afcc3f7d1970648de365c102ef77548aadb"

S = "${WORKDIR}/filetype-1.2.0"

RDEPENDS:${PN} = ""

inherit setuptools3
