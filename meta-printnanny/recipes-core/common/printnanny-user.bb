inherit useradd
# You must set USERADD_PACKAGES when you inherit useradd. This
# lists which output packages will include the user/group
# creation code.
USERADD_PACKAGES = "${PN}"

# You must also set USERADD_PARAM and/or GROUPADD_PARAM when
# you inherit useradd.
GROUPADD_PARAM:printnanny-user = "i2c; netdev; video; spi"
USERADD_PARAM:printnanny-user = "-r -U -s /bin/bash -m -d /home/printnanny -G adm,dialout,i2c,input,netdev,plugdev,spi,sudo,video printnanny"

# https://lists.yoctoproject.org/g/yocto/message/55381
ALLOW_EMPTY:${PN}="1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
