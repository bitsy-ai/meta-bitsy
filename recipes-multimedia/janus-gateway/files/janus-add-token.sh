#!/bin/sh

echo "Reading credentials from $CREDENTIALS_DIRECTORY"

JANUS_ADMIN_SECRET="$(cat ${CREDENTIALS_DIRECTORY}/janus-edge-admin-secret)"
JANUS_API_TOKEN="$(cat ${CREDENTIALS_DIRECTORY}/janus-edge-api-token)"
TRANSACTION="$(echo $RANDOM | md5sum | head -c 20; echo;)"

curl -X POST http://127.0.0.1:7088/admin \
    -H 'Content-Type: application/json' \
    -d @- <<EOF
{"transaction" : "$TRANSACTION","janus" : "add_token", "token": "$JANUS_API_TOKEN", "admin_secret": "$JANUS_ADMIN_SECRET"}
EOF
