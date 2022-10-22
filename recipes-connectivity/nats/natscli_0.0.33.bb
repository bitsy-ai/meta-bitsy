DESCRIPTION = "A command line utility to interact with and manage NATS."
HOMEPAGE = "https://github.com/nats-io/natscli"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRC_URI = "\
    https://github.com/nats-io/natscli/releases/download/v${PV}/nats-${PV}-linux-arm64.zip \
"
SRC_URI[sha256sum] = "b7c523c4bde007d29c6b4247a9d2f16fe84727ff945b3a0d53ef2889c783e477"

do_install() {
    install -d "${D}${bindir}"
    install -m 0755 "${WORKDIR}/nats-${PV}-linux-arm64/nats" "${D}${bindir}/nats"
}

# The build is release mode (pre-stripped)
INSANE_SKIP:${PN} = "already-stripped"

FILES:${PN} = "${bindir}/nats"