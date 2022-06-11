DESCRIPTION = "Models intended for use with Nnstreamer or TF Lite API"
LICENSE = "AGPLv3+"
HOMEPAGE = "https://printnanny.ai"

LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"
SRC_URI = "\
    https://cdn.print-nanny.com/ml/print3d_20201101015829/model.tflite \
    https://cdn.print-nanny.com/ml/print3d_20201101015829/dict.txt \
    https://cdn.print-nanny.com/ml/print3d_20201101015829/tflite_metadata.json \
"
do_install(){
    install -d ${D}${datadir}/printnanny/model
    install -d ${D}${bindir}
    install -m 0644 ${WORKDIR}/model.tflite ${D}${datadir}/printnanny/model/model.tflite
    install -m 0644 ${WORKDIR}/dict.txt ${D}${datadir}/printnanny/model/dict.txt
    instal -m 0644 ${WORKDIR}/tflite_metadata.json ${D}${datadir}/printnanny/model/dict.txt
    install -m 0755 ${WORKDIR}/nnstreamer-rtph264pay.sh ${D}${bindir}/nnstreamer-rtph264pay
}

FILES:${PN} = "${datadir} ${bindir}"
RDEPENDS:${PN} = "nnstreamer"
