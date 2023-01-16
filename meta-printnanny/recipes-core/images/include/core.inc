SRC_URI += "\
  file://sw-description \
"

VARIANT_NAME ??= "PrintNanny OS Core"
VARIANT_ID ??="core"

WKS_FILE = "sdimage-printnanny.wks"

IMAGE_FEATURES = "\
  bash-completion-pkgs \
  package-management \
  ssh-server-openssh \
  splash \
"
SPLASH = "psplash-printnanny"

# packagegroup-base (via packagegroup-base-extended) is required to pull in MACHINE_EXTRA_RRECOMMENDS
# https://docs.yoctoproject.org/ref-manual/variables.html#term-MACHINE_EXTRA_RRECOMMENDS

# entire userland is installed here JUST for vcgencmd
# there's almost certainly a better way to handle this: https://github.com/raspberrypi/userland/blob/master/host_applications/linux/apps/gencmd/CMakeLists.txt
CORE_IMAGE_EXTRA_INSTALL:raspberrypi4-64 = "userland"

IMAGE_INSTALL = "\
  os-release \
  packagegroup-base-extended \
  packagegroup-core-base-utils \
  packagegroup-core-boot \
  kernel-devicetree \
  kernel-image \
  kernel-modules \
  packagegroup-bitsy \
  packagegroup-bitsy-cloudinit \
  packagegroup-core-full-cmdline \
  packagegroup-printnanny-core \
  packagegroup-printnanny-cv \
  packagegroup-printnanny-utils \
  packagegroup-printnanny-extras \
  packagegroup-printnanny-syncthing \
  packagegroup-printnanny-tailscale \
  packagegroup-printnanny-webrtc \
  packagegroup-swupdate \
  ${CORE_IMAGE_EXTRA_INSTALL} \
"

# COMBINED_FEATURES is the set of features enabled in MACHINE_FEATURES and DISTRO_FEATURES
# COMBINED_FEATURES referenced in packagegroup-base to install base system packages
MACHINE_FEATURES += "bluetooth wifi keyboard"
inherit core-image
