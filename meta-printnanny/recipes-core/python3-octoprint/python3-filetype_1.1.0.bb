
SUMMARY = "Infer file type and MIME type of any file/buffer. No external dependencies."
HOMEPAGE = "https://github.com/h2non/filetype.py"
AUTHOR = "Tomas Aparicio <tomas@aparicio.me>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cc0e8af5f14a75ce53b7b9db0f4bd91e"

SRC_URI = "https://files.pythonhosted.org/packages/ba/42/53be9807e47b164a172721ad7960acdc7ec6ad45216c9962f5e933b0e314/filetype-1.1.0.tar.gz"
SRC_URI[md5sum] = "91c814f65f14047e34fdc7a3b8c98a58"
SRC_URI[sha256sum] = "afe4a00029601f66d239b72688065cc7c219dec1c927994f90b825e9e53d8f93"

S = "${WORKDIR}/filetype-1.1.0"

RDEPENDS_${PN} = ""

inherit setuptools3
