FILESEXTRAPATHS:append := "${THISDIR}/${PN}:"

SRC_URI += " \
    file://${MACHINE}/09-swupdate-args \
    file://${MACHINE}/swupdate.cfg \
"