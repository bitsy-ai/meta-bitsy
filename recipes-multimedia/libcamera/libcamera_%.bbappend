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

DEPENDS += "libyaml openssl libuv"
RDEPENDS:${PN}-dev += "libyaml-dev"
