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

# inherit image-buildinfo
# BUILD_ID = "${@time.strftime('%Y-%m-%d %H:%M:%S',time.localtime())}"
# IMAGE_BUILDINFO_VARS:append = " DATETIME DISTRO_NAME IMAGE_BASENAME MACHINE TUNE_PKGARCH" 
# IMAGE_BUILDINFO_VARS:append = " MACHINE_FEATURES DISTRO_FEATURES COMMON_FEATURES IMAGE_FEATURES"
# IMAGE_BUILDINFO_VARS:append = " TUNE_FEATURES TARGET_FPU"
# IMAGE_BUILDINFO_VARS:append = " APP_URI_PREFIX APP_URI_BRANCH"

# python do_issue_txt() {
#     print('Writing buildinfo to ${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/issue.txt')
#     with open(d.expand('${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/issue.txt'), 'w') as build:
#         build.writelines((
#             '''-----------------------
# Build Configuration:  |
# -----------------------
# ''',
#         buildinfo_target(d),
#         '''
# -----------------------
# Layer Revisions:      |
# -----------------------
# ''',
#         get_layer_revs(d),
#         '''
# '''
#     ))
# }

# addtask issue_txt after do_deploy before do_build

