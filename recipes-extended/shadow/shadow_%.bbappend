FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://login.defs"

do_install:append() {
	install -m 644 ${WORKDIR}/login.defs ${D}${sysconfdir}/login.defs
}

FILES:${PN} += "${sysconfdir}/login.defs"