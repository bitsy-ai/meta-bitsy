
SUMMARY = "Python parser for the CommonMark Markdown spec"
HOMEPAGE = "https://github.com/rtfd/commonmark.py"
AUTHOR = "Bibek Kafle <bkafle662@gmail.com>, Roland Shoemaker <rolandshoemaker@gmail.com> <rolandshoemaker@gmail.com>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=37e127eb75a030780aefcfc584e78523"

SRC_URI = "https://files.pythonhosted.org/packages/60/48/a60f593447e8f0894ebb7f6e6c1f25dafc5e89c5879fdc9360ae93ff83f0/commonmark-0.9.1.tar.gz"
SRC_URI[md5sum] = "cd1dc70c4714d9ed4117a40490c25e00"
SRC_URI[sha256sum] = "452f9dc859be7f06631ddcb328b6919c67984aca654e5fefb3914d54691aed60"

S = "${WORKDIR}/commonmark-0.9.1"

RDEPENDS:${PN} = ""

inherit setuptools3
