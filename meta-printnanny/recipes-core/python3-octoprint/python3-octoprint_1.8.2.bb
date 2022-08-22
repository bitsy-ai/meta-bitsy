
SUMMARY = "The snappy web interface for your 3D printer"
HOMEPAGE = "https://octoprint.org"
AUTHOR = "Gina Häußge <gina@octoprint.org>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=73f1eb20517c55bf9493b7dd6e480788"

SRC_URI = "https://files.pythonhosted.org/packages/12/ea/15167b941255171a2e59d3515e9fae5ee51840d3f823b151e453ee2a4ccc/OctoPrint-1.8.2.tar.gz"
SRC_URI[md5sum] = "b4ab25a4a81cffba4ac37fec07f19949"
SRC_URI[sha256sum] = "6b13246940720213c5bfab4ce04c7914dc13e59f89b1ca646743e0370ce0a002"

S = "${WORKDIR}/OctoPrint-1.8.2"

RDEPENDS:${PN} = "python3-octoprint-filecheck python3-octoprint-firmwarecheck python3-octoprint-pisupport python3-cachelib python3-click python3-colorlog python3-emoji python3-feedparser python3-filetype python3-flask-assets python3-flask-babel python3-flask-login python3-flask python3-frozendict python3-future python3-markdown python3-netaddr python3-netifaces python3-pathvalidate python3-pkginfo python3-psutil python3-pylru python3-pyserial python3-pyyaml python3-requests python3-sarge python3-semantic-version python3-sentry-sdk python3-tornado python3-watchdog python3-websocket-client python3-werkzeug python3-wrapt python3-zeroconf python3-zipstream-ng python3-blinker python3-regex python3-unidecode"

inherit setuptools3_legacy
