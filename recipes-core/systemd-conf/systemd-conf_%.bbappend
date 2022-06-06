FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += " \
    file://eth.network \
    file://en.network \
    file://wlan.network \
    file://systemd-networkd-wait-online.service \
"

RDEPENDS:${PN}:append = " wpa-supplicant"

FILES:${PN} += " \
    ${systemd_system_unitdir}/systemd-networkd-wait-online.service.d \
    ${sysconfdir}/systemd/network/eth.network \
    ${sysconfdir}/systemd/network/en.network \
    ${sysconfdir}/systemd/network/wlan.network \
"

do_install:append() {
    install -d ${D}${sysconfdir}/systemd/network
    install -d ${D}${systemd_system_unitdir}/systemd-networkd-wait-online.service.d
    install -m 0644 ${WORKDIR}/eth.network ${D}${sysconfdir}/systemd/network
    install -m 0644 ${WORKDIR}/en.network ${D}${sysconfdir}/systemd/network
    install -m 0644 ${WORKDIR}/wlan.network ${D}${sysconfdir}/systemd/network
    install -m 0644 ${WORKDIR}/systemd-networkd-wait-online.service ${D}${systemd_system_unitdir}/systemd-networkd-wait-online.service.d/override.conf
}
