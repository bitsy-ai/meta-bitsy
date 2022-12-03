inherit overlayfs

OVERLAYFS_MOUNT_POINT[home] = "/data"
OVERLAYFS_WRITABLE_PATHS[home] = "/home"
OVERLAYFS_QA_SKIP[home] = "mount-configured"
