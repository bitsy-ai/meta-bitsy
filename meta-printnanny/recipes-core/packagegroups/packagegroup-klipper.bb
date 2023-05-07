SUMMARY = "Klipper"
DESCRIPTION = "Minimal set of packages required to run Klipper"
PR = "r0"

PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

RDEPENDS:${PN} = "\
    klipper \
    klipper-docs \
    klipper-examples \
    klipper-klippy \
    klipper-scripts \
"
