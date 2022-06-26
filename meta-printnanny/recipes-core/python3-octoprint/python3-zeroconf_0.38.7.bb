
SUMMARY = "Pure Python Multicast DNS Service Discovery Library (Bonjour/Avahi compatible)"
HOMEPAGE = "https://github.com/jstasiak/python-zeroconf"
AUTHOR = "Paul Scott-Murphy, William McBrine, Jakub Stasiak <>"
LICENSE = "LGPL-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=3bb705b228ea4a14ea2728215b780d80"

SRC_URI = "https://files.pythonhosted.org/packages/5d/3f/25d4da0ada92e618a903d0a5d5e096d84b78050c5cb90ad8691a53e8692b/zeroconf-0.38.7.tar.gz"
SRC_URI[md5sum] = "21f8b51edccc56529404e2185c26b40f"
SRC_URI[sha256sum] = "eaee2293e5f4e6d249f6155f9d3cca1668cb22b2545995ea72c6a03b4b7706d4"

S = "${WORKDIR}/zeroconf-0.38.7"

RDEPENDS:${PN} = "python3-ifaddr"

inherit setuptools3
