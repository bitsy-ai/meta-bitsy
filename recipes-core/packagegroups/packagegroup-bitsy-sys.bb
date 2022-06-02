SUMMARY = "Bitsy Linux System Packages"
DESCRIPTION = "Tweaks and system configurations for Bitsy Linux"

PR = "r0"
PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

RDEPENDS:${PN} = "\
    avahi-daemon \
    avahi-autoipd \
    avahi-utils \
    cloud-init \
    cloud-init-systemd \
    dhcpcd \
    netplan \
    ntp \
    os-release \
    bitsy-tweaks \
    packagegroup-core-ssh-openssh \
"
