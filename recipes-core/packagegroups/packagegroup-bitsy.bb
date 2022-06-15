
SUMMARY = "Bitsy Linux System Packages"
DESCRIPTION = "Tweaks and system configurations for Bitsy Linux"

PR = "r0"
PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

PACKAGES = "\
    ${PN}-cloudinit \
    ${PN}-overlayfs \
    ${PN}-sys \
    ${PN} \
"

RDEPENDS:${PN}-sys = "\
    bitsy-tweaks \
    e2fsprogs-resize2fs \
    dhcpcd \
    ntp \
    os-release \
    rsync \
    tzdata \
"
RDEPENDS:${PN}-cloudinit = "\
    ${PN}-sys \
    cloud-init \
    ${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'cloud-init-systemd', '', d)} \
    netplan \
"
