
SUMMARY = "A simple immutable dictionary"
HOMEPAGE = "https://github.com/Marco-Sulla/python-frozendict"
AUTHOR = "Marco Sulla <marcosullaroma@gmail.com>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3000208d539ec061b899bce1d9ce9404"

SRC_URI = "git://git@github.com/Marco-Sulla/python-frozendict.git;protocol=https"
SRCREV = "4b0bc553a0e1190539024e2986f2fba7dd0ec09a"

# https://github.com/Marco-Sulla/python-frozendict/issues/67#issuecomment-1292335062
inherit setuptools3
setuptools3_do_compile() {
        cd ${SETUPTOOLS_SETUP_PATH}
        NO_FETCH_BUILD=1 \
        STAGING_INCDIR=${STAGING_INCDIR} \
        STAGING_LIBDIR=${STAGING_LIBDIR} \
        ${STAGING_BINDIR_NATIVE}/${PYTHON_PN}-native/${PYTHON_PN} setup.py \
        py bdist_wheel --verbose --dist-dir ${PEP517_WHEEL_PATH} ${SETUPTOOLS_BUILD_ARGS} || \
        bbfatal_log "'${PYTHON_PN} setup.py py bdist_wheel ${SETUPTOOLS_BUILD_ARGS}' execution failed."
}

S = "${WORKDIR}/git"

RDEPENDS:${PN} = ""

BBCLASSEXTEND = "native nativesdk"
