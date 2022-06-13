#!/bin/sh
set -x

NOW=$(date +%s)
umount /dev/mmcblk0p3
parted ---pretend-input-tty /dev/mmcblk0 resizepart 3 100%
resize2fs /dev/mmcblk0p3
mount /dev/mmcblk0p3 /data
cp -rp /home/* /data/home
mv /home "home.$NOW"
mount --bind /data/home /home
cp /etc/fstab "/etc/fstab.$NOW"
echo "/data/home      /home   none    bind            0       0" >> /etc/fstab
echo "$NOW" > /etc/bitsy/growfs.done
