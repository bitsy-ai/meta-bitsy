#!/bin/sh

set -e

#/ build.sh [--qemu] [--shell] [<target>]
#/
#/ Leverages docker to produce a Print Nanny image, optionally targeting qemu
#/ (untested) instead of the Raspberry Pi 4.
#/
#/ --qemu    build an image that is usable on qemu and not physical hardware.
#/           this is probably broken.
#/
#/ --shell   drop you into a shell in the yocto environment rather than
#/           invoking bitbake

if ! command -v docker >/dev/null 2>&1; then
  echo "⛔ docker is required for build.sh, but it could not be found. please install docker and try again." >&2
  exit 1
fi

usage() {
  grep '^#/' "$0" | cut -c 4- >&2
  exit 1
}

MACHINE="raspberrypi4-64"
SHELL=""
TARGET="printnanny-release-image"
while [ "$#" -gt 0 ]; do
  case "$1" in
    --qemu) MACHINE=qemux86-64; shift ;;
    --shell) SHELL="$1"; TARGET=""; shift ;;
    -*) usage ;;
    *) TARGET="$1"; break ;;
  esac
done

DOCKER_BUILDKIT=true docker build -t printnanny-yocto -f docker/Dockerfile .

mkdir -p output

docker run \
  --mount type=volume,source=printnanny-yocto-cache,destination=/poky/build/cache \
  --mount type=volume,source=printnanny-yocto-downloads,destination=/poky/build/downloads \
  --mount type=volume,source=printnanny-yocto-sscache,destination=/poky/build/sstate-cache \
  --mount type=volume,source=printnanny-yocto-tmp,destination=/poky/build/tmp \
  --mount type=bind,source="$(pwd)/output",target=/output \
  ubuntu:22.04 \
  chown -R 999 /poky/build /output

docker run \
  --mount type=volume,source=printnanny-yocto-cache,destination=/poky/build/cache \
  --mount type=volume,source=printnanny-yocto-downloads,destination=/poky/build/downloads \
  --mount type=volume,source=printnanny-yocto-sscache,destination=/poky/build/sstate-cache \
  --mount type=volume,source=printnanny-yocto-tmp,destination=/poky/build/tmp \
  --mount type=bind,source="$(pwd)/output",target=/output \
  -e MACHINE="$MACHINE" \
  -it \
  ${SHELL:+--entrypoint=/bin/bash} \
  printnanny-yocto \
    ${TARGET:+"$TARGET"} || RC=$?

docker run \
  --mount type=bind,source="$(pwd)/output",target=/output \
  ubuntu:22.04 \
  chown -R "$(id -u)" /output

exit "${RC:-0}"
