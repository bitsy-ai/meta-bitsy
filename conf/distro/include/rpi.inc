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
RASPBERRYPI_CAMERA_V3 = "1"
RASPBERRYPI_HD_CAMERA = "1"
ENABLE_SPI_BUS = "1"
ENABLE_I2C = "1"
ENABLE_UART = "1"
KERNEL_MODULE_AUTOLOAD:rpi += "i2c-dev i2c-bcm2708"
INITRAMFS_IMAGE_BUNDLE = "1"

GPU_MEM = "96"
GPU_MEM_256 = "128"
GPU_MEM_512 = "128"
GPU_MEM_1024 = "256"
