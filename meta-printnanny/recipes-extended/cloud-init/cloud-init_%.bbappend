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

# The name of the deploy directory for raspberry pi boot files.
# This variable is referred to by recipes fetching / generating the files.
BOOTFILES_DIR_NAME ?= "bootfiles"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

do_install:append(){
    install -d ${D}${sysconfdir}/cloud/cloud.cfg.d/
    install -d ${D}${sysconfdir}/cloud/cloud.cfg.d/
    install -d ${D}${bindir}
    install -d ${D}/var/lib/cloud/seed/
    ln -s /boot/user-data ${D}/var/lib/cloud/seed/user-data
    ln -s /boot/network-config ${D}/var/lib/cloud/seed/network-config
    touch ${D}/var/lib/cloud/seed/meta-data
    install -m 0644 ${WORKDIR}/cloud.cfg ${D}${sysconfdir}/cloud/cloud.cfg
    install -m 0644 ${WORKDIR}/001-telemetry.cfg ${D}${sysconfdir}/cloud/cloud.cfg.d/001-telemetry.cfg
    install -m 0644 ${WORKDIR}/002-ssh.cfg ${D}${sysconfdir}/cloud/cloud.cfg.d/002-ssh.cfg
    install -m 0644 ${WORKDIR}/003-runcmd.cfg ${D}${sysconfdir}/cloud/cloud.cfg.d/003-runcmd.cfg
    install -m 0755 ${WORKDIR}/printnanny-firstboot.sh ${D}${bindir}/printnanny-firstboot
}
