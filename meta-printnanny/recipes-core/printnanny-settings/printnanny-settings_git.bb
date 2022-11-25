DESCRIPTION = "PrintNanny Settings Repo"
HOMEPAGE = "https://printnanny.ai/"
LICENSE = "AGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"


SRC_URI = "git://github.com/bitsy-ai/printnanny-settings.git;branch=main;protocol=https"
SRCREV = "c9ab22b48b7de712e170048a85afecab5c820f8d"
S = "${WORKDIR}/git"

do_install(){
    install -d "${D}/var/lib/printnanny/settings/"
    cp -r "${S}" "${D}/var/lib/printnanny/settings/"
}
INSANE_SKIP:${PN} = "file-rdeps"
FILES:${PN} = "/var/lib/printnanny/settings/"
