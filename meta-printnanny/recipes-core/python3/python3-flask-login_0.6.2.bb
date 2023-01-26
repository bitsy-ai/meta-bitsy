
SUMMARY = "User authentication and session management for Flask."
HOMEPAGE = "https://github.com/maxcountryman/flask-login"
AUTHOR = "Matthew Frazier <leafstormrush@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8aa87a1cd9fa41d969ad32cfdac2c596"

SRC_URI = "https://files.pythonhosted.org/packages/cc/da/eae45ba9ec58af45b46ef94c6ca04fb211ee57c06421b696e894eb11b064/Flask-Login-0.6.2.tar.gz"
SRC_URI[md5sum] = "8020b22ad7ec6f17034f90117a520633"
SRC_URI[sha256sum] = "c0a7baa9fdc448cdd3dd6f0939df72eec5177b2f7abe6cb82fc934d29caac9c3"

S = "${WORKDIR}/Flask-Login-0.6.2"

RDEPENDS:${PN} = "python3-flask python3-werkzeug"

inherit setuptools3

BBCLASSEXTEND = "native nativesdk"
