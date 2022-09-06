DESCRIPTION = "A strictly RFC 4510 conforming LDAP V3 pure Python client library"
HOMEPAGE = "https://github.com/cannatag/ldap3"
LICENSE = "GPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9a79418f241689e78034391d51162d24"

PYPI_PACKAGE = "ldap3"
SRC_URI[sha256sum] = "f3e7fc4718e3f09dda568b57100095e0ce58633bcabbed8667ce3f8fbaa4229f"

inherit pypi setuptools3
BBCLASSEXTEND = "native nativesdk"
