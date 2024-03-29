DESCRIPTION = "Janus is an open source, general purpose, WebRTC server designed and developed by Meetecho"
HOMEPAGE = "https://janus.conf.meetecho.com/"
SECTION = "libs/multimedia"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=c3707f19243459c077cf33ceb57e8c37"
SRC_URI = "\
	git://github.com/meetecho/janus-gateway.git;protocol=https;branch=master \
	file://janus-gateway.service \
	file://janus.jcfg \
	file://janus.plugin.streaming.jcfg \
	file://janus.transport.http.jcfg \
	file://janus.transport.websockets.jcfg \
	file://janus.plugin.recordplay.jcfg \
	file://janus-envsubst-on-templates.sh \
"
# v1.1.1 + a few patches
PV = "1.1.3+git${SRCPV}"
SRCREV = "963c4b6685ae3ab50265ee67167692986b3280ea"
S = "${WORKDIR}/git"

inherit autotools pkgconfig systemd

DEPENDS += "libsrtp jansson libconfig libnice glib-2.0 gengetopt-native openssl"

PACKAGECONFIG ?= "rest_api rest websockets plugin_videoroom plugin_streaming"
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
PACKAGECONFIG[plugin_streaming] = "--enable-plugin-streaming,--disable-plugin-streaming,"
PACKAGECONFIG[websockets] = "--enable-websockets,--disable-websockets,libwebsockets"

do_install:append() {
	install -d ${D}${systemd_unitdir}/system
	install -d ${D}${sysconfdir}/janus/templates
	install -d ${D}${libdir}/janus/plugins
	install -d ${D}${libdir}/janus/transports
	install -d ${D}${libdir}/janus/events
	install -d ${D}${libdir}/janus/loggers
	install -m 0644 ${WORKDIR}/janus-gateway.service ${D}${systemd_unitdir}/system/
	install -m 0644 ${WORKDIR}/janus.jcfg ${D}${sysconfdir}/janus/janus.jcfg
	install -m 0644 ${WORKDIR}/janus.plugin.streaming.jcfg ${D}${sysconfdir}/janus/janus.plugin.streaming.jcfg
	install -m 0644 ${WORKDIR}/janus.plugin.recordplay.jcfg ${D}${sysconfdir}/janus/janus.plugin.recordplay.jcfg
	install -m 0644 ${WORKDIR}/janus.transport.http.jcfg ${D}${sysconfdir}/janus/janus.transport.http.jcfg
	install -m 0644 ${WORKDIR}/janus.transport.websockets.jcfg ${D}${sysconfdir}/janus/janus.transport.websockets.jcfg
	install -m 0755 ${WORKDIR}/janus-envsubst-on-templates.sh ${D}${bindir}/janus-envsubst-on-templates
}

FILES:${PN} += "${nonarch_libdir}/janus/plugins/ ${libdir}/janus ${sysconfdir}/janus"
FILES:${PN}-demo = "${datadir}/janus/demos ${datadir}/janus"
FILES:${PN}-js = "${datadir}/janus/javascript"
PACKAGES = "${PN}-dbg ${PN}-test ${PN} ${PN}-doc ${PN}-dev ${PN}-locale ${PN}-demo ${PN}-js"

# ignore QA Errors about symlinking unversioned .so
# ideally this would be fixed in janus package
INSANE_SKIP:${PN} = "dev-so"

SYSTEMD_SERVICE:${PN} = "janus-gateway.service"
SYSTEMD_AUTO_ENABLE = "enable"
RDEPENDS:${PN} = "curl bash"
