
SUMMARY = "The snappy web interface for your 3D printer"
HOMEPAGE = "https://octoprint.org"
AUTHOR = "Gina Häußge <gina@octoprint.org>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=73f1eb20517c55bf9493b7dd6e480788"

SRC_BRANCH ?= "1.8.1"
SRC_REV = "260a1aef11432c421246019e25b6b744abbaed60"
SRC_URI = "\
    git://github.com/OctoPrint/OctoPrint.git;rev=${SRC_REV};branch=${SRC_BRANCH};protocol=https; \
    file://0001-shim-startPrintNannyWebRTC-if-available.patch \
"

S = "${WORKDIR}/git"

RDEPENDS:${PN} = "python3-octoprint-filecheck python3-octoprint-firmwarecheck python3-octoprint-pisupport python3-cachelib python3-click python3-colorlog python3-emoji python3-feedparser python3-filetype python3-flask-assets python3-flask-babel python3-flask-login python3-flask python3-frozendict python3-future python3-markdown python3-netaddr python3-netifaces python3-pathvalidate python3-pkginfo python3-psutil python3-pylru python3-pyserial python3-pyyaml python3-requests python3-sarge python3-semantic-version python3-sentry-sdk python3-tornado python3-watchdog python3-websocket-client python3-werkzeug python3-wrapt python3-zeroconf python3-zipstream-ng python3-blinker python3-regex python3-unidecode python3-webassets"

inherit setuptools3_legacy
