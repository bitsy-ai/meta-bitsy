CLOUDINIT_TELEMETRY_URL ??= "https://printnanny.ai/api/cloudinit"
CLOUDINIT_TELETRY_RETRY ??= "10"
SRC_URI:append = "\
    file://001-telemetry.cfg \
    file://002-ssh.cfg \
    file://003-runcmd.cfg \
    file://099-fake_cloud.cfg \
    file://cloud.cfg \
    file://cloud-config.service \
    file://cloud-init-local.service \
    file://cloud-init.service \
    file://cloud-init.target \
    file://cloud-final.service \
    file://fix-rpi-userdata.sh \
    file://scripts/per-boot/001-run-once-per-boot.sh \
    file://scripts/per-instance/001-run-once-per-instance.sh \
    file://scripts/per-once/001-run-once.sh \
"
FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

do_install:append(){
    install -d ${D}${sysconfdir}/cloud/cloud.cfg.d/
    install -d ${D}${sysconfdir}/cloud/cloud.cfg.d/
    install -d ${D}${systemd_system_unitdir}
    install -d ${D}${bindir}
    install -d ${D}/var/lib/cloud/scripts/per-boot/
    install -d ${D}/var/lib/cloud/scripts/per-instance/
    install -d ${D}/var/lib/cloud/scripts/per-once/

    install -m 0755 ${WORKDIR}/scripts/per-boot/001-run-once-per-boot.sh ${D}/var/lib/cloud/scripts/per-boot/001-run-once-per-boot.sh
    install -m 0755 ${WORKDIR}/scripts/per-instance/001-run-once-per-instance.sh ${D}/var/lib/cloud/scripts/per-instance/001-run-once-per-instance.sh
    install -m 0755 ${WORKDIR}/scripts/per-once/001-run-once.sh ${D}/var/lib/cloud/scripts/per-once/001-run-once.sh

    install -m 0644 ${WORKDIR}/099-fake_cloud.cfg ${D}${sysconfdir}/cloud/cloud.cfg.d/099-fake_cloud.cfg
    install -m 0644 ${WORKDIR}/099-fake_cloud.cfg ${D}${sysconfdir}/cloud/cloud.cfg.d/099-fake_cloud.cfg
    install -m 0644 ${WORKDIR}/002-ssh.cfg ${D}${sysconfdir}/cloud/cloud.cfg.d/002-ssh.cfg
    install -m 0644 ${WORKDIR}/003-runcmd.cfg ${D}${sysconfdir}/cloud/cloud.cfg.d/003-runcmd.cfg
    install -m 0644 ${WORKDIR}/cloud.cfg ${D}${sysconfdir}/cloud/cloud.cfg
    install -m 0644 ${WORKDIR}/cloud-init-local.service ${D}${systemd_system_unitdir}/cloud-init-local.service
    install -m 0644 ${WORKDIR}/cloud-init.service ${D}${systemd_system_unitdir}/cloud-init.service
    install -m 0644 ${WORKDIR}/cloud-final.service ${D}${systemd_system_unitdir}/cloud-final.service
    install -m 0644 ${WORKDIR}/cloud-config.service ${D}${systemd_system_unitdir}/cloud-config.service
    install -m 0644 ${WORKDIR}/cloud-init.target ${D}${systemd_system_unitdir}/cloud-init.target
    install -m 0755 ${WORKDIR}/fix-rpi-userdata.sh ${D}${bindir}/cloud-init-fix-rpi-userdata
}

FILES:${PN} += "${bindir}/cloud-init-fix-rpi-userdata"
