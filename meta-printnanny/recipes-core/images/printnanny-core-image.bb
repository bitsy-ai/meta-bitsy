LICENSE = "AGPLv3"
DESCRIPTION = "A console-only image with minimal Linux system functionality installed."

WKS_FILE = "sdimage-printnanny.wks"
IMAGE_FEATURES += "ssh-server-openssh"

inherit core-image
