DESCRIPTION = "PrintNanny Neural Network"
HOMEPAGE = "https://printnanny.ai/"
LICENSE = "AGPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"

SRC_URI += "\
    https://cdn.print-nanny.com/ml/print3d_20201101015829/model.tflite;name=model \
    https://cdn.print-nanny.com/ml/print3d_20201101015829/tflite_metadata.json;name=metadata \
    file://labels.txt \
"

PV = "20201101015829"
SRC_URI[model.sha256sum] = "b67ee7befefe10e20bf62986baf5e800a939359566db7c7a881f58ab568a265d"
SRC_URI[metadata.sha256sum] = "be8328a11f244065eed0b3579fb27048df95d39a89971a58f8f005cd6b7430ed"

do_install(){
    install -d ${D}${datadir}/printnanny/model
    install -m 0644 ${WORKDIR}/model.tflite ${D}${datadir}/printnanny/model/model.tflite
    install -m 0644 ${WORKDIR}/labels.txt ${D}${datadir}/printnanny/model/labels.txt
    install -m 0644 ${WORKDIR}/tflite_metadata.json ${D}${datadir}/printnanny/model/tflite_metadata.json
}

FILES:${PN} = "${datadir}/printnanny"
