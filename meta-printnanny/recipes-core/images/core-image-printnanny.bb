include recipes-core/images/core-image-base.bb

COMPATIBLE_MACHINE = "^rpi$"

WKS_FILE = "sdimage-printnanny-rpi.wks"
IMAGE_FEATURES += "ssh-server-openssh"

#
# Customizations: meta-raspberrypi
# https://github.com/agherzan/meta-raspberrypi/blob/master/docs/extra-build-config.md
# v4l2 drivers
VIDEO_CAMERA = "1"
# RPI_USE_U_BOOT = "1"
# DISABLE_RPI_BOOT_LOGO = "1"
# INITRAMFS_IMAGE_BUNDLE = "1"
# imx219 dt overlay
RASPBERRYPI_CAMERA_V2 = "1"
ENABLE_SPI_BUS = "1"
ENABLE_I2C = "1"
ENABLE_UART = "1"
KERNEL_MODULE_AUTOLOAD:rpi += "i2c-dev i2c-bcm2708"

# https://github.com/agherzan/meta-raspberrypi/blob/master/docs/extra-build-config.md
IMAGE_FSTYPES = "ext4 ext4.xz rpi-sdimg"
# IMAGE_FSTYPES = "ext4 ext4.xz"
SDIMG_ROOTFS_TYPE = "ext4"

#
# Raspberry Pi Imager writes cloud-init cloud-config file to /boot/user-data
#
IMAGE_INSTALL:append = "cloud-init-systemd"

# example fields written by Raspberry Pi Imager v1.7.2 
#cloud-config
# hostname: pn-05-24
# manage_etc_hosts: true
# packages:
# - avahi-daemon
# apt:
#   conf: |
#     Acquire {
#       Check-Date "false";
#     };

# users:
# - name: pi
#   groups: users,adm,dialout,audio,netdev,video,plugdev,cdrom,games,input,gpio,spi,i2c,render,sudo
#   shell: /bin/bash
#   lock_passwd: false
#   passwd: <snipped>
#   ssh_authorized_keys:
#     - ssh-rsa <snipped>
#   sudo: ALL=(ALL) NOPASSWD:ALL


# timezone: America/Los_Angeles
# runcmd:
# - sed -i 's/^s*REGDOMAIN=S*/REGDOMAIN=US/' /etc/default/crda || true
# - rm -f /etc/xdg/autostart/piwiz.desktop
# - localectl set-x11-keymap "us" pc105
# - setupcon -k --force || true


#
# PrintNanny embedded tools
#
IMAGE_INSTALL:append = " printnanny-core"

#
# Janus Gateway
#
IMAGE_INSTALL:append = " janus-gateway"
PACKAGECONFIG:janus-gateway = "rest rest_api websockets unix_sockets plugin_videoroom plugin_echo datachannels"

#
# Gstreamer
#
LICENSE_FLAGS_ACCEPTED += "commercial_gstreamer1.0-omx"
IMAGE_INSTALL:append = " gstreamer1.0"

#
# nnstreamer
#
IMAGE_INSTALL:append = " nnstreamer"

#
# tensorflow-lite
#
IMAGE_INSTALL:append = " tensorflow-lite"

#
# sysupdate + init
#
IMAGE_INSTALL:append = " bitsy-sysupdate"

