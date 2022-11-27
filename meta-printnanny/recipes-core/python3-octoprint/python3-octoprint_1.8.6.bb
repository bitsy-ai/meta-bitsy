
SUMMARY = "The snappy web interface for your 3D printer"
HOMEPAGE = "https://octoprint.org"
AUTHOR = "Gina Häußge <gina@octoprint.org>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=73f1eb20517c55bf9493b7dd6e480788"

SRC_URI = "https://files.pythonhosted.org/packages/fc/91/f0c0afa62c7b7ad8a0fb5345b177643086cff1e4d766c9fe7d2cc103f9d6/OctoPrint-1.8.6.tar.gz"
SRC_URI[md5sum] = "2045bf557130f10007564cc9b88e3e96"
SRC_URI[sha256sum] = "3a8cc0d3d68f76bda077619b76a6133673d21bebccae1cb8f55a7b8ae3f1632c"

S = "${WORKDIR}/OctoPrint-1.8.6"

RDEPENDS:${PN} = "\
    python3-argon2-cffi \
    python3-blinker \
    python3-cachelib \
    python3-cchardet \
    python3-click \
    python3-colorlog \
    python3-emoji \
    python3-feedparser \
    python3-filetype \
    python3-flask \
    python3-flask-assets \
    python3-flask-babel \
    python3-flask-limiter \
    python3-flask-login \
    python3-frozendict \
    python3-future \
    python3-markdown \
    python3-netaddr \
    python3-netifaces \
    python3-octoprint-filecheck \
    python3-octoprint-firmwarecheck \
    python3-octoprint-pisupport \
    python3-passlib \
    python3-pathvalidate \
    python3-pkginfo \
    python3-psutil \
    python3-pylru \
    python3-pyserial \
    python3-pyyaml \
    python3-regex \
    python3-requests \
    python3-sarge \
    python3-semantic-version \
    python3-sentry-sdk \
    python3-tornado \
    python3-unidecode \
    python3-watchdog \
    python3-webassets \
    python3-websocket-client \
    python3-werkzeug \
    python3-wrapt \
    python3-zeroconf \
    python3-zipstream-ng"

inherit setuptools3_legacy
