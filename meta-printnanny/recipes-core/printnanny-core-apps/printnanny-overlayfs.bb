inherit overlayfs overlayfs-etc

# systemd provides home.mount unit
OVERLAYFS_MOUNT_POINT[home] = "/data"
OVERLAYFS_WRITABLE_PATHS[home] = "/home"
OVERLAYFS_QA_SKIP[home] = "mount-configured"

# systemd provides var-lib-cloud.mount unit
OVERLAYFS_MOUNT_POINT[cloud-init] = "/data"
OVERLAYFS_WRITABLE_PATHS[cloud-init] = "/var/lib/cloud"
OVERLAYFS_QA_SKIP[cloud-init] = "mount-configured"

# /etc overlayfs is a special case, requiring a pre-init script that runs before systemd is initialized
OVERLAYFS_ETC_MOUNT_POINT = "/data"
OVERLAYFS_ETC_FSTYPE = "ext4"
OVERLAYFS_ETC_DEVICE = "/dev/mmcblk0p4"
OVERLAYFS_ETC_USE_ORIG_INIT_NAME = "0"