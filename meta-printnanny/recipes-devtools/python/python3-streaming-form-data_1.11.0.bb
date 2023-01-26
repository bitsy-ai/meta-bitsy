DESCRIPTION = "Streaming multipart/form-data parser"
HOMEPAGE = "https://github.com/siddhantgoel/streaming-form-data"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=22a7a7da7be1c4544de7cc0dd7745cc1"

PYPI_PACKAGE = "streaming-form-data"
SRC_URI[sha256sum] = "202cea84200e8d412dd22b3ae522e1896a8a7d041aae809278b003b64ed1712b"
inherit pypi setuptools3
BBCLASSEXTEND = "native nativesdk"
