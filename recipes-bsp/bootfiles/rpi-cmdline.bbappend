# https://github.com/bitsy-ai/printnanny-os/issues/15#issuecomment-1162805510
# remove cma=64M kernel parameter, which is set by RASPBERRYPI_CAMERA_V2 / RASPBERRYPI_HD_CAMERA

CMDLINE:remove = "cma=64M"
