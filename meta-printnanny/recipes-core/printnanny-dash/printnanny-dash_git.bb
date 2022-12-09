# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# inherit npm

# how to get printnanny-dash could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/printnanny-dash/0.4.0"
SRC_URI = "git://git@github.com/bitsy-ai/printnanny-os-dash.git;protocol=ssh;nobranch=1;branch=main"
SRCREV = "d9993172f69ce5f2e8b633c33434ba38bcf98002"
S = "${WORKDIR}/git"

LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=579cfef54f8a556e96900d454125e4d1 \
"

SUMMARY = "PrintNanny OS Dashboard"
HOMEPAGE = "https://github.com/bitsy-ai/printnanny-dash"
LICENSE = "LICENSE"

INSTALL_DIR = "/var/www/printnanny-dash"

DEPENDS:prepend = "nodejs-native nodejs-oe-cache-native "
PACKAGE_DEBUG_SPLIT_STYLE = "debug-without-src"

do_install(){
    install -d ${D}${INSTALL_DIR}
    export PSEUDO_DEBUG="nfoPcvdDyerpswikVx"
    cd ${S} && npm install && npm run build --logs-max=0
    cp --preserve=mode,timestamps -R ${S}/dist/* ${D}${INSTALL_DIR}
}

RDEPENDS:${PN} = "nginx"

FILES:${PN} = "${INSTALL_DIR}/*"

# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include printnanny-dash-${PV}.inc
include printnanny-dash.inc
