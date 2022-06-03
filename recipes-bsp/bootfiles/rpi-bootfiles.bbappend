# The name of the deploy directory for raspberry pi boot files.
# This variable is referred to by recipes fetching / generating the files.
do_deploy:append() {
    touch ${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/meta-data
}
