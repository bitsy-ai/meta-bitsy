SUMMARY = "Mainsail Core Packages"
DESCRIPTION = "Minimal set of packages required to run Mainsail, Moonraker, Klipper"
PR = "r0"

PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

RDEPENDS:${PN} = "\
    klipper \
    klipper-examples \
    klipper-klippy \
    klipper-scripts \
    moonraker \
    moonraker-scripts \
"
