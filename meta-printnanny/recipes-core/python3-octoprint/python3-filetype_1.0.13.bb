
SUMMARY = "Infer file type and MIME type of any file/buffer. No external dependencies."
HOMEPAGE = "https://github.com/h2non/filetype.py"
AUTHOR = "Tomas Aparicio <tomas@aparicio.me>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cc0e8af5f14a75ce53b7b9db0f4bd91e"

SRC_URI = "https://files.pythonhosted.org/packages/43/79/28fd02a2ba297252ef4e165c1c91c7bc11008a7eb0dee5efc77ad2d2db8f/filetype-1.0.13.tar.gz"
SRC_URI[md5sum] = "d8d28ea2e68ebc70d91c2b3d71be96f3"
SRC_URI[sha256sum] = "6a104762fe93d755c962aa96cb3d930a48f91a0761047126c5eead2153e33b03"

S = "${WORKDIR}/filetype-1.0.13"

RDEPENDS:${PN} = ""

inherit setuptools3
