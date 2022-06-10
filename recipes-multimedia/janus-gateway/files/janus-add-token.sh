#!/bin/sh

JANUS_ADMIN_SECRET="$(cat ${CREDENTIALS_DIRECTORY}/janus-edge-admin-secret)"
JANUS_API_TOKEN="$(cat ${CREDENTIALS_DIRECTORY}/janus-edge-api-token)"

curl -X POST http://127.0.0.1:7088/admin \
    -H 'Content-Type: application/json' \
    -d '{"transaction" : "1acsf213","janus" : "add_token", "token": "$JANUS_API_TOKEN", "admin_secret": "$JANUS_ADMIN_SECRET"}'