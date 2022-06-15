SUMMARY = "PrintNanny SWUpdate Packages"
DESCRIPTION = "Minimal set of packages required to run SWUpdate utils"

PR = "r0"

PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

RDEPENDS:${PN} = "\
    libubootenv \
	swupdate \
	swupdate-lua \
	swupdate-progress \
	swupdate-www \
	swupdate-tools \
"
