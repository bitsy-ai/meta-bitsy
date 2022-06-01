DESCRIPTION = "Customizable cfgs package to be used with cloud-init"
HOMEPAGE = "https://github.com/canonical/cloud-init"
SECTION = "devel/python"
LICENSE = "AGPLv3+"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"

CLOUDINIT_TELEMETRY_URL ??= "https://printnanny.ai/api/cloudinit"
CLOUDINIT_TELETRY_RETRY ??= "10"
SRC_URI:append = "\
    file://001-telemetry.cfg \
    file://002-ssh.cfg \
    file://003-runcmd.cfg \
    file://cloud.cfg \
    file://printnanny-firstboot.sh \
"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

do_install:append(){
    install -d ${D}${sysconfdir}/cloud/cloud.cfg.d/
    install -d ${D}${sysconfdir}/cloud/cloud.cfg.d/
    install -d ${D}${bindir}
    ln -s /boot/user-data ${D}${sysconfdir}/cloud/cloud.cfg.d/001_user-data.cfg
    ln -s /boot/network-config ${D}${sysconfdir}/cloud/cloud.cfg.d/002_network-config.cfg
    touch "${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/meta-data"
    install -m 0644 ${WORKDIR}/cloud.cfg ${D}${sysconfdir}/cloud/cloud.cfg
    install -m 0644 ${WORKDIR}/001-telemetry.cfg ${D}${sysconfdir}/cloud/cloud.cfg.d/001-telemetry.cfg
    install -m 0644 ${WORKDIR}/002-ssh.cfg ${D}${sysconfdir}/cloud/cloud.cfg.d/002-ssh.cfg
    install -m 0644 ${WORKDIR}/003-runcmd.cfg ${D}${sysconfdir}/cloud/cloud.cfg.d/003-runcmd.cfg
    install -m 0755 ${WORKDIR}/printnanny-firstboot.sh ${D}${bindir}/printnanny-firstboot
}
