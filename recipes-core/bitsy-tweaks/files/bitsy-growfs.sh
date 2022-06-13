#!/bin/sh
set -x

umount /dev/mmcblk0p3
echo "Unmounted /dev/mmcblk0p3"
parted ---pretend-input-tty /dev/mmcblk0 resizepart 3 100%
echo "Grew /dev/mmcblk0p3 partition to 100%"
resize2fs -p /dev/mmcblk0p3
echo "Finished resizing filesystem /dev/mmcblk0p3"
mount -o remount,rw /dev/mmcblk0p3 /data
echo "Mounted /dev/mmcblk0p3 to /data"
