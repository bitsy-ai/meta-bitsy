DESCRIPTION = "Customizable cfgs package to be used with cloud-init"
HOMEPAGE = "https://github.com/canonical/cloud-init"
SECTION = "devel/python"
LICENSE = "AGPLv3+"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"

CLOUDINIT_TELEMETRY_URL ??= "https://printnanny.ai/api/cloudinit"
CLOUDINIT_TELETRY_RETRY ??= "10"
SRC_URI = "\
    file://001-telemetry.cfg \
    file://002-ssh.cfg \
    file://003-runcmd.cfg \
    file://printnanny-firstboot.sh
"

S = "${WORKDIR}"
# TODO
# how to parameterize this recipe? I think BB variable -> environment variable -> do_install() renders jinja2 template makes sense
# but given this requires installing python3native + native jinja + packaging j2cli, do this whenever a 2nd 3rd etc config variation is needed
# maybe bitbake offers another mechanism to template files easily?
# inherit python3native
# DEPENDS = "python3-jinja2-native"

do_install(){
    install -d ${D}${sysconfdir}/cloud/cloud.cfg.d/
    ln -s /boot/user-data ${D}${sysconfdir}/cloud/cloud.cfg.d/001_user-data.cfg
    ln -s /boot/network-config ${D}${sysconfdir}/cloud/cloud.cfg.d/002_network-config.cfg
    install -m 0644 ${S}/001-telemetry.cfg ${D}${sysconfdir}/cloud/cloud.cfg.d/001-telemetry.cfg
    install -m 0644 ${S}/002-ssh.cfg ${D}${sysconfdir}/cloud/cloud.cfg.d/002-ssh.cfg
    install -m 0644 ${S}/003-runcmd.cfg ${D}${sysconfdir}/cloud/cloud.cfg.d/003-runcmd.cfg
    install -m 0755 ${S}/printnanny-firstboot ${D}${bindir}/printnanny-firstboot
}

FILES:${PN} = "${sysconfdir}"