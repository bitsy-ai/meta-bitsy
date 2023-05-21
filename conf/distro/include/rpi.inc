#
# Customizations: meta-raspberrypi
# https://github.com/agherzan/meta-raspberrypi/blob/master/docs/extra-build-config.md
# v4l2 drivers
VIDEO_CAMERA = "1"
RPI_USE_U_BOOT = "1"
ENABLE_SPI_BUS = "1"
ENABLE_I2C = "1"
ENABLE_UART = "1"
INITRAMFS_IMAGE_BUNDLE = "1"

GPU_MEM = "128"
GPU_MEM_256 = "128"
GPU_MEM_512 = "384"
GPU_MEM_1024 = "512"