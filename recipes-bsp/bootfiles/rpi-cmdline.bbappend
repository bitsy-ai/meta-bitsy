# https://github.com/bitsy-ai/printnanny-os/issues/15#issuecomment-1162805510
# update cma=64M kernel parameter, which is set by RASPBERRYPI_CAMERA_V2 / RASPBERRYPI_HD_CAMERA
CMDLINE:remove = "cma=64M"
CMDLINE:append = "cma=256M"

# Note also that Linux supports multiple consoles for output - but only one for input
# the last named (or default if none named) from the kernel commandline specifies which is used for input, and all are used for output
CMDLINE:append = "\
    systemd.show_status=1 \
    splash \
    plymouth.ignore-serial-consoles \
    console=tty1 \
    quiet \
"
