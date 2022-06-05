# required to use both overlayfs-etc and package-management features
# see note: https://git.yoctoproject.org/poky/plain/meta/classes/overlayfs-etc.bbclass
CMDLINE:append = "\
    init=/sbin/preinit \
"
