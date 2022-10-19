SUMMARY = "NATS Server"
HOMEPAGE = "https://github.com/nats-io/nats-server"
LICENSE = "Apache-2"

SRC_URI = "\
    https://github.com/nats-io/nats-server/releases/download/v${PV}/nats-server-v${PV}-linux-arm64.zip \
"

SRC_URI[sha256sum] = "d35766ba020dd648dd2845499ac7fcb264876c796dde288bf454997e7b6bbb31"

do_install(){
    install -d "${D}${bindir}"
    cp "${WORKDIR}/nats-server" "${D}${bindir}/nats-server"
}