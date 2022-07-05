#!/bin/sh

# temporary default octoprint config setter
# to be replaced by:
# $ printnanny config octprint-defaults

PYTHON="/home/printnanny/.octoprint/.venv/bin/python"
BASEDIR="/home/printnanny/.octoprint"

WEBCAM_STREAM=$($PYTHON -m octoprint --config "$BASEDIR/config.yaml" config get webcam.stream)

if [ "$WEBCAM_STREAM" = "None" ]; then
    $PYTHON -m octoprint  --config "$BASEDIR/config.yaml" config set webcam.stream "http://${HOSTNAME}.local/cam/hls/playlist.m3u8"
fi
