# see meta-skeleton/recipes-skeleton/useradd/useradd-example.bb
inherit useradd

SUMMARY = "PrintNanny Users/Groups"
DESCRIPTION = "This recipe is an example of useradd.bbclass"

LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"

# You must set USERADD_PACKAGES when you inherit useradd. This
# lists which output packages will include the user/group
# creation code.
USERADD_PACKAGES = "${PN}"

# You must also set USERADD_PARAM and/or GROUPADD_PARAM when
# you inherit useradd.
GROUPADD_PARAM:${PN} = "i2c; netdev; video; spi"
USERADD_PARAM:${PN} = "-r -U -s /bin/bash -m -d /home/printnanny -G adm,dialout,i2c,input,netdev,plugdev,spi,sudo,video printnanny"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
