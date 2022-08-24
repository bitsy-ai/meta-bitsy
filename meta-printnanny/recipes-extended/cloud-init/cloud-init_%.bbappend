CLOUDINIT_TELEMETRY_URL ??= "https://printnanny.ai/api/cloudinit"
CLOUDINIT_TELETRY_RETRY ??= "10"
SRC_URI:append = "\
    file://001-telemetry.cfg \
    file://002-ssh.cfg \
    file://003-runcmd.cfg \
    file://099-fake_cloud.cfg \
    file://cloud.cfg \
    file://cloud-init-local.service \
    file://cloud-init.service \
    file://cloud-config.service \
    file://cloud-init.target \
"
PREFERRED_VERSION_python3-pyyaml:forcevariable = "5.4.1"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

do_install:append(){
    install -d ${D}${sysconfdir}/cloud/cloud.cfg.d/
    install -d ${D}${sysconfdir}/cloud/cloud.cfg.d/
    install -d ${D}${systemd_system_unitdir}
    install -d ${D}${bindir}
    install -d ${D}/var/lib/cloud/scripts/per-boot/
    install -m 0644 ${WORKDIR}/099-fake_cloud.cfg ${D}${sysconfdir}/cloud/cloud.cfg.d/099-fake_cloud.cfg
    # install -m 0644 ${WORKDIR}/001-telemetry.cfg ${D}${sysconfdir}/cloud/cloud.cfg.d/001-telemetry.cfg
    install -m 0644 ${WORKDIR}/002-ssh.cfg ${D}${sysconfdir}/cloud/cloud.cfg.d/002-ssh.cfg
    install -m 0644 ${WORKDIR}/003-runcmd.cfg ${D}${sysconfdir}/cloud/cloud.cfg.d/003-runcmd.cfg
    install -m 0644 ${WORKDIR}/cloud.cfg ${D}${sysconfdir}/cloud/cloud.cfg
#     install -m 0644 ${WORKDIR}/cloud-init-local.service ${D}${systemd_system_unitdir}/cloud-init-local.service
#     install -m 0644 ${WORKDIR}/cloud-init.service ${D}${systemd_system_unitdir}/cloud-init.service
#     install -m 0644 ${WORKDIR}/cloud-config.service ${D}${systemd_system_unitdir}/cloud-config.service
#     install -m 0644 ${WORKDIR}/cloud-init.target ${D}${systemd_system_unitdir}/cloud-init.target
}
