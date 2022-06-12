#!/bin/sh

# ensure merge strategies are specified in /boot/user-data mimetype


# merge lists (append) and dictionaries (recursively), so user-data is merged with service users

USER_DATA_FILE="/boot/user-data"
MERGE_STRATEGY="$(cat $USER_DATA_FILE | grep merge_how)"

if [ -z "$MERGE_STRATEGY" ]; then
    echo "cloud-init merge_how strategy not found in $USER_DATA_FILE. Generating..."
    cat <<EOF >> $USER_DATA_FILE
merge_how:
  - name: list
    settings: [append]
  - name: dict
    settings: [no_replace, recurse_list]

EOF
    echo "Success! cloud-init wrote merge_how strategy to $USER_DATA_FILE"
else
    echo "cloud-init merge_how strategy: $MERGE_STRATEGY"
fi
