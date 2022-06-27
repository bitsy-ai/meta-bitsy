#!/usr/bin/env bash

set -euo pipefail

JANUS_CONFD="/run/systemd/system/janus-gateway.service.d"
JANUS_ADMIN_FILE="janus-edge-admin-secret.conf"
JANUS_TOKEN_FILE="janus-edge-api-token.conf"

# share janus gateway admin/token with octoprint-env.service
OCTOPRINT_CONFD="/run/systemd/system/octoprint.service.d"

mkdir -p "$JANUS_CONFD"
mkdir -p "$OCTOPRINT_CONFD"

CHANGED="0"

# symlink janus admin and api tokens so printnanny can initialize webrtc sessions (via octoprint plugin)
if [ ! -f "${OCTOPRINT_CONFD}/${JANUS_ADMIN_FILE}" ]; then
    ln -s "${JANUS_CONFD}/${JANUS_ADMIN_FILE}" "${OCTOPRINT_CONFD}/${JANUS_ADMIN_FILE}"
    CHANGED="1"
fi

if [ ! -f "${OCTOPRINT_CONFD}/${JANUS_TOKEN_FILE}" ]; then
    ln -s "${JANUS_CONFD}/${JANUS_ADMIN_FILE}" "${OCTOPRINT_CONFD}/${JANUS_TOKEN_FILE}"
    CHANGED="1"
fi

if [ "$CHANGED" == "1" ]; then
    systemctl daemon-reload
fi
