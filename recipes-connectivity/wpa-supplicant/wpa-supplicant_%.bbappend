SYSTEMD_AUTO_ENABLE = "enable"
# netplan hard-codes /sbin/wpa_supplicant
# https://github.com/canonical/netplan/blob/main/src/networkd.c#L1003
do_install:append(){
    ln -s /usr/sbin/wpa_supplicant /sbin/wpa_supplicant
}
