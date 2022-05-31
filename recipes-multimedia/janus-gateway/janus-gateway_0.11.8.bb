DESCRIPTION = "Janus is an open source, general purpose, WebRTC server designed and developed by Meetecho"
HOMEPAGE = "https://janus.conf.meetecho.com/"
SECTION = "libs/multimedia"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=c3707f19243459c077cf33ceb57e8c37"
SRC_URI = "https://github.com/meetecho/janus-gateway/archive/v${PV}.tar.gz \
	   file://janus-gateway.service \
"
SRC_URI[sha256sum] = "2b065c5feaec9e40b2310b97cf598bb53346b326bdad73f57b3de319eb0fc65f"
SRC_REV = "0.11.8"

inherit autotools pkgconfig systemd

DEPENDS += "libsrtp jansson libconfig libnice openssl glib-2.0 gengetopt-native"
PACKAGECONFIG ?= "rest_api rest"
PACKAGECONFIG[datachannels] = "--enable-data-channels,--disable-data-channels,usrsctp"
PACKAGECONFIG[mqtt] = "--enable-mqtt,--disable-mqtt,paho.mqtt.c"
PACKAGECONFIG[nanomsg] = "--enable-nanomsg,--disable-nanomsg,libnanomsg"
PACKAGECONFIG[rabbitmq] = "--enable-rabbitmq,--disable-rabbitmq,rabbitmq-c"
PACKAGECONFIG[rest_api] = "--enable-turn-rest-api,--disable-turn-rest-api,curl"
PACKAGECONFIG[rest] = "--enable-rest,--disable-rest,libmicrohttpd"
PACKAGECONFIG[systemd_sockets] = "--enable-systemd-sockets,--disable-systemd-sockets"
PACKAGECONFIG[unix_sockets] = "--enable-unix-sockets,--disable-unix-sockets,"
PACKAGECONFIG[post_processing] = "--enable-post-processing,--disable-post-processing,"
PACKAGECONFIG[plugin_echo] = "--enable-plugin-echotest,--disable-plugin-echotest,"
PACKAGECONFIG[plugin_videocall] = "--enable-plugin-videocall,--disable-plugin-videocall,"
PACKAGECONFIG[plugin_nosip] = "--enable-plugin-nosip,--disable-plugin-nosip,"
PACKAGECONFIG[plugin_videoroom] = "--enable-plugin-videoroom,--disable-plugin-videoroom,"
PACKAGECONFIG[plugin_voicemail] = "--enable-plugin-voicemail,--disable-plugin-voicemail,"
PACKAGECONFIG[plugin_recordplay] = "--enable-plugin-recordplay,--disable-plugin-recordplay,"
PACKAGECONFIG[plugin_textroom] = "--enable-plugin-textroom,--disable-plugin-textroom,"
PACKAGECONFIGF[websockets] = "--enable-websockets,--disable-websockets,libwebsockets"

do_install:append() {
	install -d ${D}${systemd_unitdir}/system
	install -m 644 ${WORKDIR}/janus-gateway.service ${D}${systemd_unitdir}/system/
}

FILES:${PN} += "${nonarch_libdir}/janus/plugins/ ${libdir}/janus/transports ${libdir}/janus/events"
FILES:${PN}-demo = "${datadir}/janus/demos ${datadir}/janus"
FILES:${PN}-js = "${datadir}/janus/javascript"
PACKAGES = "${PN}-dbg ${PN}-test ${PN} ${PN}-doc ${PN}-dev ${PN}-locale ${PN}-demo ${PN}-js"

# ignore QA Errors about symlinking unversioned .so
# ideally this would be fixed in janus package
INSANE_SKIP:${PN} = "dev-so"

SYSTEMD_SERVICE:${PN} = "janus-gateway.service"
SYSTEMD_AUTO_ENABLE = "enable"
