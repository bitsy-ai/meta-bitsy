
SUMMARY = "Internationalization utilities"
HOMEPAGE = "https://babel.pocoo.org/"
AUTHOR = "Armin Ronacher <armin.ronacher@active-4.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1b3f4650099e6d6a73e5a7fc8774ff18"

SRC_URI = "https://files.pythonhosted.org/packages/23/a6/a616817c8e4fb1a69f7e8aae9fc7fce1a147e1a492f45b6fa0b7d6823178/Babel-2.10.1.tar.gz"
SRC_URI[md5sum] = "a846a22016ee41db5d864ec399acc8f8"
SRC_URI[sha256sum] = "98aeaca086133efb3e1e2aad0396987490c8425929ddbcfe0550184fdc54cd13"

S = "${WORKDIR}/Babel-2.10.1"

RDEPENDS:${PN} = "python3-pytz"

inherit setuptools3
