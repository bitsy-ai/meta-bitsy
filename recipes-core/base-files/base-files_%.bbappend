do_install:append() {
    cat >> ${D}${sysconfdir}/fstab <<EOF
# Mount /home on data partition
/data/home /home ext4 defaults 0 0 
EOF
}
