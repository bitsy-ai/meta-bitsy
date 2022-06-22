LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"

SRC_URI = "\
    file://001-rootfs1.conf \
    file://002-rootfs2.conf \
    file://003-data.conf \
"
ROOT1_PARTITION_UUID = "10d4e6f6-9d18-4bb8-b856-c2723d43791a"
ROOT2_PARTITION_UUID = "2589a229-912a-4ceb-9f7e-78eb536b894c"
DATA_PARTITION_UUID = "712aaf9a-d6a8-4f59-9738-e652decef229"

do_install(){
    install -d "${D}${sysconfdir}/repart.d"
    install -m 0644 "${WORKDIR}/001-rootfs1.conf" "${D}${sysconfdir}/repart.d/001-rootfs1.conf"
    install -m 0644 "${WORKDIR}/002-rootfs2.conf" "${D}${sysconfdir}/repart.d/002-rootfs2.conf"
    install -m 0644 "${WORKDIR}/003-data.conf" "${D}${sysconfdir}/repart.d/003-data.conf"
}

FILES:${PN} = "${sysconfdir}/repart.d/*"

DEPENDS = "systemd"
