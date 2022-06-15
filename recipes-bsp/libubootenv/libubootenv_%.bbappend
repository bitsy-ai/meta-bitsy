FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI:append:class-target = " file://${MACHINE}/fw_env.config"

do_install:append:class-target() {
	install -d ${D}${sysconfdir}
	install -m 644 ${WORKDIR}/${MACHINE}/fw_env.config ${D}${sysconfdir}/fw_env.config
}

FILES:${PN}:append:class-target = " ${sysconfdir}"
