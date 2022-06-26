
SUMMARY = "Pure Python Multicast DNS Service Discovery Library (Bonjour/Avahi compatible)"
HOMEPAGE = "https://github.com/jstasiak/python-zeroconf"
AUTHOR = "Paul Scott-Murphy, William McBrine, Jakub Stasiak <>"
LICENSE = "LGPL-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=3bb705b228ea4a14ea2728215b780d80"

SRC_URI = "https://files.pythonhosted.org/packages/81/e9/bbe4a07e2f8c0451ce597279599cee9948bd000f0adb43cc0469b402aebe/zeroconf-0.34.3.tar.gz"
SRC_URI[md5sum] = "3e052f87ba019660c2ead615bf158c50"
SRC_URI[sha256sum] = "145e67c182d361b350f057fb9240dedec5e79a7c61f465a01138d4a49a4b87b3"

# Could not initialize settings manager: The 'zeroconf<0.34,>=0.33' distribution was not found
S = "${WORKDIR}/zeroconf-0.34.3"

RDEPENDS:${PN} = "python3-ifaddr"

inherit setuptools3
