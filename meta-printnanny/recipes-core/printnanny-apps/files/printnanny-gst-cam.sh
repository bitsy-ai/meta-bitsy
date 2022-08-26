#!/bin/bash
set +xeuo pipefail

VIDEO_FILENAME="$(printnanny cam new-filename)"
export VIDEO_FILENAME=$VIDEO_FILENAME
export VIDEO_HEIGHT="480"
export VIDEO_WIDTH="640"
export H264_LEVEL="4"
export FRAMERATE="0/1"
export DOWNSAMPLE_RATE="1/1"
RTP_HOST="$(printnanny config get pi.webrtc_cloud.rtp_domain)"
export RTP_HOST=$RTP_HOST
RTP_PORT="$(printnanny config get pi.webrtc_cloud.rtp_port)"
export RTP_PORT=RTP_PORT
export VISION_HOST="localhost"
export VISION_PORT="5205"

gst-launch-1.0 -e -v \
    libcamerasrc \
    ! "video/x-raw,width=$VIDEO_WIDTH,height=$VIDEO_HEIGHT,framerate=$FRAMERATE,format=NV21" \
    ! v4l2convert \
    ! queue \
    ! v4l2h264enc extra-controls='controls,repeat_sequence_header=1' \
    ! "video/x-h264,width=$VIDEO_WIDTH,height=$VIDEO_HEIGHT,framerate=$FRAMERATE,level=(string)4,format=NV21" \
    ! tee name=t0 \
    ! queue \
    ! filesink location="$VIDEO_FILENAME" \
    t0. ! queue ! rtph264pay config-interval=1 aggregate-mode=zero-latency pt=96 ! tee name=t1 ! queue2 ! udpsink host="$RTP_HOST" port="$RTP_PORT" \
    t1. ! queue2 ! videorate ! "video/x-h264,framerate=$DOWNSAMPLE_FRAMERATE" udpsink host="$VISION_HOST" port="$VISION_DOMAIN"
