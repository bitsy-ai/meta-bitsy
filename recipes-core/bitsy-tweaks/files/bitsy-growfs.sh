#!/bin/sh
set -x

umount /dev/mmcblk0p3
parted ---pretend-input-tty /dev/mmcblk0 resizepart 3 100%
resize2fs /dev/mmcblk0p3
mount /dev/mmcblk0p3 /data
echo "/data/home      /home   none    bind            0       0" >> /etc/fstab
echo $(date +%s) > /etc/bitsy/growfs.done
