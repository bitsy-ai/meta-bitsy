SRC_URI = "\
    file://001-rootfs1.conf \
    file://002-rootfs2.conf \
    file://003-data.conf \
"
ROOT1_PARTITION_UUID = "10d4e6f6-9d18-4bb8-b856-c2723d43791a"
ROOT2_PARTITION_UUID = "2589a229-912a-4ceb-9f7e-78eb536b894c"
DATA_PARTITION_UUID = "712aaf9a-d6a8-4f59-9738-e652decef229"

do_install(){
    install -d "${D}/${sysconfdir}/repart.d"
    install -m 0644 "${D}/${sysconfdir}/repart.d/001-rootfs1.conf"
    install -m 0644 "${D}/${sysconfdir}/repart.d/002-rootfs2.conf"
    install -m 0644 "${D}/${sysconfdir}/repart.d/003-data.conf"
}
