RPIFW_DATE = "20230106"

RPIFW_SRC_URI ?= "https://archive.raspberrypi.com/debian/pool/main/r/raspberrypi-firmware/raspberrypi-firmware_1.${RPIFW_DATE}.orig.tar.xz"
RPIFW_S ?= "${WORKDIR}/raspberrypi-firmware-1.${RPIFW_DATE}"

SRC_URI = "${RPIFW_SRC_URI}"
SRC_URI[sha256sum] = "b3c016b869303999b6e51b9f98c4cb2db37b0f8d15bd079328b7db134833e74d"
PV = "${RPIFW_DATE}"
