#!/bin/bash

set -xeu

# Raspberry Pi imager produces user-data with the following runcmd:
#
# runcmd:
# - sed -i 's/^s*REGDOMAIN=S*/REGDOMAIN=US/' /etc/default/crda || true
# - localectl set-x11-keymap "us" pc105
# - setupcon -k --force || true

# We want to omit this, since the values are specific to Debian / Ubuntu flavors of Linux

USER_DATA_FILE="/boot/user-data"

if grep -q "runcmd:" "$USER_DATA_FILE"; then
    mv "$USER_DATA_FILE" "$USER_DATA_FILE.bak"
    head -n -5 "$USER_DATA_FILE.bak" > "$USER_DATA_FILE"
    echo "Removed runcmd: section from $USER_DATA_FILE"
fi
