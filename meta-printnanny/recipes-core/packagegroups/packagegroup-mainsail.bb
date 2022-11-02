SUMMARY = "Mainsail Core Packages"
DESCRIPTION = "Minimal set of packages required to run Mainsail"
PR = "r0"

PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

RDEPENDS:${PN} = "\
    packagegroup-klipper \
    packagegroup-moonraker \
    mainsail \
"
