do_install:append() {
    cat >> ${IMAGE_ROOTFS}/etc/fstab <<EOF
# Mount /home on data partition
/data/home /home ext4 defaults 0 0 
EOF
}
