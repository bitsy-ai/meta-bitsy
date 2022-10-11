SUMMARY = "PrintNanny Cloud Packages"

DESCRIPTION = "Minimal set of packages required to communicate with PrintNanny Cloud"

PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

RDEPENDS:${PN} = "printnanny-apps"
