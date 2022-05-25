DESCRIPTION = "Init scripts for use on cloud images"
HOMEPAGE = "https://github.com/canonical/cloud-init"
SECTION = "devel/python"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c6dd79b6ec2130a3364f6fa9d6380408"

SRCREV = "f371a8dbd7a35f032a0003b06d718d5d525eb1ef"
SRC_URI = "git://github.com/canonical/cloud-init;branch=main;protocol=https \
    file://cloud-init-source-local-lsb-functions.patch \
    file://0001-setup.py-check-for-install-anywhere-in-args.patch \
    file://0001-setup.py-respect-udevdir-variable.patch \
"

S = "${WORKDIR}/git"

DISTUTILS_INSTALL_ARGS:append = " ${@bb.utils.contains('DISTRO_FEATURES', 'sysvinit', '--init-system=sysvinit_deb', '', d)}"
DISTUTILS_INSTALL_ARGS:append = " ${@bb.utils.contains('DISTRO_FEATURES', 'systemd', '--init-system=systemd', '', d)}"

do_install:append() {
    install -d ${D}${sysconfdir}/cloud/cloud.cfg.d/
    ln -s /boot/user-data ${D}${sysconfdir}/cloud/cloud.cfg.d/001_user-data.cfg
    ln -s /boot/network-config ${D}${sysconfdir}/cloud/cloud.cfg.d/002_network-config.cfg
}

inherit pkgconfig
inherit setuptools3_legacy
# inherit update-rc.d
inherit systemd

# setup.py calls "pkg-config systemd --variable=systemdsystemunitdir" and needs to find our systemd
DEPENDS += "systemd"

inherit python3native

PACKAGES += "${PN}-systemd"

FILES:${PN} += "${sysconfdir}/* \
                ${datadir}/*"

FILES:${PN}-systemd += "${systemd_unitdir}/*"
RDEPENDS:${PN}-systemd += " ${PN}"

DEPENDS += "python3-pyyaml-native \
            python3-requests-native \
            python3-jinja2-native \
           "

RDEPENDS:${PN} = "python3 \
                  python3-jinja2 \
                  python3-configobj \
                  python3-requests \
                  python3-jsonpatch \
                  python3-jsonschema \
                  python3-pyyaml \
                  python3-oauthlib \
                  bash \
                 "
