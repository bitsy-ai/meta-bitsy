DESCRIPTION = "Init scripts for use on cloud images"
HOMEPAGE = "https://github.com/canonical/cloud-init"
SECTION = "devel/python"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c6dd79b6ec2130a3364f6fa9d6380408"

SRCREV = "5bd7ceea845297f6fd6a58d649874b314f993e3e"
SRC_BRANCH = "bitsy-distro-22-3"
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

# setup.py calls "pkg-config systemd --variable=systemdsystemunitdir" and needs to find our systemd
DEPENDS += "systemd"

inherit python3native

PACKAGES += "${PN}-systemd"

FILES:${PN} += "${datadir}/* ${sysconfdir}"

FILES:${PN}-systemd += "${systemd_unitdir}/*"
RDEPENDS:${PN}-systemd += " ${PN}"


SYSTEMD_SERVICE:${PN} = "cloud-config.service cloud-final.service cloud-init.service cloud-init-local.service cloud-init.target"
SYSTEMD_AUTO_ENABLE = "enable"

# PREFERRED_VERSION_python3-pyyaml:forcevariable = "5.4.1"

DEPENDS += "\
    python3-pyyaml-native \
    python3-requests-native \
    python3-jinja2-native \
"

RDEPENDS:${PN} = "\
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
"
# overrides setuptools3_legacy bbclass to remove:
# build --build-base=${B} install --skip-build ${SETUPTOOLS_INSTALL_ARGS}
setuptools3_legacy_do_install() {
        cd ${SETUPTOOLS_SETUP_PATH}
        install -d ${D}${PYTHON_SITEPACKAGES_DIR}
        STAGING_INCDIR=${STAGING_INCDIR} \
        STAGING_LIBDIR=${STAGING_LIBDIR} \
        PYTHONPATH=${D}${PYTHON_SITEPACKAGES_DIR} \
        ${STAGING_BINDIR_NATIVE}/${PYTHON_PN}-native/${PYTHON_PN} setup.py \
        install ${SETUPTOOLS_INSTALL_ARGS} || \
        bbfatal_log "'${PYTHON_PN} setup.py install ${SETUPTOOLS_INSTALL_ARGS}' execution failed."

        # support filenames with *spaces*
        find ${D} -name "*.py" -exec grep -q ${D} {} \; \
                               -exec sed -i -e s:${D}::g {} \;

        for i in ${D}${bindir}/* ${D}${sbindir}/*; do
            if [ -f "$i" ]; then
                sed -i -e s:${PYTHON}:${USRBINPATH}/env\ ${SETUPTOOLS_PYTHON}:g $i
                sed -i -e s:${STAGING_BINDIR_NATIVE}:${bindir}:g $i
            fi
        done

        rm -f ${D}${PYTHON_SITEPACKAGES_DIR}/easy-install.pth

        #
        # FIXME: Bandaid against wrong datadir computation
        #
        if [ -e ${D}${datadir}/share ]; then
            mv -f ${D}${datadir}/share/* ${D}${datadir}/
            rmdir ${D}${datadir}/share
        fi
}

# cloud-init produces a drop-in config: sshd-keygen@.service.d/disable-sshd-keygen-if-cloud-init-active.conf
# move to sshdgenkeys.service.d/disable-sshd-keygen-if-cloud-init-active.conf
setuptools3_legacy_do_install:append(){
    install -d ${D}${sysconfdir}/systemd/system/sshdgenkeys.service.d/
    install -m 0644 ${D}${sysconfdir}/systemd/system/sshd-keygen@.service.d/disable-sshd-keygen-if-cloud-init-active.conf ${D}${sysconfdir}/systemd/system/sshdgenkeys.service.d/disable-sshd-keygen-if-cloud-init-active.conf
}
