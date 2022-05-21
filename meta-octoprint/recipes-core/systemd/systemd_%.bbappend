FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "file://octoprint.service"

inherit systemd
SYSTEMD_SERVICE:${PN} = "octoprint.service"
SYSTEMD_AUTO_ENABLE = "enable"
