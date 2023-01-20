FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

LINUX_VERSION = "5.15.87"

SRC_URI += "\
    file://module-compress-xz.cfg \
"

SRCREV_machine = "d57287729e229188e7d07ef0117fe927664e08cb"
SRCREV_meta = "ed03f6685c020866c2f32c4b14c4f343792146d5"
