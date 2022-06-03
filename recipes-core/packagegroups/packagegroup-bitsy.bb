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
    avahi-autoipd \
    avahi-daemon \
    bitsy-tweaks \
    ntp \
    os-release \
    dhcpcd \
    wpa_supplicant \
"
RDEPENDS:${PN}-cloudinit = "\
    ${PN}-sys \
    cloud-init \
    ${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'cloud-init-systemd', '', d)} \
    netplan \
"
