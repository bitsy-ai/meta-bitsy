
SUMMARY = "The snappy web interface for your 3D printer"
HOMEPAGE = "https://octoprint.org"
AUTHOR = "Gina Häußge <gina@octoprint.org>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=73f1eb20517c55bf9493b7dd6e480788"

SRC_URI = "https://files.pythonhosted.org/packages/f7/05/49977b5c6d5079ff29482fb7558c817bacd45ec88d3efd533c35a2389b5d/OctoPrint-1.8.1.tar.gz"
SRC_URI[md5sum] = "f29cb1576b60a36b2544701a6c0aa9bd"
SRC_URI[sha256sum] = "d4109d854c6b1a4155af3360597b31aed28a1a20df146d77105060ed74d05f21"

S = "${WORKDIR}/OctoPrint-1.8.1"

RDEPENDS:${PN} = "python3-octoprint-filecheck python3-octoprint-firmwarecheck python3-octoprint-pisupport python3-cachelib python3-click python3-colorlog python3-emoji python3-feedparser python3-filetype python3-flask-assets python3-flask-babel python3-flask-login python3-flask python3-frozendict python3-future python3-markdown python3-netaddr python3-netifaces python3-pathvalidate python3-pkginfo python3-psutil python3-pylru python3-pyserial python3-pyyaml python3-requests python3-sarge python3-semantic-version python3-sentry-sdk python3-tornado python3-watchdog python3-websocket-client python3-werkzeug python3-wrapt python3-zeroconf python3-zipstream-ng python3-blinker python3-regex python3-unidecode python3-webassets"

inherit setuptools3_legacy
