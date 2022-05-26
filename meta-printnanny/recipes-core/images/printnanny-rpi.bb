include recipes-core/images/printnanny-base.bb

COMPATIBLE_MACHINE = "^(rpi|raspberrypi)"
#
# Customizations: meta-raspberrypi
# https://github.com/agherzan/meta-raspberrypi/blob/master/docs/extra-build-config.md
# v4l2 drivers
VIDEO_CAMERA = "1"
RPI_USE_U_BOOT = "1"
# DISABLE_RPI_BOOT_LOGO = "1"
# INITRAMFS_IMAGE_BUNDLE = "1"
# imx219 dt overlay
RASPBERRYPI_CAMERA_V2 = "1"
ENABLE_SPI_BUS = "1"
ENABLE_I2C = "1"
ENABLE_UART = "1"
KERNEL_MODULE_AUTOLOAD:rpi += "i2c-dev i2c-bcm2708"
