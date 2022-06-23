DESCRIPTION = "Janus is an open source, general purpose, WebRTC server designed and developed by Meetecho"
HOMEPAGE = "https://janus.conf.meetecho.com/"
SECTION = "libs/multimedia"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=c3707f19243459c077cf33ceb57e8c37"
SRC_URI = "\
	https://github.com/meetecho/janus-gateway/archive/v${PV}.tar.gz \
	file://janus-gateway.service \
	file://janus.jcfg.template \
	file://janus.plugin.streaming.jcfg \
	file://janus.transport.http.jcfg \
	file://janus.transport.websockets.jcfg \
	file://janus-envsubst-on-templates.sh \
	file://janus-add-token.sh \
	file://janus-gateway-generator.sh \
"
SRC_URI[sha256sum] = "a1ca0ae787fa162a36b4e391c29ae81f9388c3077699fb7b7c054149a5503355"
SRC_REV = "1.0.2"

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
	install -d "${D}${systemd_unitdir}/system-generators"
	install -m 0755 "${WORKDIR}/janus-gateway-generator.sh" "${D}${systemd_unitdir}/system-generators/janus-gateway-generator"
	install -m 0644 ${WORKDIR}/janus-gateway.service ${D}${systemd_unitdir}/system/
	install -m 0644 ${WORKDIR}/janus.jcfg.template ${D}${sysconfdir}/janus/templates/janus.jcfg.template
	install -m 0644 ${WORKDIR}/janus.plugin.streaming.jcfg ${D}${sysconfdir}/janus/janus.plugin.streaming.jcfg
	install -m 0644 ${WORKDIR}/janus.transport.http.jcfg ${D}${sysconfdir}/janus/janus.transport.http.jcfg
	install -m 0644 ${WORKDIR}/janus.transport.websockets.jcfg ${D}${sysconfdir}/janus/janus.transport.websockets.jcfg
	install -m 0755 ${WORKDIR}/janus-envsubst-on-templates.sh ${D}${bindir}/janus-envsubst-on-templates
	install -m 0755 ${WORKDIR}/janus-add-token.sh ${D}${bindir}/janus-add-token
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
RDEPENDS:${PN} = "curl"
