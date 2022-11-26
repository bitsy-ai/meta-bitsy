#!/bin/sh

set -e

#/ build.sh [--qemu]
#/
#/ Leverages docker to produce a Print Nanny image, optionally targeting qemu
#/ (untested) instead of the Raspberry Pi 4.

if ! command -v docker >/dev/null 2>&1; then
  echo "⛔ docker is required for build.sh, but it could not be found. please install docker and try again." >&2
  exit 1
fi

usage() {
  grep '^#/' "$0" | cut -c 4- >&2
  exit 1
}

MACHINE="raspberrypi4-64"
while [ "$#" -gt 0 ]; do
  case "$1" in
    --qemu) MACHINE=qemux86-64; shift ;;
    *) usage ;;
  esac
done

DOCKER_BUILDKIT=true docker build -t printnanny-yocto -f docker/Dockerfile .

docker run \
  --mount type=volume,source=printnanny-yocto-cache,destination=/poky/build/cache \
  --mount type=volume,source=printnanny-yocto-sscache,destination=/poky/build/sstate-cache \
  -e MACHINE="$MACHINE" \
  -it \
  printnanny-yocto \
    printnanny-release-image
