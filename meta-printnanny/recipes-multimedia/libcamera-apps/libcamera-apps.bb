LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://license.txt;md5=a0013d1b383d72ba4bdc5b750e7d1d77"

SRC_URI = "git://github.com/raspberrypi/libcamera-apps.git;branch=main;protocol=https"
SRCREV = "6582a730b059f086552414b034c90688cca047eb"

S = "${WORKDIR}/git"

PV = "202205+git${SRCPV}"

inherit cmake pkgconfig

COMPATIBLE_MACHINE = "^rpi$"

PREFERRED_VERSION:libcamera = "202205"

DEPENDS = "libcamera boost libexif tiff tensorflow-lite"
RDEPENDS:${PN} = "python3-core"

# objdetect module is not being included automatically for some reason, so explicitly enable it

# $ls /home/leigh/projects/poky/build-rpi4/tmp/work/cortexa72-printnanny-linux/libcamera-apps/202205+gitAUTOINC+6582a730b0-r0/recipe-sysroot/usr/include/opencv4/opencv2
# alphamat.hpp     ccalib.hpp      fuzzy          img_hash                 opencv.hpp            quality       sfm.hpp               superres              video.hpp        xphoto
# aruco            core            fuzzy.hpp      img_hash.hpp             opencv_modules.hpp    quality.hpp   shape                 superres.hpp          videoio          xphoto.hpp
# aruco.hpp        core.hpp        gapi           imgproc                  optflow               rapid.hpp     shape.hpp             surface_matching      videoio.hpp
# bgsegm.hpp       cvconfig.h      gapi.hpp       imgproc.hpp              optflow.hpp           reg           stereo                surface_matching.hpp  videostab
# bioinspired      datasets        hfs.hpp        intensity_transform.hpp  phase_unwrapping      rgbd          stereo.hpp            tracking              videostab.hpp
# bioinspired.hpp  features2d      highgui        line_descriptor          phase_unwrapping.hpp  rgbd.hpp      stitching             tracking.hpp          xfeatures2d
# calib3d          features2d.hpp  highgui.hpp    line_descriptor.hpp      photo                 saliency      stitching.hpp         ts                    xfeatures2d.hpp
# calib3d.hpp      flann           imgcodecs      ml                       photo.hpp             saliency.hpp  structured_light      ts.hpp                ximgproc
# ccalib           flann.hpp       imgcodecs.hpp  ml.hpp                   plot.hpp              sfm           structured_light.hpp  video                 ximgproc.hpp

EXTRA_OECMAKE:pn-opencv:append = "\
   -DBUILD_opencv_dnn=ON \
   -DBUILD_opencv_objdetect=ON \
"

EXTRA_OECMAKE = "\
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "-DENABLE_X11=1", "-DENABLE_X11=0", d)} \
    ${@bb.utils.contains("MACHINE", "raspberrypi3", "-DENABLE_COMPILE_FLAGS_FOR_TARGET=armv8-neon", "", d)} \
    ${@bb.utils.contains("MACHINE", "raspberrypi4", "-DENABLE_COMPILE_FLAGS_FOR_TARGET=armv8-neon", "", d)} \
"

PACKAGECONFIG ??= "gst opencv tensorflow-lite"

PACKAGECONFIG[drm] = "-DENABLE_DRM=1,-DENABLE_DRM=0,libdrm"
PACKAGECONFIG[gst] = "-Dgstreamer=enabled,-Dgstreamer=disabled,gstreamer1.0 gstreamer1.0-plugins-base"
PACKAGECONFIG[opencv] = "-DENABLE_OPENCV=1,-DENABLE_OPENCV=0,opencv"
PACKAGECONFIG[tensorflow-lite] = "-DENABLE_TFLITE=1,-DENABLE_TFLITE=0,tensorflow-lite"
PACKAGECONFIG[qt] = "-DENABLE_QT=1,-DENABLE_QT=0"

FILES:${PN} += "${libdir} ${nonarch_libdir}"
FILES:${PN}-dev = "${includedir} ${libdir}/pkgconfig"
