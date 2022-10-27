#!/bin/bash

set -xeuo pipefail

sha256sum "$IMAGE_NAME.swu" >> "$IMAGE_NAME.sha256sums.txt"
sha256sum "$IMAGE_NAME.rootfs.wic.bmap" >> "$IMAGE_NAME.sha256sums.txt"
sha256sum "$IMAGE_NAME.rootfs.wic.gz" >> "$IMAGE_NAME.sha256sums.txt"
sha256sum "$IMAGE_NAME.rootfs.manifest" >> "$IMAGE_NAME.sha256sums.txt"

gpg --sign "$IMAGE_NAME.sha256sums.txt"
