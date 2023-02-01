inherit overlayfs

OVERLAYFS_MOUNT_POINT[cloud-init] = "/data"
OVERLAYFS_WRITABLE_PATHS[cloud-init] = "/var/lib/cloud"
OVERLAYFS_QA_SKIP[cloud-init] = "mount-configured"
