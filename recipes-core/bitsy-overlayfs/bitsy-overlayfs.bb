inherit overlayfs

OVERLAYFS_MOUNT_POINT[home] = "/data"
OVERLAYFS_WRITABLE_PATHS[home] = "/home"

# TODO, maybe not needed if cloudinit always sets password
# Does not work as-is and mounting entire /etc as overlay is problematic without pre-init script, see overlayfs-etc.bbclass
# [6.725786] overlayfs: '/etc/passwd' not a directory
# OVERLAYFS_MOUNT_POINT[passwd] = "/data"
# OVERLAYFS_WRITABLE_PATHS[passwd] = "/etc/passwd"


OVERLAYFS_MOUNT_POINT[netplan] = "/data"
OVERLAYFS_WRITABLE_PATHS[netplan] = "/etc/netplan"
