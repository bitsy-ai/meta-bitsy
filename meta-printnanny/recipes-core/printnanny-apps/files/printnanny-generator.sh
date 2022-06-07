#!/usr/bin/env bash

set -euo pipefail


if [ "$SYSTEMD_FIRST_BOOT" == "1"]; then
    COOKIE_SECRET=$(openssl rand -base64 32)
    JANUS_ADMIN=$(openssl rand -base64 32)
    JANUS_API_TOKEN=$(openssl rand -base64 32) 

    echo "[Unit]" > /etc/systemd/system/printnanny-dash.service.d/cookie-secret.conf
    echo -n "$COOKIE_SECRET" | systemd-creds encrypt --name cookie-secret -p - - >> "/etc/systemd/system/printnanny-dash.service.d/cookie-secret.conf"
    echo "Created /etc/systemd/system/printnanny-dash.service.d/cookie-secret.conf"

    echo "[Unit]" > /etc/systemd/system/printnanny-dash.service.d/janus-edge-admin-secret.conf
    echo -n "$JANUS_ADMIN" | systemd-creds encrypt --name janus-edge-admin-secret -p - - >> "/etc/systemd/system/printnanny-dash.service.d/janus-edge-admin-secret.conf"
    echo "Created /etc/systemd/system/printnanny-dash.service.d/janus-edge-admin-secret.conf"

    echo "[Unit]" > /etc/systemd/system/printnanny-dash.service.d/janus-edge-api-token.conf
    echo -n "$JANUS_API_TOKEN" | systemd-creds encrypt --name janus-edge-api-token -p - - >> "/etc/systemd/system/printnanny-dash.service.d/janus-edge-api-token.conf"
    echo "Created /etc/systemd/system/printnanny-dash.service.d/janus-edge-api-token.conf"

    echo "[Unit]" > /etc/systemd/system/janus-gateway.service.d/janus-edge-admin-secret.conf
    echo -n "$JANUS_ADMIN" | systemd-creds encrypt --name janus-edge-admin-secret -p - - >> "/etc/systemd/system/janus-gateway.service.d/janus-edge-admin-secret.conf"
    echo "Created /etc/systemd/system/janus-gateway.service.d/janus-edge-admin-secret.conf"

    echo "[Unit]" > /etc/systemd/system/janus-gateway.service.d/janus-edge-api-token.conf
    echo -n "$JANUS_API_TOKEN" | systemd-creds encrypt --name janus-edge-api-token -p - - >> "/etc/systemd/system/janus-gateway.service.d/janus-edge-api-token.conf"
    echo "Created /etc/systemd/system/janus-gateway.service.d/janus-edge-api-token.conf"
    echo "Initializing printnanny config"
    /usr/bin/printnanny config init --output=/etc/printnanny/default.toml
    mkdir -p /etc/printnanny/keys
    /usr/bin/printnanny config generate-keys --output=/etc/printnanny/keys
else
    echo "Skipping printnanny config init, SYSTEMD_FIRST_BOOT=$SYSTEMD_FIRST_BOOT"
fi
