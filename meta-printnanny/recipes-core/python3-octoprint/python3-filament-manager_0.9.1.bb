SUMMARY = "OctoPrint-FilamentManager"
HOMEPAGE = "https://github.com/OllisGit/OctoPrint-FilamentManager"
AUTHOR = "Sven Lohrmann <malnvenshorn@gmail.com>, Olli <ollisgit@gmail.com>"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4940c38d79bc5dca0630466d7c54b004"

SRC_URI = "https://github.com/bitsy-ai/OctoPrint-FilamentManager/zipball/fix-python-10-compat"
SRC_URI[sha256sum] = "9e3e14f0e60be2c76360cc2488517c973bfb23f773e630095673274490648b49"

S = "${WORKDIR}/bitsy-ai-OctoPrint-FilamentManager"

RDEPENDS:${PN} = "python3-backports.csv python3-uritools python3-sqlalchemy"

inherit setuptools3
