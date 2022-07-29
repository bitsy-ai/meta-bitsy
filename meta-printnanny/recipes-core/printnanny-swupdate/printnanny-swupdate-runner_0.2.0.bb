LICENSE = "AGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"

SRC_URI = "\
	npm://registry.npmjs.org/;package=printnanny-swupdate-runner;version=${PV} \
"

S = "${WORKDIR}/npm"
inherit npm
