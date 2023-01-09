
SUMMARY = "Pure Python Multicast DNS Service Discovery Library (Bonjour/Avahi compatible)"
HOMEPAGE = "https://github.com/jstasiak/python-zeroconf"
AUTHOR = "Paul Scott-Murphy, William McBrine, Jakub Stasiak <>"
LICENSE = "LGPL-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=3bb705b228ea4a14ea2728215b780d80"

SRC_URI = "https://files.pythonhosted.org/packages/f5/4f/c47cea73d7ae5467b63de3999d7207fd5b14d70cb2f35ce81c4ab7d7a52e/zeroconf-0.39.4.tar.gz"
SRC_URI[md5sum] = "f85fb9d239397b53836495fd49b85e5f"
SRC_URI[sha256sum] = "701e4d697f89fe952aa9c13a512ed6bf472dcf4f0a6d275e71085604b3882295"

S = "${WORKDIR}/zeroconf-0.39.4"

RDEPENDS:${PN} = "python3-async-timeout python3-ifaddr"

inherit setuptools3
BBCLASSEXTEND = "native nativesdk"
