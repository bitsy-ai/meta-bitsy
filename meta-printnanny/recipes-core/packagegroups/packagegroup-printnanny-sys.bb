SUMMARY = "PrintNanny Linux System"
DESCRIPTION = "Tweaks and system configurations for PrintNanny Linux"

PR = "r0"
PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

RDEPENDS:${PN} = "\
    cloud-init \
    cloud-init-systemd \
    cloud-init-cfgs \
    dhcpcd \
    printnanny-tweaks \
    openssh \
"
