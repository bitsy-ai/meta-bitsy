FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

LINUX_VERSION = "5.15.87"

SRC_URI += "\
    file://module-compress-xz.cfg \
"

SRCREV_machine = "750da7fe519e694cc140619cdfb72aabe13a06d3"
SRCREV_meta = "d57287729e229188e7d07ef0117fe927664e08cb"
