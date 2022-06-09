
SUMMARY = "Provides additional information about your Pi in the UI"
HOMEPAGE = "https://github.com/OctoPrint/OctoPrint-PiSupport"
AUTHOR = "Gina Häußge <gina@octoprint.org>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=73f1eb20517c55bf9493b7dd6e480788"

SRC_URI = "https://files.pythonhosted.org/packages/b5/a2/fa22e71d51cccd41c4e06a5d8d8c8c6a016956ea22c1586b8eeec0d7b910/OctoPrint-PiSupport-2022.3.28.tar.gz"
SRC_URI[md5sum] = "104d253614729e4f172f4bdce178da45"
SRC_URI[sha256sum] = "bfd420398e04a93653b9876ac0561b09f6bebcf65c4e24088fbe2515bd67df87"

S = "${WORKDIR}/OctoPrint-PiSupport-2022.3.28"

RDEPENDS:${PN} = ""

inherit setuptools3
