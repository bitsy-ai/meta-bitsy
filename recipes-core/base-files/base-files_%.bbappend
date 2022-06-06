do_install:append() {
    cat >> ${D}${sysconfdir}/fstab <<EOF
# Mount /home on data partition
/dev/mmcblk0p1  /boot   vfat    defaults,flush  0       0
/dev/mmcblk0p3  /data   ext4    defaults        0       0
/data/home      /home   none    bind            0       0
/data/home/root /root   none    bind            0       0 
EOF
}
