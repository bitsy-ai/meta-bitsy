#!/bin/bash

# quick fix for Raspberry Pi userland expecting video group to own/access userland
FIX_VIDEO_GROUP=(
    "/dev/rpivid-h264mem"
    "/dev/rpivid-hevcmem"
    "/dev/rpivid-intcmem"
    "/dev/rpivid-vp9mem"
    "/dev/v4l-subdev0"
    "/dev/vchiq"
    "/dev/vcio"
    "/dev/vcsm-cma"
)

for f in "${FIX_VIDEO_GROUP[@]}"
do
    echo "Changing group ownership of $f to root:video"
    chown :video "$f"
done
