SUMMARY = "Linux libcamera framework"
SECTION = "libs"

LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

LIC_FILES_CHKSUM = "\
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
"

SRC_URI = " \
    git://git.libcamera.org/libcamera/libcamera.git;protocol=https;branch=master \
"

SRCREV = "fb44403f1c5571549ac128c21daee9761eb9249c"
PV = "v0.5.0+git${SRCPV}"
S = "${WORKDIR}/git"

DEPENDS = "\
    python3-pyyaml-native \
    python3-jinja2-native \
    python3-ply-native \
    udev \
    gnutls \
    boost \
    chrpath-native \
    libevent \
    libdrm \
    jpeg \
    libsdl2 \
    libyaml \
    openssl \
    libuv \
"
DEPENDS += "${@bb.utils.contains('DISTRO_FEATURES', 'qt', 'qtbase qtbase-native', '', d)}"

PACKAGES += "${PN}-gst ${PN}-rpi"

PACKAGECONFIG ??= "gst"
PACKAGECONFIG[gst] = "-Dgstreamer=enabled,-Dgstreamer=disabled,gstreamer1.0 gstreamer1.0-plugins-base"
PACKAGECONFIG[tracing] = "-Dtracing=enabled,-Dtracing=disabled,libuv,libuv"
PACKAGECONFIG[pycamera] = "-Dpycamera=enabled,-Dpycamera=disabled,pybind11"

EXTRA_OEMESON = " \
    -Dpipelines=uvcvideo,simple,vimc \
    -Dipas=vimc \
    -Dv4l2=true \
    -Dcam=enabled \
    -Dlc-compliance=disabled \
    -Dtest=false \
    -Ddocumentation=disabled \
"

EXTRA_OEMESON:raspberrypi4-64 = "\
    -Dpipelines=raspberrypi,uvcvideo \
    -Dipas=raspberrypi,vimc \
    -Dv4l2=true \
    -Dcam=enabled \
    -Dlc-compliance=disabled \
    -Dtest=false \
    -Ddocumentation=disabled \
"


RDEPENDS:${PN}-dev = "libyaml-dev"
RDEPENDS:${PN} = "\
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland qt', 'qtwayland', '', d)} \
"

inherit meson pkgconfig python3native

do_configure:prepend() {
    sed -i -e 's|py_compile=True,||' ${S}/utils/ipc/mojo/public/tools/mojom/mojom/generate/template_expander.py
}

do_install:append() {
    chrpath -d ${D}${libdir}/libcamera.so.0.0.5
    chrpath -d ${D}${libdir}/libcamera-base.so.0.0.5
}

addtask do_recalculate_ipa_signatures_package after do_package before do_packagedata
do_recalculate_ipa_signatures_package() {
    local modules
    for module in $(find ${PKGD}/usr/lib/libcamera -name "*.so.sign"); do
        module="${module%.sign}"
        if [ -f "${module}" ] ; then
            modules="${modules} ${module}"
        fi
    done

    ${S}/src/ipa/ipa-sign-install.sh ${B}/src/ipa-priv-key.pem "${modules}"
}

FILES:${PN}-dev = "${includedir} ${libdir}/pkgconfig"
FILES:${PN}-dev += " ${libdir}/libcamera.so"
FILES:${PN} += " ${libdir}/libcamera.so.0"
FILES:${PN} += " ${libdir}/libcamera.so.0.0.5"
FILES:${PN}-dev += " ${libdir}/libcamera-base.so"
FILES:${PN} += " ${libdir}/libcamera-base.so.0"
FILES:${PN} += " ${libdir}/libcamera-base.so.0.0.5"
FILES:${PN} += " ${libdir}/v4l2-compat.so"
FILES:${PN}-gst = "${libdir}/gstreamer-1.0/libgstlibcamera.so"
FILES:${PN} += " ${bindir}/cam"
