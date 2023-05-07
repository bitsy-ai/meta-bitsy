inherit packagegroup

SUMMARY = "Bitsy Linux System Packages"
DESCRIPTION = "Tweaks and system configurations for Bitsy Linux"

PR = "r0"
PACKAGE_ARCH = "${MACHINE_ARCH}"

PACKAGES = "\
    ${PN}-cloudinit \
    ${PN}-sys \
    ${PN} \
"

RDEPENDS:${PN}-sys = "\
    e2fsprogs-resize2fs \
    os-release \
    rsync \
    tzdata \
    strace \
"
RDEPENDS:${PN}-cloudinit = "\
    ${PN}-sys \
    cloud-init \
"
