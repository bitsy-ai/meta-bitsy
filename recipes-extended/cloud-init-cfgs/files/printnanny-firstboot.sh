#!/usr/bin/env bash

set -euo pipefail
set +x

COOKIE_SECRET=$(openssl rand -base64 32)
JANUS_ADMIN=$(openssl rand -base64 32)
JANUS_API_TOKEN=$(openssl rand -base64 32) 
NOW=$(date '+%s')

mkdir -p /etc/systemd/system/printnanny-dash.d/
echo -n "$COOKIE_SECRET" | systemd-creds encrypt --name cookie-secret -p - - "/etc/systemd/system/printnanny-dash.d/${NOW}-cookie.conf"
echo "Created /etc/systemd/system/printnanny-dash.d/${NOW}-cookie.conf"
echo -n "$JANUS_ADMIN" | systemd-creds encrypt --name janus-edge-admin-secret -p - - "/etc/systemd/system/printnanny-dash.d/${NOW}-janus-edge-admin-secret.conf"
echo "Created /etc/systemd/system/printnanny-dash.d/${NOW}-janus-edge-admin-secret.conf"
echo -n "$JANUS_API_TOKEN" | systemd-creds encrypt --name janus-edge-api-token -p - - "/etc/systemd/system/printnanny-dash/${NOW}-janus-edge-api-token.conf"
echo "Created /etc/systemd/system/printnanny-dash/${NOW}-janus-edge-api-token.conf"

mkdir -p /etc/systemd/system/janus-gateway.d/
echo -n "$JANUS_ADMIN" | systemd-creds encrypt --name janus-edge-admin-secret -p - - "/etc/systemd/system/janus-gateway.d/${NOW}-janus-edge-admin-secret.conf"
echo "Created /etc/systemd/system/janus-gateway.d/${NOW}-janus-edge-admin-secret.conf"
echo -n "$JANUS_API_TOKEN" | systemd-creds encrypt --name janus-edge-api-token -p - - "/etc/systemd/system/janus-gateway.d/${NOW}-janus-edge-api-token.conf"
echo "Created /etc/systemd/system/janus-gateway.d/${NOW}-janus-edge-api-token.conf"
