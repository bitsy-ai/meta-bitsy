#!/bin/bash
set +xeuo pipefail


export RAW_VIDEO_SOCKET_PATH=/var/run/printnanny/video-raw.socket

export VIDEO_HEIGHT="480"
export VIDEO_WIDTH="640"

export INPUT_MODEL_HEIGHT="320"
export INPUT_MODEL_WIDTH="320"
export H264_LEVEL="4"
export FRAMERATE="24/1"
RTP_HOST="$(printnanny config get pi.webrtc_cloud.rtp_domain)"
export RTP_HOST=$RTP_HOST
RTP_PORT="$(printnanny config get pi.webrtc_cloud.data_rtp_port)"
export RTP_PORT=$RTP_PORT


gst-launch-1.0 -v \
    shmsrc socket-path="$RAW_VIDEO_SOCKET_PATH" \
    ! "video/x-raw, framerate=(fraction)24/1, format=(string)RGB, width=${VIDEO_WIDTH},height=${VIDEO_HEIGHT},framerate=(fraction)${FRAMERATE}, interlace-mode=(string)progressive, colorimetry=(string)1:1:5:1" \
    ! v4l2convert \
    ! videoscale ! "video/x-raw,width=$INPUT_MODEL_WIDTH,height=$INPUT_MODEL_HEIGHT,format=RGB" \
    ! queue leaky=2 max-size-buffers=2 \
    ! tensor_converter \
    ! tensor_transform mode=arithmetic option=typecast:uint8,add:0,div:1 \
    ! other/tensors,num_tensors=1,format=static \
    ! queue leaky=2 max-size-buffers=2 \
    ! tensor_filter \
        framework=tensorflow2-lite \
        model=/usr/share/printnanny/model/model.tflite \
    ! queue leaky=2 max-size-buffers=2 \
    ! tensor_decoder mode=bounding_boxes option1=mobilenet-ssd-postprocess option2=/usr/share/printnanny/model/dict.txt option3=0:1:2:3,50 option4="$VIDEO_WIDTH:$VIDEO_WIDTH" option5="$INPUT_MODEL_WIDTH:$INPUT_MODEL_HEIGHT" \
    ! queue leaky=2 max-size-buffers=2 \
    ! rtpgstpay \
    ! udpsink host="$RTP_HOST" port="$RTP_PORT"
