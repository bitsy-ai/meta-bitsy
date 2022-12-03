DESCRIPTION = "PrintNanny Settings Repo"
HOMEPAGE = "https://printnanny.ai/"
LICENSE = "AGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"


SRC_URI = "git://github.com/bitsy-ai/printnanny-settings.git;branch=main;protocol=https"
SRCREV = "c9ab22b48b7de712e170048a85afecab5c820f8d"
S = "${WORKDIR}/git"

PRINTNANNY_USER ?= "printnanny"
INSTALL_DIR ?= "/home/${PRINTNANNY_USER}/.config/printnanny/settings"

do_install(){
    install -d "${D}${INSTALL_DIR}"
    cp -r "${S}" "${D}${INSTALL_DIR}"
}
INSANE_SKIP:${PN} = "file-rdeps"
FILES:${PN} = "${INSTALL_DIR}"