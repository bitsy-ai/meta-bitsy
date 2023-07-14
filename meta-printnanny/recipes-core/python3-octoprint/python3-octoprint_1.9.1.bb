
SUMMARY = "The snappy web interface for your 3D printer"
HOMEPAGE = "https://octoprint.org"
AUTHOR = "Gina Häußge <gina@octoprint.org>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=73f1eb20517c55bf9493b7dd6e480788"

SRC_URI = "https://files.pythonhosted.org/packages/5c/17/ae0d3ccb5197d72a06dd1aeddeb2e00c485c7e2173b3f16c2963755113f2/OctoPrint-1.9.1.tar.gz"
SRC_URI[sha256sum] = "570ee86aa626c8570edad065cfdf577d3134b5c64305d7534b376cc6c20b8c87"

S = "${WORKDIR}/OctoPrint-${PV}"

RDEPENDS:${PN} = "\
    python3-argon2-cffi \
    python3-blinker \
    python3-cachelib \
    python3-cchardet \
    python3-class-doc \
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
    python3-pydantic \
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

BBCLASSEXTEND = "native nativesdk"
