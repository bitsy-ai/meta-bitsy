require recipes-core/images/printnanny-core-image.bb
LICENSE = "AGPLv3"
# persist logs to sd card
VOLATILE_LOG_DIR = "no"
# disable splash
IMAGE_FEATURES:remove = "splash"
# enable serial
ENABLE_UART = "1"
# send boot messages over serial console
CMDLINE:append = "console=serial0,115200"
# send boot messaegs to tty1
CMDLINE:append = "console=tty1"
