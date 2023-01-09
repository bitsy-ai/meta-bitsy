SUMMARY = "OctoPrint-FilamentManager"
HOMEPAGE = "https://github.com/OllisGit/OctoPrint-FilamentManager"
AUTHOR = "Sven Lohrmann <malnvenshorn@gmail.com>, Olli <ollisgit@gmail.com>"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3e00ca6129dc8358315015204ab9fe15"

SRC_URI = "https://github.com/bitsy-ai/OctoPrint-FilamentManager/zipball/fix-python-10-compat/bitsy-ai-OctoPrint-FilamentManager-a8f964a.zip"
SRC_URI[sha256sum] = "4172af2873af1518b28d44adc9f0b9bccb4d9fcca435bc64b95cb68d1cc2f0b7"

S = "${WORKDIR}/bitsy-ai-OctoPrint-FilamentManager-a8f964a"

DEPENDS = "python3-octoprint-native python3-pip-native"
RDEPENDS:${PN} = "python3-pip python3-backports.csv python3-uritools python3-sqlalchemy python3-octoprint"

inherit setuptools3
