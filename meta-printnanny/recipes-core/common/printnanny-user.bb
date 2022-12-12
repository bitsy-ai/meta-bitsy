inherit useradd
# You must set USERADD_PACKAGES when you inherit useradd. This
# lists which output packages will include the user/group
# creation code.
USERADD_PACKAGES = "${PN}"
LICENSE = "AGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"

R = "r1"
# You must also set USERADD_PARAM and/or GROUPADD_PARAM when
# you inherit useradd.
GROUPADD_PARAM:${PN} = "i2c; netdev; video; spi; render; gpio; moonraker-admin; printnanny-admin"
USERADD_PARAM:${PN} = "-r -U -s /bin/bash -m -d /home/printnanny -G adm,dialout,i2c,gpio,input,netdev,plugdev,render,spi,sudo,video,moonraker-admin,printnanny-admin printnanny"

# https://lists.yoctoproject.org/g/yocto/message/55381
ALLOW_EMPTY:${PN}="1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
