inherit overlayfs

LICENSE = "AGPL-3.0-or-later"

OVERLAYFS_MOUNT_POINT[printnanny_etcd] = "/data"
OVERLAYFS_WRITABLE_PATHS[printnanny_etcd] = "/etc/printnanny.d"
OVERLAYFS_QA_SKIP[printnanny_etcd] = "mount-configured"

OVERLAYFS_MOUNT_POINT[printnanny_state] = "/data"
OVERLAYFS_WRITABLE_PATHS[printnanny_state] = "/var/lib/printnanny"
OVERLAYFS_QA_SKIP[printnanny_state] = "mount-configured"
