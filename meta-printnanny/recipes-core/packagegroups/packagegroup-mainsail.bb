SUMMARY = "Mainsail Core Packages"
DESCRIPTION = "Minimal set of packages required to run Mainsail, Moonraker, Klipper"
PR = "r0"

PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

RDEPENDS:${PN} = "\
    python3-pip \
    klipper \
"
