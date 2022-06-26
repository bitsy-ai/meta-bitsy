
SUMMARY = "Provides additional information about your Pi in the UI"
HOMEPAGE = "https://github.com/OctoPrint/OctoPrint-PiSupport"
AUTHOR = "Gina Häußge <gina@octoprint.org>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=73f1eb20517c55bf9493b7dd6e480788"

SRC_URI = "https://files.pythonhosted.org/packages/56/e1/24d7dad04870dd0aaf0b134abec7d478ded6922090e6639aebcf5e2e87bb/OctoPrint-PiSupport-2022.6.13.tar.gz"
SRC_URI[md5sum] = "a13eb12cb295a5f0759b8fbb7a6cc27f"
SRC_URI[sha256sum] = "83e85886c465a363811c6acad2f7f4728c69ee6bd6c85a157a08b3e7c89a758e"

S = "${WORKDIR}/OctoPrint-PiSupport-2022.6.13"

RDEPENDS:${PN} = ""

inherit setuptools3
