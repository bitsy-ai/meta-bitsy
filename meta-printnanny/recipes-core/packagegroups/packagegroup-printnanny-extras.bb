SUMMARY = "PrintNanny Extra Packages"
DESCRIPTION = "Non-essential packages for PrintNanny OS"
PR = "r1"

PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

RDEPENDS:${PN} = "\
    nano \
"
