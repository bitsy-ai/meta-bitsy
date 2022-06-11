# Note:
# XNNPack is valid only on 64bit. 
# In the case of arm 32bit, it will be turned off because the build will be
# an error depending on the combination of target CPUs.
TENSORFLOW_TARGET_ARCH:raspberrypi = "armv6"
TENSORFLOW_TARGET_ARCH:raspberrypi0 = "armv6"
TENSORFLOW_TARGET_ARCH:raspberrypi0-wifi = "armv6"
TENSORFLOW_TARGET_ARCH:raspberrypi-cm = "armv6"

TENSORFLOW_TARGET_ARCH:raspberrypi2 = "armv7"
TENSORFLOW_TARGET_ARCH:raspberrypi3 = "armv7"
TENSORFLOW_TARGET_ARCH:raspberrypi4 = "armv7"
TENSORFLOW_TARGET_ARCH:raspberrypi-cm3 = "armv7"

TENSORFLOW_TARGET_ARCH:raspberrypi0-2w-64 = "aarch64"
TUNE_CCARGS:raspberrypi0-2w-64  = ""
EXTRA_OECMAKE:append:raspberrypi0-2w-64 = " -DTFLITE_ENABLE_XNNPACK=ON"
TENSORFLOW_TARGET_ARCH:raspberrypi3-64 = "aarch64"
TUNE_CCARGS:raspberrypi3-64 = ""
EXTRA_OECMAKE:append:raspberrypi3-64 = " -DTFLITE_ENABLE_XNNPACK=ON"
TENSORFLOW_TARGET_ARCH:raspberrypi4-64 = "aarch64"
TUNE_CCARGS:raspberrypi4-64 = ""
EXTRA_OECMAKE:append:raspberrypi4-64 = " -DTFLITE_ENABLE_XNNPACK=ON"

TENSORFLOW_TARGET_ARCH:riscv32 = "riscv32"
EXTRA_OECMAKE:append:riscv32 = " -DTFLITE_ENABLE_XNNPACK=ON"
TENSORFLOW_TARGET_ARCH:riscv64 = "riscv64"
EXTRA_OECMAKE:append:riscv64 = " -DTFLITE_ENABLE_XNNPACK=ON"

EXTRA_OECMAKE = "\
    -DTFLITE_ENABLE_XNNPACK=on \
    -DTFLITE_ENABLE_RUY=on \
    -DTFLITE_ENABLE_GPU=off \
    -DBUILD_SHARED_LIB=on \
    -DFETCHCONTENT_FULLY_DISCONNECTED=OFF \
    -DTENSORFLOW_TARGET_ARCH=${TENSORFLOW_TARGET_ARCH} \
    ${S}/tensorflow/lite/ \
"