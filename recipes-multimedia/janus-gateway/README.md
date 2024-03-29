# Janus WebRTC Gateway

The **janus** recipe builds [Janus WebRTC Gateway](https://github.com/meetecho/janus-gateway) for [Embedded Linux](https://elinux.org) built with [OpenEmbedded](https://www.openembedded.org) and [Yocto Project](https://www.yoctoproject.org/) build frameworks.

### Supported Yocto Project Releases

<table>
<tr><th>Release branch <a href="https://wiki.yoctoproject.org/wiki/Releases" target="none" title="What is this?">(?)</a></th><th>Layer integrity check <a href="https://www.yoctoproject.org/docs/2.5/dev-manual/dev-manual.html#making-sure-your-layer-is-compatible-with-yocto-project" target="none" title="What is this?">(?)</a></th></tr>
<tr><td>honister 3.4.x</td><td>🚧</td></tr>
</table>

### Dependencies
[Janus WebRTC Gateway](https://github.com/meetecho/janus-gateway) 

Base dependencies:

* [https://github.com/openembedded/meta-openembedded](meta-openembedded/meta-python)
* [https://github.com/openembedded/meta-openembedded](meta-openembedded/meta-oe)
* [https://github.com/openembedded/meta-openembedded](meta-openembedded/meta-multimedia)

Optional dependencies:

Besides the base dependencies, some optional features require additional dependencies. See `meta-janus-gateway/recipes-multimedia/janus-gateway/janus_gateway_0.${VERSION}` for description of optional dependencies.

```
PACKAGECONFIG ?= "rest_api rest"
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
```

See https://github.com/meetecho/janus-gateway/blob/master/configure.ac for more information about build configuration options.
