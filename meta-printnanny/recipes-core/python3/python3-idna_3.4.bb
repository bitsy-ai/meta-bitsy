
SUMMARY = "Internationalized Domain Names in Applications (IDNA)"
HOMEPAGE = "None"
AUTHOR = "None <Kim Davies <kim@cynosure.com.au>>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=239668a7c6066d9e0c5382e9c8c6c0e1"

SRC_URI = "https://files.pythonhosted.org/packages/8b/e1/43beb3d38dba6cb420cefa297822eac205a277ab43e5ba5d5c46faf96438/idna-3.4.tar.gz"
SRC_URI[md5sum] = "13ea24e076212b6baae1135a116d1e0e"
SRC_URI[sha256sum] = "814f528e8dead7d329833b91c5faa87d60bf71824cd12a7530b5526063d02cb4"

S = "${WORKDIR}/idna-3.4"

RDEPENDS:${PN} = ""

inherit setuptools3
