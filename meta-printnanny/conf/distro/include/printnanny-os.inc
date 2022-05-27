require conf/distro/poky.conf
require conf/distro/include/rpi.inc

DISTRO = "printnanny"
DISTRO_NAME = "PrintNanny OS (3D Print Assistant)"
DISTRO_VERSION = "0.1.0"
DISTRO_CODENAME = "alpha"
HOSTOS_VERSION = "${DISTRO_VERSION}"
SDK_VENDOR = "-printnannysdk"
SDK_VERSION = "${@d.getVar('DISTRO_VERSION').replace('snapshot-${METADATA_REVISION}', 'snapshot')}"
SDK_VERSION[vardepvalue] = "${SDK_VERSION}"

MAINTAINER = "Leigh Johnson <leigh@printnanny.ai>"

# strip out unneeded features
POKY_DEFAULT_DISTRO_FEATURES:remove = "wayland"
DISTRO_FEATURES_DEFAULT:remove = "x11"
DISTRO_FEATURES:remove = "pam"
DISTRO_FEATURES:append = " systemd"

TARGET_VENDOR = "-printnanny"
LOCALCONF_VERSION = "2"
# load PrintNanny image classes
# https://docs.yoctoproject.org/4.0.1/ref-manual/variables.html?highlight=image_classes#term-IMAGE_CLASSES

INIT_MANAGER = "systemd"
DISTRO_EXTRA_RDEPENDS = "packagegroup-printnanny-core"
