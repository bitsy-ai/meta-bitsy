SUMMARY = "PrintNanny Extra Packages"
DESCRIPTION = "Extra packages for PrintNanny OS"
PR = "r2"

PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

RDEPENDS:${PN} = "\
    sdwire \
    libcamera-apps \
"
