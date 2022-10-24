DESCRIPTION = "A command line utility to interact with and manage NATS."
HOMEPAGE = "https://github.com/nats-io/natscli"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRC_URI = "\
    https://github.com/nats-io/natscli/releases/download/v${PV}/nats-${PV}-linux-arm64.zip \
"
SRC_URI[sha256sum] = "a8a1d3f42d460bd5ac5407f78a4ceda1d731ee8bd363efc9b808d8b592c65fb6"

do_install() {
    install -d "${D}${bindir}"
    install -m 0755 "${WORKDIR}/nats-${PV}-linux-arm64/nats" "${D}${bindir}/nats"
}

# The build is release mode (pre-stripped)
INSANE_SKIP:${PN} = "already-stripped"

FILES:${PN} = "${bindir}/nats"
