SUMMARY = "Gstreamer Daemon 1.0"
DESCRIPTION = "GStreamer framework for controlling audio and video streaming using TCP connection messages"
HOMEPAGE = "https://developer.ridgerun.com/wiki/index.php?title=Gstd-1.0"
SECTION = "multimedia"
LICENSE = "LGPLv2.1"

LIC_FILES_CHKSUM = "file://COPYING;md5=c71b653a0f608a58cdc5693ae57126bc"

DEPENDS = "gstreamer1.0 gstreamer1.0-plugins-base gstreamer1.0-plugins-bad json-glib libdaemon jansson libsoup-2.4 libedit"

SRCBRANCH ?= "master"
SRCREV = "a011affa67f240cbc7aaff5b00fdfd6124bdaece"
SRC_URI = "git://github.com/RidgeRun/gstd-1.x.git;protocol=https;branch=${SRCBRANCH} \
           file://gstd-yocto-disable-gtk-doc.patch \
           "

S = "${WORKDIR}/git"

SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE_${PN} = "gstd.service"

inherit autotools pkgconfig gettext 
# inherit setuptools3

# Python API path
# DISTUTILS_SETUP_PATH = "${S}/libgstc/python"

EXTRA_OECONF = "--with-gstd-runstatedir=/run \
                --with-gstd-logstatedir=/var/log/ \
		--with-gstd-systemddir=${systemd_unitdir}/system/ \
                "

do_configure() {
        ${S}/autogen.sh
        oe_runconf
}

do_install() {
        autotools_do_install
        # Install Python API
        #distutils3_do_install
        # install -d ${D}/run
        # install -d ${D}/var/log/
        rm -rf ${D}/var/
        rm -rf ${D}/run/
}

FILES:${PN} = "${bindir} ${libdir}/*.so* \ 
               /lib/systemd/system/gstd-check-user-xenv.sh \
               /lib/systemd/system/gstd.service \
              "

# Split the Python API to a separate package
# PACKAGES += "${PN}-python"
# PROVIDES += "${PN}-python"

# Make the Python API depend on the main package
# RDEPENDS:${PN}-python = "${PN} python3"
# FILES:${PN}-python = "${PYTHON_SITEPACKAGES_DIR}"
