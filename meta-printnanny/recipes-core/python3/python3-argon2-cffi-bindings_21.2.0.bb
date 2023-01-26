
SUMMARY = "Low-level CFFI bindings for Argon2"
HOMEPAGE = "https://github.com/hynek/argon2-cffi-bindings"
AUTHOR = "Hynek Schlawack <hs@ox.cx>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4642dfcbd13c1cc49e9f99df9de51ba1"

SRC_URI = "https://files.pythonhosted.org/packages/b9/e9/184b8ccce6683b0aa2fbb7ba5683ea4b9c5763f1356347f1312c32e3c66e/argon2-cffi-bindings-21.2.0.tar.gz"
SRC_URI[md5sum] = "f1591e1af7dea9ef3e5b982e2c196c1d"
SRC_URI[sha256sum] = "bb89ceffa6c791807d1305ceb77dbfacc5aa499891d2c55661c6459651fc39e3"

S = "${WORKDIR}/argon2-cffi-bindings-21.2.0"

DEPENDS += "python3-setuptools-scm-native python3-cffi-native"

RDEPENDS:${PN} = ""

inherit python_poetry_core

# disable SSE2 optimization
# https://github.com/hynek/argon2-cffi-bindings/tree/eac4e7b8370d41af0d4714cfae608a112649f2a5#overriding-automatic-sse2-detection
do_compile:prepend(){
    export ARGON2_CFFI_USE_SSE2=0
}
BBCLASSEXTEND = "native nativesdk"
