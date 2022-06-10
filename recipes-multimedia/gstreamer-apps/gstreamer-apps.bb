DESCRIPTION = "Gstreamer apps, scripts, and systemd services"
HOMEPAGE = "https://github.com/bitsy-ai/meta-bitsy"
LICENSE = "AGPLv3+"

LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"
SRC_URI = " \
    file://gstreamer-rtph264pay.service \
    file://gstreamer-rtph264pay.sh \
"
inherit systemd

do_install() {
    install -d "${D}${systemd_system_unitdir}"
    install -m 0644 "${WORKDIR}/gstreamer-rtph264pay.service" "${D}${systemd_system_unitdir}/gstreamer-rtph264pay.service"
    install -m 0755 "${WORKDIR}/gstreamer-rtph264pay.sh" "${D}${bindir}/gstreamer-rtph264pay"
}

SYSTEMD_SERVICE:${PN} = "gstreamer-rtph264pay.service"
LICENSE_FLAGS_ACCEPTED += "commercial_gstreamer1.0-omx"
RDEPENDS:${PN} = "\
    gstreamer1.0 \
"
FILES:${PN} = "${systemd_unitdir}/* ${bindir}/*"
