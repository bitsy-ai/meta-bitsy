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
    echo "<4>printnanny-generator[$$]: Created $COOKIE_SECRET_FILE"
fi

# symlink janus admin and api tokens so printnanny can initialize webrtc sessions
ln -s "${JANUS_CONFD}/${JANUS_ADMIN_FILE}" "${PRINTNANNY_DASH_CONFD}/${JANUS_ADMIN_FILE}"
ln -s "${JANUS_CONFD}/${JANUS_TOKEN_FILE}" "${PRINTNANNY_DASH_CONFD}/${JANUS_TOKEN_FILE}"

# quick fix for Raspberry Pi userland expecting video group w/ 0660
FIX_VIDEO_GROUP=(
    "/dev/rpivid-h264mem"
    "/dev/rpivid-hevcmem"
    "/dev/rpivid-intcmem"
    "/dev/rpivid-vp9mem"
    "/dev/v4l-subdev0"
    "/dev/vchiq"
    "/dev/vcio"
    "/dev/vcsm-cma"
)

for f in "${FIX_VIDEO_GROUP[@]}"
do
    echo "Changing group ownership of $f to root:video"
    chown :video "$f"
    chmod 660 "$f"
done

FIX_PRINTNANNY_GROUP=(
    "/etc/printnanny"
)

for f in "${FIX_PRINTNANNY_GROUP[@]}"
do
    chmod -R u=rwx,g=rwx,o=rx "$f"
    chown -R :printnanny "$f"
done
