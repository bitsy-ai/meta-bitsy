FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

LINUX_VERSION = "5.15.87"

SRC_URI += "\
    file://module-compress-xz.cfg \
"

SRCREV_machine = "da4c8e0ffe7a868b989211045657d600be3046a1"
SRCREV_meta = "ed03f6685c020866c2f32c4b14c4f343792146d5"
