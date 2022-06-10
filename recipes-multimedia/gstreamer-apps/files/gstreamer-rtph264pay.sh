#!/bin/sh
set -x

GSTREAMER_UDP_SINK_HOST="${GSTREAMER_UDP_SINK_HOST:-127.0.0.1}"
GSTREAMER_UDP_SINK_PORT="${GSTREAMER_UDP_SINK_PORT:-5104}"

gst-launch-1.0 libcamerasrc \
    ! capsfilter caps=video/x-raw,width=640,height=480,format=NV12,framerate=10/1 \
    ! queue \
    ! v4l2convert \
    ! v4l2h264enc extra-controls="controls,repeat_sequence_header=1" \
    ! 'video/x-h264,level=(string)4' \
    ! h264parse \
    ! rtph264pay \
    ! "udpsink host=$GSTREAMER_UDP_SINK_HOST port=$GSTREAMER_UDP_SINK_PORT"
