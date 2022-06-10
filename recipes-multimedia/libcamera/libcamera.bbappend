PACKAGECONFIG = "gst"

PACKAGECONFIG[gst] = "-Dgstreamer=enabled,-Dgstreamer=disabled,gstreamer1.0 gstreamer1.0-plugins-base,gstreamer1.0 gstreamer1.0-plugins-base"
PACKAGECONFIG[tracing] = "-Dtracing=enabled,-Dtracing=disabled,libuv,libuv"
PACKAGECONFIG[pycamera] = "-Dpycamera=enabled,-Dpycamera=disabled,pybind11"

EXTRA_OEMESON =  "\
    -Dpipelines=raspberrypi \
    -Dipas=raspberrypi \
    -Dv4l2=true \
    -Dtest=false \
    -Dlc-compliance=disabled \
    -Dcam=disabled \
    -Dqcam=disabled \
    -Ddocumentation=disabled \
"
SRCREV = "e115a691353151b3136581ac7f49cab6a3b0eb9a"
PV = "202205+git${SRCPV}"
DEPENDS += "libyaml openssl libuv"
RDEPENDS:${PN}-dev += "libyaml-dev"
