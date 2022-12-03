SUMMARY = "PrintNanny Utils"
DESCRIPTION = "Non-essential PrintNanny Utilities package"
PR = "r0"

PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

RDEPENDS:${PN} = "\
    htop \
    v4l-utils \
    nano \
    lsof \
"
