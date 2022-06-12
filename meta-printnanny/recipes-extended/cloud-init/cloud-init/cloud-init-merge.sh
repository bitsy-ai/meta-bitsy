#!/bin/sh

# ensure merge strategies are specified in /boot/user-data mimetype


# merge lists (append) and dictionaries (recursively), so user-data is merged with service users

USER_DATA_FILE="/boot/user-data"
USER_DATA_BACKUP="$USER_DATA_FILE.bak"

if [ -f "$USER_DATA_BACKUP" ]; then
    echo "$USER_DATA_BACKUP exists, no modifications to $USER_DATA_FILE needed"
else
    cp "$USER_DATA_FILE" "$USER_DATA_BACKUP"
    sed -i 's,users:,users:\n- default,' "$USER_DATA_FILE"
fi
