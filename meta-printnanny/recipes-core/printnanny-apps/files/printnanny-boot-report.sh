#!/bin/sh

set -eu

# https://www.freedesktop.org/software/systemd/man/systemctl.html#is-system-running
SYSTEM_STATUS=$(systemctl is-system-running)

echo "systemctl is-system-running: $SYSTEM_STATUS"

# if SYSTEM_STATUS is "starting" | "initializing" | exit 1 - wrapper service will retry in n seconds
# boot-started event was sent in printnanny-init.service
if [ "$SYSTEM_STATUS" = "starting" ] || [ "$SYSTEM_STATUS" = "initializing" ]; then
    exit 1
fi


# if SYSTEM_STATUS is "running", exit 0 after sending status event
if [ "$SYSTEM_STATUS" = "running" ]; then
    /usr/bin/printnanny -v nats-publisher "pi.{pi_id}.status.boot" --event-type=boot-success
    exit 0
fi

# if SYSTEM_STATUS is "degraded",  exit 0 after sending status event
if [ "$SYSTEM_STATUS" = "degraded" ]; then
    /usr/bin/printnanny -v nats-publisher "pi.{pi_id}.status.boot" --event-type=boot-degraded
    exit 0
fi
