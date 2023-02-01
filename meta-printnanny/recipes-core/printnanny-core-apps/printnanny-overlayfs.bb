inherit overlayfs overlayfs-etc

# systemd provides home.mount unit
OVERLAYFS_MOUNT_POINT[home] = "/data"
OVERLAYFS_WRITABLE_PATHS[home] = "/home"
OVERLAYFS_QA_SKIP[home] = "mount-configured"

# systemd provides var-lib-cloud.mount unit
OVERLAYFS_MOUNT_POINT[cloud-init] = "/data"
OVERLAYFS_WRITABLE_PATHS[cloud-init] = "/var/lib/cloud"
OVERLAYFS_QA_SKIP[cloud-init] = "mount-configured"
