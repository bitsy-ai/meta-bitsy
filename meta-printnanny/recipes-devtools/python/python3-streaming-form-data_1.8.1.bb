DESCRIPTION = "Streaming multipart/form-data parser"
HOMEPAGE = "https://github.com/siddhantgoel/streaming-form-data"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=28a8c10291bba0bc0f8b9d5e87c0d826"

PYPI_PACKAGE = "streaming-form-data"
SRC_URI[sha256sum] = "27ddc67333716a0b3a10f622e76a8ce5b9b7da124592c33e58405e55e2a7c357"

inherit pypi setuptools3
BBCLASSEXTEND = "native nativesdk"
