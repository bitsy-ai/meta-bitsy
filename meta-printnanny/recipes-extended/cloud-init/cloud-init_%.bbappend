CLOUDINIT_TELEMETRY_URL ??= "https://printnanny.ai/api/cloudinit"
CLOUDINIT_TELETRY_RETRY ??= "10"
SRC_URI:append = "\
    file://001-telemetry.cfg \
    file://002-ssh.cfg \
    file://003-runcmd.cfg \
    file://099-fake_cloud.cfg \
    file://printnanny-firstboot.sh \
    file://cloud.cfg \
"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

do_install:append(){
    install -d ${D}${sysconfdir}/cloud/cloud.cfg.d/
    install -d ${D}${sysconfdir}/cloud/cloud.cfg.d/
    install -d ${D}${bindir}
    install -m 0644 ${WORKDIR}/099-fake_cloud.cfg ${D}${sysconfdir}/cloud/cloud.cfg.d/099-fake_cloud.cfg
    install -m 0644 ${WORKDIR}/001-telemetry.cfg ${D}${sysconfdir}/cloud/cloud.cfg.d/001-telemetry.cfg
    install -m 0644 ${WORKDIR}/002-ssh.cfg ${D}${sysconfdir}/cloud/cloud.cfg.d/002-ssh.cfg
    install -m 0644 ${WORKDIR}/003-runcmd.cfg ${D}${sysconfdir}/cloud/cloud.cfg.d/003-runcmd.cfg
    install -m 0755 ${WORKDIR}/printnanny-firstboot.sh ${D}${bindir}/printnanny-firstboot
    install -m 0644 ${WORKDIR}/cloud.cfg ${D}${sysconfdir}/cloud/cloud.cfg
}
