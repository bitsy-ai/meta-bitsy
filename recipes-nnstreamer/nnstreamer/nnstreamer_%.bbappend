FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = "\
    file://0001-Do-not-include-user-site-packages-in-Yocto-build-sys.patch \
"
