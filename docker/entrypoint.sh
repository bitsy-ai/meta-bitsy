#!/usr/bin/bash

set -e

cd /poky

source oe-init-build-env /poky/build

exec bitbake "$@"
