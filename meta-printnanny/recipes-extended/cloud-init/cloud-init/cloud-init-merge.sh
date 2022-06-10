#!/bin/bash

if [ ! -f /boot/user-data.bak ]
then
    cp /boot/user-data /boot/user-data.bak
    cat >> /boot/user-data << EOF
merge_how:
- name: list
settings: [append]
- name: dict
settings: [no_replace, recurse_list]
EOF
    echo "Created /boot/user-data.bak and appended merge rules to /boot/user/data"
else
    echo "/boot/user-data.bak already exists"
fi
