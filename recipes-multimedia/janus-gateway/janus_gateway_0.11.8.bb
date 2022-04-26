DESCRIPTION = "Janus is an open source, general purpose, WebRTC server designed and developed by Meetecho"
HOMEPAGE = "https://janus.conf.meetecho.com/"
SECTION = "libs/multimedia"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;sha256=91d04c97fa1da3fcd28205873276358aafc071c5b00a9ea8c49dd06d487a9dc6"

SRC_URI = "https://github.com/meetecho/janus-gateway/archive/v${PV}.tar.gz \
	   file://janus-gateway.service \
"

SRC_URI[sha256sum] = "01ddaf204203a1219dd46a5ce70b548bab75bc494c9ba05429f8fb1e786b2995"

inherit pkgconfig systemd

DEPENDS = "libsrtp jansson libconfig libnice openssl glib-2.0"

PACKAGECONFIG ?= "rest_api rest"
#PACKAGECONFIG[disablewarnings] = "--disable-warnings-as-errors,,"
PACKAGECONFIG[inet] = "--enable-inet,--disable-inet,"
PACKAGECONFIG[inet6] = "--enable-inet6,--disable-inet6,"
PACKAGECONFIG[mqtt] = "--enable-mqtt,--disable-mqtt,paho.mqtt.c"
PACKAGECONFIG[rabbitmq] = "--enable-rabbitmq,--disable-rabbitmq,rabbitmq-c"
PACKAGECONFIG[rest_api] = "--enable-turn-rest-api,--disable-turn-rest-api,curl"
PACKAGECONFIG[rest] = "--enable-rest,--disable-rest,libmicrohttpd"
PACKAGECONFIG[unix_sockets] = "--enable-unix-sockets,--disable-unix-sockets,"
PACKAGECONFIG[post_processing] = "--enable-post-processing,--disable-post-processing,"
PACKAGECONFIG[plugin_echo] = "--enable-plugin-echotest,--disable-plugin-echotest,"
PACKAGECONFIG[plugin_videocall] = "--enable-plugin-videocall,--disable-plugin-videocall,"
PACKAGECONFIG[plugin_nosip] = "--enable-plugin-nosip,--disable-plugin-nosip,"
PACKAGECONFIG[plugin_videoroom] = "--enable-plugin-videoroom,--disable-plugin-videoroom,"
PACKAGECONFIG[plugin_voicemail] = "--enable-plugin-voicemail,--disable-plugin-voicemail,"
PACKAGECONFIG[plugin_recordplay] = "--enable-plugin-recordplay,--disable-plugin-recordplay,"
PACKAGECONFIG[plugin_textroom] = "--enable-plugin-textroom,--disable-plugin-textroom,"
PACKAGECONFIG[websockets] = "--enable-websockets,--disable-websockets,libwebsockets"

FILES_${PN}:append = " ${libdir}/janus/plugins/* ${libdir}/janus/transports/* ${libdir}/janus/events"
FILES_${PN}-demo = "${datadir}/janus/*"

PACKAGES:append = " ${PN}-demo"

INSANE_SKIP_${PN} = "dev-so"

SYSTEMD_SERVICE_${PN} = "janus-gateway.service"

do_install:append() {
	# Install the systemd service so we can kick start on boot
	install -d ${D}${systemd_unitdir}/system
	install -m 644 ${WORKDIR}/janus-gateway.service ${D}${systemd_unitdir}/system/
}