require recipes-core/images/printnanny-core-image.bb

IMAGE_INSTALL += "\
    userland \
    packagegroup-octoprint\
"
