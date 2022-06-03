SUMMARY = "Bitsy Linux System Packages"
DESCRIPTION = "Tweaks and system configurations for Bitsy Linux"

PR = "r0"
PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

RDEPENDS:${PN} = "\
    avahi-autoipd \
    avahi-daemon \
    avahi-utils \
    bitsy-tweaks \
    cloud-init \
    cloud-init-systemd \
    dhcpcd \
    netplan \
    ntp \
    os-release \
    packagegroup-core-ssh-openssh \
"
