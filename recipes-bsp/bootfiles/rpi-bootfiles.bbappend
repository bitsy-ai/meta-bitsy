# The name of the deploy directory for raspberry pi boot files.
# This variable is referred to by recipes fetching / generating the files.
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI:append = "\
    file://vendor-data.yaml \
"

# meta-data is required by cloud-init's NoCloud datasource
# vendor-data is optional, but allows us to specify a default user and other vendor data
do_deploy:append() {
    touch ${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/meta-data
    install -m 0644 ${WORKDIR}/vendor-data.yaml ${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/vendor-data
}
