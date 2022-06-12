#!/bin/sh
set -x

export GSTREAMER_UDP_SINK_HOST="${GSTREAMER_UDP_SINK_HOST:-127.0.0.1}"
export GSTREAMER_UDP_SINK_PORT_VIDEO="${GSTREAMER_UDP_SINK_PORT:-5105}"
export GSTREAMER_UDP_SINK_PORT_OVERLAY="${GSTREAMER_UDP_SINK_PORT:-5106}"
export GSTREAMER_UDP_SINK_PORT_DATA="${GSTREAMER_UDP_SINK_PORT:-5107}"


gst-launch-1.0 --verbose libcamerasrc \
    ! capsfilter caps="video/x-raw,format=RGB,width=640,height=480,framerate=0/1" \
    ! tee name=t \
    t.  ! queue leaky=2 max-size-buffers=2 \
        ! videoconvert \
        ! videoscale ! video/x-raw,width=320,height=320 \
        ! tensor_converter \
        ! tensor_transform mode=arithmetic option=typecast:uint8,add:0,div:1 \
        ! other/tensors,num_tensors=1,format=static \
        ! tensor_filter \
            framework=tensorflow2-lite \
            model=/usr/share/printnanny/model/model.tflite \
        ! tensor_decoder mode=bounding_boxes option1=mobilenet-ssd-postprocess option2=/usr/share/printnanny/model/dict.txt option3=0:1:2:3,66 option4=640:480 option5=320:320 \
        ! videoconvert name=v4l2convert0 \
        ! v4l2h264enc extra-controls="controls,repeat_sequence_header=1" name=v4l2h264enc0 \
        ! 'video/x-h264,width=640,height=480,level=(string)4' \
        ! h264parse \
        ! rtph264pay \
        ! udpsink host="$GSTREAMER_UDP_SINK_HOST" port="$GSTREAMER_UDP_SINK_PORT_OVERLAY" \
    t.  ! queue leaky=2 max-size-buffers=2 \
        ! videoconvert name=v4l2convert1 \
        ! v4l2h264enc extra-controls="controls,repeat_sequence_header=1" name=v4l2h264enc1 \
        ! 'video/x-h264,width=640,height=480,level=(string)4' \
        ! h264parse \
        ! rtph264pay \
        ! udpsink host="$GSTREAMER_UDP_SINK_HOST" port="$GSTREAMER_UDP_SINK_PORT_VIDEO"
