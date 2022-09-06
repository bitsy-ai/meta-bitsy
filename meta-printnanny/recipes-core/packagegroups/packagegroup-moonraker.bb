SUMMARY = "Moonraker Core Packages"
DESCRIPTION = "Minimal set of packages required to run Moonraker"
PR = "r0"

PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

RDEPENDS:${PN} = "\
    packagegroup-klipper \
    moonraker \
    moonraker-scripts \
"
