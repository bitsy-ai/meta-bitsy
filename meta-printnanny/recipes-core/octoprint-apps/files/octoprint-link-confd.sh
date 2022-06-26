#!/usr/bin/env bash

set -euo pipefail

JANUS_CONFD="/run/systemd/system/janus-gateway.service.d"
JANUS_ADMIN_FILE="janus-edge-admin-secret.conf"
JANUS_TOKEN_FILE="janus-edge-api-token.conf"

# share janus gateway admin/token with octoprint-env.service
OCTOPRINT_CONFD="/run/systemd/system/octoprint-env.service.d"

mkdir -p "$JANUS_CONFD"
mkdir -p "$OCTOPRINT_CONFD"

# symlink janus admin and api tokens so printnanny can initialize webrtc sessions (via octoprint plugin)
ln -s "${JANUS_CONFD}/${JANUS_ADMIN_FILE}" "${OCTOPRINT_CONFD}/${JANUS_ADMIN_FILE}"
ln -s "${JANUS_CONFD}/${JANUS_TOKEN_FILE}" "${OCTOPRINT_CONFD}/${JANUS_TOKEN_FILE}"
