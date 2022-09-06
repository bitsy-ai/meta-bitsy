DESCRIPTION = "A simple wrapper around inotify. No fancy bells and whistles, just a literal wrapper with ctypes. Under 100 lines of code!"
HOMEPAGE = "https://github.com/chrisjbillington/inotify_simple"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=153d07ef052c4a37a8fac23bc6031972"

PYPI_PACKAGE = "inotify_simple"
SRC_URI[sha256sum] = "8440ffe49c4ae81a8df57c1ae1eb4b6bfa7acb830099bfb3e305b383005cc128"

inherit pypi setuptools3
BBCLASSEXTEND = "native nativesdk"
