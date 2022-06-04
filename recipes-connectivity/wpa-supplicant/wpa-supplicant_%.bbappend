SYSTEMD_AUTO_ENABLE = "enable"
do_install:append() {
    install -d ${D}/sbin
    ln -s -r ${D}/${sbindir}/wpa_supplicant ${D}/sbin/wpa_supplicant
}
