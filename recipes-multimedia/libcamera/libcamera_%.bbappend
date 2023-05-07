# meta-raspberrypi adds PACKAGECONFIG[raspberrypi] to augment the meta-oe libcamera recipe
# but provide our own libcamera recipe in meta-bitsy, which includes an EXTRA_OEMESON:raspberrypi4-64 override to achieve the same goal
# the following lines cancel out meta-raspberrypi libcamera_%.bbappend
PACKAGECONFIG[raspberrypi] = ""
