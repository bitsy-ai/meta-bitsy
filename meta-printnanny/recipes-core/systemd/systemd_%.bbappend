PACKAGECONFIG:append = "openssl"
FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "\
    file://050-wait-for-network-override.conf \
"

do_install:append(){
    install -d "${D}${sysconfdir}/systemd/system/systemd-networkd-wait-online.service.d/"
    install -m 0644 "${WORKDIR}/050-wait-for-network-override.conf" "${D}${sysconfdir}/systemd/system/systemd-networkd-wait-online.service.d/050-override.conf"
}
