#!/usr/bin/env bash

set -euo pipefail

JANUS_CONFD="/run/systemd/system/janus-gateway.service.d"
JANUS_ADMIN_FILE="janus-edge-admin-secret.conf"
JANUS_TOKEN_FILE="janus-edge-api-token.conf"

# cookie secret is used by printnanny-dash to encrypt cookie data
PRINTNANNY_DASH_CONFD="/run/systemd/system/printnanny-dash.service.d"
COOKIE_SECRET_FILE="cookie-secret.conf"

mkdir -p "$PRINTNANNY_DASH_CONFD"
mkdir -p "$JANUS_CONFD"

if [ -f "$COOKIE_SECRET_FILE" ]; then
    echo "<6>printnanny-generator[$$]: $COOKIE_SECRET_FILE exists, skipping credential generation"
else
    SECRET=$(openssl rand -base64 32)
    echo "[Service]" > "${PRINTNANNY_DASH_CONFD}/${COOKIE_SECRET_FILE}"
    echo -n "$SECRET" | systemd-creds encrypt --name cookie-secret -p - - >> "${PRINTNANNY_DASH_CONFD}/${COOKIE_SECRET_FILE}"
    echo "<4>printnanny-generator[$$]: Created $COOKIE_SECRET_FILE" > /dev/kmsg
fi

# symlink janus admin and api tokens so printnanny can initialize webrtc sessions
ln -s "${JANUS_CONFD}/${JANUS_ADMIN_FILE}" "${PRINTNANNY_CONFD}/${JANUS_ADMIN_FILE}"
ln -s "${JANUS_CONFD}/${JANUS_TOKEN_FILE}" "${PRINTNANNY_CONFD}/${JANUS_TOKEN_FILE}"
