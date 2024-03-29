SUMMARY = "OctoPrint-FilamentManager"
HOMEPAGE = "https://github.com/OllisGit/OctoPrint-FilamentManager"
AUTHOR = "Sven Lohrmann <malnvenshorn@gmail.com>, Olli <ollisgit@gmail.com>"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=f75037314c7c090e595924cde362259d"

SRC_URI = "https://files.pythonhosted.org/packages/79/0c/d0eaa9380189a292121acab65199ac95b9209b45006ad8aa5266abd36943/backports.csv-1.0.7.tar.gz"
SRC_URI[sha256sum] = "1277dfff73130b2e106bf3dd347adb3c5f6c4340882289d88f31240da92cbd6d"

S = "${WORKDIR}/backports.csv-${PV}"

inherit setuptools3
