DESCRIPTION = "systemd-sysupdate configuration files"
HOMEPAGE = "https://bitsy.ai"
LICENSE = "AGPLv3"

SRC_URI = "file://repart.d/ \
"

inherit systemd

do_install() {
    install -m 0755 ${S}/repart.d/* ${WORKDIR}/etc/repart.d/*
}

FILES_${PN} = "/etc/repart.d/* "
