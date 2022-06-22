# modify a release image with helpful debugging tweaks


# debug-tweaks installs allow-empty-password, empty-root-password, post-install-logging features
# https://docs.yoctoproject.org/ref-manual/features.html?highlight=debug%20tweaks#image-features
IMAGE_FEATURES:append = "\
    debug-tweaks \
"

# remove quiet from kernel parameters
CMDLINE:remove = "\
    quiet \
"
