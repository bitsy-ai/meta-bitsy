DESCRIPTION = "PrintNanny OS embedded tools"
HOMEPAGE = "https://printnanny.ai/"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=c3707f19243459c077cf33ceb57e8c37"
SRC_URI = "https://github.com/bitsy-ai/printnanny-cli/releases/download/v${PV}/printnanny-${BUILD_ARCH}-unknown-linux-gnu.tar.gz;name=cli \
    https://github.com/bitsy-ai/printnanny-cli/releases/download/v${PV}/printnanny-${BUILD_ARCH}-unknown-linux-gnu.tar.gz;name=wwwtemplates \
    file://printnanny-dash.service \
"

SRC_REV = "0.21.1"

inherit systemd

SYSTEMD_SERVICE:${PN} = "printnanny-dash.service"
SYSTEMD_AUTO_ENABLE = "enable"
