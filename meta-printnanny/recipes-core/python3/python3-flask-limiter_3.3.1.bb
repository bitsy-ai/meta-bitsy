
SUMMARY = "Rate limiting for flask applications"
HOMEPAGE = "https://flask-limiter.readthedocs.org"
AUTHOR = "Ali-Akber Saifee <ali@indydevs.org>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2455d5e574bc0fc489411ca45766ac78"

SRC_URI = "https://files.pythonhosted.org/packages/df/e6/c6bd77d7da0ba39ca364a233d30cb4c1da0a69d77bb1914aa8811ceef5c3/Flask-Limiter-3.3.1.tar.gz"
SRC_URI[md5sum] = "63ea3b1ab2f417b194cf93e3e89a4662"
SRC_URI[sha256sum] = "2b99fec0cfc44f490bd729da52bb89c5c4158f38812d0f3854c01d0a83664923"

S = "${WORKDIR}/Flask-Limiter-3.3.1"

RDEPENDS:${PN} = "python3-limits python3-flask python3-ordered-set python3-rich python3-typing-extensions"

inherit setuptools3
