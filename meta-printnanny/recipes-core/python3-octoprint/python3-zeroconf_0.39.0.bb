
SUMMARY = "Pure Python Multicast DNS Service Discovery Library (Bonjour/Avahi compatible)"
HOMEPAGE = "https://github.com/jstasiak/python-zeroconf"
AUTHOR = "Paul Scott-Murphy, William McBrine, Jakub Stasiak <>"
LICENSE = "LGPL-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=3bb705b228ea4a14ea2728215b780d80"

SRC_URI = "https://files.pythonhosted.org/packages/2b/a5/0ad52f3dd265fd2538b882eb6682eaeee12d2ba4dd55a20ac65374bbf67d/zeroconf-0.39.0.tar.gz"
SRC_URI[md5sum] = "121775ac7f785a19782b278c9d4d9604"
SRC_URI[sha256sum] = "7c0d8257b940ee43e637fb560c2f9bd79da0638f37af162eb4f506f7274ef8e4"

S = "${WORKDIR}/zeroconf-0.39.0"

RDEPENDS_${PN} = "python3-async-timeout python3-ifaddr"

inherit setuptools3
