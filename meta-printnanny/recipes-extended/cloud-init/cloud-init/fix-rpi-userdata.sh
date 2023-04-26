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
    head -n -6 "$USER_DATA_FILE.bak" > "$USER_DATA_FILE"
    echo "Removed runcmd: section from $USER_DATA_FILE"
fi

# Raspberry Pi imager v1.7.4+ outputs a different file name, `network-.con` that we need to copy to correct path
# https://github.com/bitsy-ai/printnanny-os/issues/301
NETWORK_DATA_FILE="/boot/network-config"
NETWORK_DATA_SHIM="/boot/network-.con"
if [ ! -f "$NETWORK_DATA_FILE" ] && [ -f "$NETWORK_DATA_SHIM" ]; then
    cp "$NETWORK_DATA_SHIM" "$NETWORK_DATA_FILE"
    echo "Copied $NETWORK_DATA_SHIM to $NETWORK_DATA_FILE"
fi
