SUMMARY = "PrintNanny Core Packages"
DESCRIPTION = "Minimal set of packages required to run PrintNanny OS Apps"
PR = "r0"

PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

RDEPENDS:${PN} = "\
    printnanny-apps \
    ${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'printnanny-apps-systemd', '', d)} \
    janus-gateway \
    nginx \
	swupdate \
	swupdate-progress \
	swupdate-www \
	swupdate-tools \
    etc-overlay \
    home-overlay \
"
