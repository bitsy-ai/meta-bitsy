# build with opencv_dnn as an OPTIONAL dependency 
# opencv_dnn is not required by libcamera-apps 
# https://github.com/opencv/opencv/commit/ed6ca0d7fab5381c6aa6062c49c3c99ee828fadb

# set in meta-openembedded/meta-oe/recipes-support/opencv/opencv_4.5.5.bb
# SRCREV_opencv = "dad26339a975b49cfb6c7dbe4bd5276c9dcb36e2"

# override SRCREV_opencv
SRCREV_opencv = "ed6ca0d7fab5381c6aa6062c49c3c99ee828fadb"
