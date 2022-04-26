DESCRIPTION = "Janus is an open source, general purpose, WebRTC server designed and developed by Meetecho"
HOMEPAGE = "https://janus.conf.meetecho.com/"
SECTION = "libs/multimedia"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=c3707f19243459c077cf33ceb57e8c37"
SRC_URI = "https://github.com/meetecho/janus-gateway.git;branch=v${PV};rev=21a5fc91d2c508481b9173e474a8688d615fd580 \
	   file://janus-gateway.service \
"
SRC_URI[sha256sum] = "dbed415ead68d170febb1f66d42f35031eb34eef7558015c9ba1d79a73542e0b"

inherit autotools pkgconfig systemd

DEPENDS += "libsrtp jansson libconfig libnice openssl glib-2.0 gengetopt-native"
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

do_install:append() {
	install -d ${D}${systemd_unitdir}/system
	install -m 644 ${WORKDIR}/janus-gateway.service ${D}${systemd_unitdir}/system/
}

# FILES_${PN} += "${libdir}/janus/plugins/* ${libdir}/janus/transports/* ${libdir}/janus/events"
FILES_${PN}-events = "${libdir}/janus/events"
FILES_${PN}-plugins = "${libdir}/janus/plugins"
FILES_${PN}-demo = "${datadir}/janus/demos"
FILES_${PN}-js = "${datadir}/janus/javascript"
# PACKAGES += "FILES-${PN}-demo FILES-${PN}-js FILES-${PN}-events FILES-${PN}-plugins"

PACKAGES = "${PN}-dbg ${PN}-test ${PN} ${PN}-doc ${PN}-dev ${PN}-locale ${PN}-demo ${PN}-js"

SYSTEMD_SERVICE_${PN} = "janus-gateway.service"
SYSTEMD_AUTO_ENABLE = "enable"