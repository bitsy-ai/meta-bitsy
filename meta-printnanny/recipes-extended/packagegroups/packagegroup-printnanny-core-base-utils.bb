# based on poky packagegroup-core-base-utils, but with extraneous packages removed (e.g dhcpd, which conflicts with systemd-networkd dhcp stack)
SUMMARY = "Set of base utils for PrintNanny images"
DESCRIPTION = "Package group bringing in packages needed to provide much of the base utils type functionality found in busybox"

PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

VIRTUAL-RUNTIME_vim ?= "vim-tiny"

RDEPENDS:${PN} = "\
    base-passwd \
    bash \
    bind-utils \
    bzip2 \
    coreutils \
    cpio \
    diffutils \
    e2fsprogs \
    ed \
    file \
    findutils \
    gawk \
    grep \
    gzip \
    i2c-tools \
    inetutils \
    inetutils-ping \
    inetutils-telnet \
    inetutils-tftp \
    inetutils-traceroute \
    iproute2 \
    ${@bb.utils.contains("MACHINE_FEATURES", "keyboard", "kbd", "", d)} \
    kmod \
    less \
    ncurses-tools \
    net-tools \
    parted \
    patch \
    procps \
    psmisc \
    sed \
    shadow-base \
    tar \
    time \
    unzip \
    util-linux \
    ${VIRTUAL-RUNTIME_vim} \
    wget \
    which \
    xz \
    "
