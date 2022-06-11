gst-launch-1.0 \
    libcamerasrc name=cam_src ! videoconvert ! videoscale ! video/x-raw,width=640,height=480,format=RGB,framerate=30/1 ! tee name=t \
    t. ! queue leaky=2 max-size-buffers=2 ! videoscale ! video/x-raw,width=300,height=300,format=RGB ! tensor_converter ! \
        tensor_transform mode=arithmetic option=typecast:uint8,add:0,div:1  ! \
        tensor_filter framework=tensorflow-lite model=/usr/share/printnanny/model/model.tflite ! \
        tensor_decoder mode=bounding_boxes option1=mobilenet-ssd-postprocess option2=/usr/share/printnanny/model/dict.txt option3=0:1:2:3,0.66 option4=640:480 option5=640:480 ! \
        compositor name=mix sink_0::zorder=2 sink_1::zorder=1 ! videoconvert ! ximagesink \
    t. ! queue leaky=2 max-size-buffers=10 ! mix.