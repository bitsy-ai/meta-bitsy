SUMMARY = "PrintNanny x OctoPrint event models"
HOMEPAGE = "https://github.com/bitsy-ai/printnanny-asyncapi-schema"
AUTHOR = "Leigh Johnson <leigh@printnanny.ai>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=73f1eb20517c55bf9493b7dd6e480788"

SRC_URI = "https://files.pythonhosted.org/packages/c9/4d/24cc6102dab3970c3976b1dbaae7709a43cdada47a728373122e633bd404/printnanny-octoprint-models-0.1.3.tar.gz"
SRC_URI[sha256sum] = "aa1bff553fe412689d1e9940163094f58c29ba6078dbee8eefdea2665ca09ce7"

S = "${WORKDIR}/printnanny-octoprint-models-${PV}"

RDEPENDS:${PN} = ""

inherit python_pep517
BBCLASSEXTEND = "native nativesdk"
