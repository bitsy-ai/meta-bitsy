DESCRIPTION = "This repository contains the source code for the ARM side \
libraries used on Raspberry Pi. These typically are installed in /opt/vc/lib \
and includes source for the ARM side code to interface to: EGL, mmal, GLESv2,\
vcos, openmaxil, vchiq_arm, bcm_host, WFC, OpenVG."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENCE;md5=0448d6488ef8cc380632b1569ee6d196"

PROVIDES += "${@bb.utils.contains("MACHINE_FEATURES", "vc4graphics", "", "virtual/libgles2 virtual/egl", d)}"
PROVIDES += "virtual/libomxil"

RPROVIDES:${PN} += "${@bb.utils.contains("MACHINE_FEATURES", "vc4graphics", "", "libgles2 egl libegl libegl1 libglesv2-2", d)}"
COMPATIBLE_MACHINE:machinename = "raspberrypi$"

SRCBRANCH = "master"
SRCFORK = "raspberrypi"
SRCREV = "54fd97ae4066a10b6b02089bc769ceed328737e0"

# Use the date of the above commit as the package version. Update this when
# SRCREV is changed.
PV = "20221211"

SRC_URI = "\
    git://github.com/${SRCFORK}/userland.git;protocol=https;branch=${SRCBRANCH} \
"

S = "${WORKDIR}/git"

inherit cmake pkgconfig

ASNEEDED = ""

EXTRA_OECMAKE = "-DCMAKE_BUILD_TYPE=Release -DCMAKE_EXE_LINKER_FLAGS='-Wl,--no-as-needed' \
                 -DVMCS_INSTALL_PREFIX=${exec_prefix} \
"

EXTRA_OECMAKE:append:aarch64 = " -DARM64=ON "

CFLAGS:append = " -fPIC -Wno-unused-but-set-variable"

do_install:append () {
	for f in `find ${D}${includedir}/interface/vcos/ -name "*.h"`; do
		sed -i 's/include "vcos_platform.h"/include "pthreads\/vcos_platform.h"/g' ${f}
		sed -i 's/include "vcos_futex_mutex.h"/include "pthreads\/vcos_futex_mutex.h"/g' ${f}
		sed -i 's/include "vcos_platform_types.h"/include "pthreads\/vcos_platform_types.h"/g' ${f}
	done
        rm -rf ${D}${prefix}${sysconfdir}
	if [ "${@bb.utils.contains("MACHINE_FEATURES", "vc4graphics", "1", "0", d)}" = "1" ]; then
		rm -rf ${D}${libdir}/libEGL*
		rm -rf ${D}${libdir}/libGLES*
		rm -rf ${D}${libdir}/libwayland-*
		rm -rf ${D}${libdir}/pkgconfig/egl.pc ${D}${libdir}/pkgconfig/glesv2.pc \
			${D}${libdir}/pkgconfig/wayland-egl.pc
		rm -rf ${D}${includedir}/EGL ${D}${includedir}/GLES* ${D}${includedir}/KHR
        else
                ln -sf brcmglesv2.pc ${D}${libdir}/pkgconfig/glesv2.pc
                ln -sf brcmegl.pc ${D}${libdir}/pkgconfig/egl.pc
                ln -sf brcmvg.pc ${D}${libdir}/pkgconfig/vg.pc
	fi
	# Currently man files are installed in /usr/man instead of /usr/share/man, see comments in:
	# https://github.com/raspberrypi/userland/commit/45a0022ac64b4d0788def3c5230c972430f6fc23
	mkdir -pv ${D}${datadir}
	mv -v ${D}${prefix}/man ${D}${mandir}
}

# Shared libs from userland package  build aren't versioned, so we need
# to force the .so files into the runtime package (and keep them
# out of -dev package).
FILES_SOLIBSDEV = ""
INSANE_SKIP:${PN} += "dev-so"

FILES:${PN} += " \
    ${libdir}/*.so \
    ${libdir}/plugins"
FILES:${PN}-dev += "${includedir} \
                   ${prefix}/src"
FILES:${PN}-doc += "${datadir}/install"
FILES:${PN}-dbg += "${libdir}/plugins/.debug"

RDEPENDS:${PN} += "bash"
RDEPENDS:${PN} += "${@bb.utils.contains("MACHINE_FEATURES", "vc4graphics", "libegl-mesa", "", d)}"