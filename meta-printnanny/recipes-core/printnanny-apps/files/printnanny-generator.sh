#!/usr/bin/env bash

set -euo pipefail

# cookie secret is used by printnanny-dash to encrypt cookie data
COOKIE_SECRET_FILE="/etc/systemd/system/printnanny-dash.service.d/cookie-secret.conf"

# janus adin secret/token is required by printnanny-dash, janus-gateway, and octoprint
JANUS_ADMIN_FILE="/etc/systemd/system/janus-gateway.service.d/janus-edge-admin-secret.conf"
JANUS_ADMIN_DASH_LN="/etc/systemd/system/printnanny-dash.service.d/janus-edge-admin-secret.conf"
JANUS_TOKEN_FILE="/etc/systemd/system/janus-gateway.service.d/janus-edge-api-token.conf"
JANUS_TOKEN_DASH_LN="/etc/systemd/system/printnanny-dash.service.d/janus-edge-api-token.conf"

# default PrintNannyConfig file
PRINTNANNY_CONF_FILE="/etc/printnanny/default.toml"
PRINTNANNY_KEYS="/etc/printnanny/keys"

if [ -f "$COOKIE_SECRET_FILE" ]; then
    echo "<6>printnanny-generator[$$]: $COOKIE_SECRET_FILE exists, skipping credential generation"
else
    SECRET=$(openssl rand -base64 32)
    echo "[Service]" > /etc/systemd/system/printnanny-dash.service.d/cookie-secret.conf
    echo -n "$SECRET" | systemd-creds encrypt --name cookie-secret -p - - >> "$COOKIE_SECRET_FILE"
    echo "<4>printnanny-generator[$$]: Created $COOKIE_SECRET_FILE" > /dev/kmsg
fi


if [ -f "$JANUS_ADMIN_FILE" ]; then
    echo "<6>printnanny-generator[$$]: $JANUS_ADMIN_FILE exists, skipping credential generation"
else
    SECRET=$(openssl rand -base64 32)
    mkdir -p /etc/systemd/system/janus-gateway.service.d/
    echo "[Service]" > "$JANUS_ADMIN_FILE"
    echo -n "$SECRET" | systemd-creds encrypt --name janus-edge-admin-secret -p - - >> "$JANUS_ADMIN_FILE"
    echo "<4>printnanny-generator[$$]: Created $JANUS_ADMIN_FILE" > /dev/kmsg
    ln -s "$JANUS_ADMIN_FILE" "$JANUS_ADMIN_DASH_LN"
    echo "<4>printnanny-generator[$$]: Created link from $JANUS_ADMIN_FILE to $JANUS_ADMIN_DASH_LN"
fi

if [ -f "$JANUS_TOKEN_FILE" ]; then
    echo "<6>printnanny-generator[$$]: $JANUS_TOKEN_FILE exists, skipping credential generation"
else
    SECRET=$(openssl rand -base64 32)
    mkdir -p /etc/systemd/system/janus-gateway.service.d/
    echo "[Service]" > "$JANUS_TOKEN_FILE"
    echo -n "$SECRET" | systemd-creds encrypt --name janus-edge-api-token -p - - >> "$JANUS_TOKEN_FILE"
    echo "<4>printnanny-generator[$$]: Created $JANUS_TOKEN_FILE" > /dev/kmsg
    ln -s "$JANUS_TOKEN_FILE" "$JANUS_TOKEN_DASH_LN"
    echo "<4>printnanny-generator[$$]: Created link from $JANUS_TOKEN_FILE to $JANUS_TOKEN_DASH_LN"
fi

if [ -f "$PRINTNANNY_CONF_FILE" ]; then
    echo "<6>printnanny-generator[$$]: $PRINTNANNY_CONF_FILE exists, skipping config generation"
else
    /usr/bin/printnanny config init --output="$PRINTNANNY_CONF_FILE"
    echo "<4>printnanny-generator[$$]: Created config $PRINTNANNY_CONF_FILE"
fi


if [ -f "$PRINTNANNY_CONF_FILE" ]; then
    echo "<6>printnanny-generator[$$]: $PRINTNANNY_KEYS exists, skipping key generation"
else
    mkdir -p "$PRINTNANNY_KEYS"
    /usr/bin/printnanny config generate-keys --output="$PRINTNANNY_KEYS"
    echo "<4>printnanny-generator[$$]: Generated keys $PRINTNANNY_KEYS"
fi
