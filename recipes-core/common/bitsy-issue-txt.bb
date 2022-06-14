inherit image-buildinfo

DESCRIPTION = "Generates issue.txt from image-buildinfo"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"

COMPATIBLE_MACHINE = "^rpi$"

IMAGE_BUILDINFO_FILE = "${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/issue.txt"
BUILD_ID = "${@time.strftime('%Y-%m-%d %H:%M:%S',time.localtime())}"
IMAGE_BUILDINFO_VARS:append = " DATETIME DISTRO_NAME IMAGE_BASENAME MACHINE TUNE_PKGARCH" 
IMAGE_BUILDINFO_VARS:append = " MACHINE_FEATURES DISTRO_FEATURES COMMON_FEATURES IMAGE_FEATURES"
IMAGE_BUILDINFO_VARS:append = " TUNE_FEATURES TARGET_FPU"

do_deploy[depends] = "rpi-bootfiles:do_deploy"
do_deploy[dirs] += "${DEPLOYDIR}/${BOOTFILES_DIR_NAME}"
addtask deploy before do_build after do_install
