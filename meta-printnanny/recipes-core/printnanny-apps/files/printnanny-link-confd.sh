#!/usr/bin/env bash

set -euo pipefail

PRINTNANNY_DASH_CONFD="/run/systemd/system/printnanny-dash.service.d"
COOKIE_SECRET_FILE="cookie-secret.conf"
CHANGED="0"

if [ ! -f "$COOKIE_SECRET_FILE" ]; then
    SECRET=$(openssl rand -base64 32)
    echo "[Service]" > "${PRINTNANNY_DASH_CONFD}/${COOKIE_SECRET_FILE}"
    mkdir -p "$PRINTNANNY_DASH_CONFD"
    echo -n "$SECRET" | systemd-creds encrypt --name cookie-secret -p - - >> "${PRINTNANNY_DASH_CONFD}/${COOKIE_SECRET_FILE}"
    echo "<4>printnanny-generator[$$]: Created $COOKIE_SECRET_FILE"
    CHANGED="1"
fi

if [ "$CHANGED" == "1" ]; then
    systemctl daemon-reload
fi

FIX_PRINTNANNY_GROUP=(
    "/etc/printnanny"
)

for f in "${FIX_PRINTNANNY_GROUP[@]}"
do
    chmod -R u=rwx,g=rwx,o=rx "$f"
    chown -R :printnanny "$f"
done
