DESCRIPTION = "Init scripts for use on cloud images"
HOMEPAGE = "https://github.com/canonical/cloud-init"
SECTION = "devel/python"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c6dd79b6ec2130a3364f6fa9d6380408"

SRCREV = "93e85ad0d114b2aa7ff565a6132bd1323da3f868"
SRC_BRANCH = "23.1.x-bitsy"
# SRC_TAG = "bitsy/22.3"
SRC_URI = "git://github.com/bitsy-ai/cloud-init;branch=${SRC_BRANCH};protocol=https \
    file://0001-patch-read-udevdir-from-pkg_config.patch \
    file://0001-setup.py-check-for-install-anywhere-in-args.patch \
"

S = "${WORKDIR}/git"

export CI_RV_TAGS
export CI_RV_LONG
CI_RV_TAGS = "1"
CI_RV_LONG = "1"

SETUPTOOLS_INSTALL_ARGS:append = " ${@bb.utils.contains('DISTRO_FEATURES', 'sysvinit', '--init-system=sysvinit_deb', '', d)}"
SETUPTOOLS_INSTALL_ARGS:append = " ${@bb.utils.contains('DISTRO_FEATURES', 'systemd', '--init-system=systemd', '', d)}"
# --distro MUST not contain =, e.g. --distro=${DISTRO} is invalid
# this is because cloud-init's setup.py parses sys.argv at the module level to render data files
# https://github.com/canonical/cloud-init/blob/main/setup.py#L133
# --distro=bitsy -> "--distro" in sys.argv == False
# ---distro bitsy -> "--distro" in sys.argv == True
# ¯\_(ツ)_/¯
CLOUDINIT_DISTRO ?= "bitsy"
SETUPTOOLS_INSTALL_ARGS:append = " --distro ${CLOUDINIT_DISTRO}"

PV = "${@bb.parse.vars_from_file(d.getVar('FILE', False),d)[1] or '1.0'}-${SRC_BRANCH}+git${SRCPV}"

inherit pkgconfig
inherit setuptools3_legacy
# inherit update-rc.d
inherit systemd

DEPENDS:append = " ${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'systemd', '', d)}"

inherit python3native

DEPENDS += "\
    python3-pyyaml-native \
    python3-requests-native \
    python3-jinja2-native \
    python3-installer-native \
    python3-build-native \
"

RDEPENDS:${PN} = "\
    util-linux-blkid \
    python3 \
    python3-certifi \
    python3-jinja2 \
    python3-configobj \
    python3-requests \
    python3-jsonpatch \
    python3-jsonschema \
    python3-pyyaml \
    python3-oauthlib \
    python3-urllib3 \
    bash \
    netplan \
"
setuptools3_legacy_do_install:append(){
    make -C ${S} render-template PYTHON=${STAGING_BINDIR_NATIVE}/${PYTHON_PN}-native/${PYTHON_PN} CWD=${S} FILE=${S}/systemd/cloud-final.service.tmpl
    install -d ${D}${sysconfdir}/systemd/system/sshdgenkeys.service.d/
    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${S}/systemd/cloud-final.service ${D}${systemd_system_unitdir}/cloud-final.service
    install -m 0644 ${S}/systemd/disable-sshd-keygen-if-cloud-init-active.conf ${D}${sysconfdir}/systemd/system/sshdgenkeys.service.d/disable-sshd-keygen-if-cloud-init-active.conf
}

FILES:${PN} += "${bindir} ${datadir}/* ${sysconfdir} ${systemd_unitdir}/*"

SYSTEMD_SERVICE:${PN} = "cloud-config.service cloud-final.service cloud-init.service cloud-init-local.service cloud-init.target"
SYSTEMD_AUTO_ENABLE = "enable"
