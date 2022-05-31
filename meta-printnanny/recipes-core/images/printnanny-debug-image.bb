require recipes-core/images/printnanny-core-image.bb
LICENSE = "AGPLv3"
# persist logs to sd card
VOLATILE_LOG_DIR = "no"
# disable splash
# send boot messaegs to tty1
CMDLINE:append = "console=tty1"
# install empty-root-password, allow-empty-password, allow-root-login, post-install-logging
EXTRA_IMAGE_FEATURES = "debug-tweaks bash-completion-pkgs tools-debug"
