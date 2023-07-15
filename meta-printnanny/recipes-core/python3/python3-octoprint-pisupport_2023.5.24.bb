
SUMMARY = "Provides additional information about your Pi in the UI"
HOMEPAGE = "https://github.com/OctoPrint/OctoPrint-PiSupport"
AUTHOR = "Gina Häußge <gina@octoprint.org>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=73f1eb20517c55bf9493b7dd6e480788"

SRC_URI = "https://files.pythonhosted.org/packages/3a/cc/c0caa3ee0b7141c8381d2b56b1a92df235e780b98fe62f4f8041ac70a631/OctoPrint-PiSupport-2023.5.24.tar.gz"
SRC_URI[md5sum] = "398f6ebbdabcb6191391ce654357837d"
SRC_URI[sha256sum] = "338a875bf06a52d454a4a75c062733bd204638f0633648c869cd1268462f7667"

S = "${WORKDIR}/OctoPrint-PiSupport-2023.5.24"

RDEPENDS:${PN} = ""

inherit setuptools3
