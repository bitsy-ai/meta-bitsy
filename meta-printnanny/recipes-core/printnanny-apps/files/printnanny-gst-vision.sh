#!/bin/bash
set +xeuo pipefail

export VIDEO_HEIGHT="480"
export VIDEO_WIDTH="640"

export MODEL_INPUT_HEIGHT="320"
export MODEL_INPUT_WIDTH="320"
export H264_LEVEL="4"
export FRAMERATE="0/1"
export SRC_HOST="localhost"
export SRC_PORT="5205"
RTP_HOST="$(printnanny config get pi.webrtc_cloud.rtp_domain)"
export RTP_HOST=$RTP_HOST
RTP_PORT="$(printnanny config get pi.webrtc_cloud.rtp_port)"
export RTP_PORT=RTP_PORT

gst-launch-1.0 -v \
    udpsrc port=5205 caps="application/x-rtp, media=(string)video, clock-rate=(int)90000, encoding-name=(string)H264, payload=(int)96, packetization-mode=(string)1, profile-level-id=(string)42c028, profile=(string)constrained-baseline, a-framerate=(string)24" \
    ! rtph264depay \
    ! h264parse \
    ! v4l2h264dec extra-controls="controls,repeat_sequence_header=1" \
    ! v4l2convert \
    ! video/x-raw,format=RGB,width=640,height=480 \
    ! videoscale ! "video/x-raw,width=$INPUT_MODEL_WIDTH,height=$INPUT_MODEL_HEIGHT" \
    ! queue leaky=2 \
    ! tensor_converter \
    ! tensor_transform mode=arithmetic option=typecast:uint8,add:0,div:1 \
    ! other/tensors,num_tensors=1,format=static \
    ! queue \
    ! tensor_filter \
        framework=tensorflow2-lite \
        model=/usr/share/printnanny/model/model.tflite \
    ! queue \
    ! tensor_decoder mode=bounding_boxes option1=mobilenet-ssd-postprocess option2=/usr/share/printnanny/model/dict.txt option3=0:1:2:3,50 option4="$VIDEO_WIDTH:$VIDEO_WIDTH" option5="$INPUT_MODEL_WIDTH:$INPUT_MODEL_HEIGHT" \
    ! queue \
    ! v4l2convert \
    ! v4l2h264enc extra-controls="controls,repeat_sequence_header=1" \
    ! 'video/x-h264,width=640,height=480,level=(string)4' \
    ! h264parse \
    ! rtph264pay \
    ! udpsink host="$RTP_HOST" port="$RTP_HOST"
