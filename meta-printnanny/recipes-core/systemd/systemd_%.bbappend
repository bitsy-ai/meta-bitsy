PACKAGECONFIG:append = "openssl"
FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "\
    file://050-wait-for-network-override.conf \
"

do_install:append(){
    install -d "${D}${systemd_system_unitdir}/systemd-networkd-wait-online.d/"
    install -m 0644 "${WORKDIR}/050-wait-for-network-override.conf" "${D}${systemd_system_unitdir}/systemd-networkd-wait-online.d/050-override.conf"
}
