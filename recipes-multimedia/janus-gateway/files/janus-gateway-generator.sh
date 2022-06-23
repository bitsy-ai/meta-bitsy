#!/bin/bash

set -euo pipefail

JANUS_ADMIN_FILE="/run/systemd/system/janus-gateway.service.d/janus-edge-admin-secret.conf"
JANUS_TOKEN_FILE="/run/systemd/system/janus-gateway.service.d/janus-edge-api-token.conf"

mkdir -p /run/systemd/system/janus-gateway.service.d

if [ -f "$JANUS_ADMIN_FILE" ]; then
    echo "<6>janus-generator[$$]: $JANUS_ADMIN_FILE exists, skipping credential generation"
else
    SECRET=$(openssl rand -base64 32)
    echo "[Service]" > "$JANUS_ADMIN_FILE"
    echo -n "$SECRET" | systemd-creds encrypt --name janus-edge-admin-secret -p - - >> "$JANUS_ADMIN_FILE"
fi

if [ -f "$JANUS_TOKEN_FILE" ]; then
    echo "<6>janus-generator[$$]: $JANUS_TOKEN_FILE exists, skipping credential generation"
else
    SECRET=$(openssl rand -base64 32)
    echo "[Service]" > "$JANUS_TOKEN_FILE"
    echo -n "$SECRET" | systemd-creds encrypt --name janus-edge-api-token -p - - >> "$JANUS_TOKEN_FILE"
    echo "<6>janus-generator[$$]: Created $JANUS_TOKEN_FILE"
fi
