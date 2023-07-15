SUMMARY = "Build and publish crates with pyo3, rust-cpython and cffi bindings as well as rust binaries as python packages"
HOMEPAGE = "https://github.com/pyo3/maturin"
AUTHOR = "Konstin konstin@mailbox.org"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license-mit;md5=85fd3b67069cff784d98ebfc7d5c0797"

SRC_URI[sha256sum] = "4650aeaa8debd004b55aae7afb75248cbd4d61cd7da2dcf4ead8b22b58cecae0"

require ${BPN}-crates.inc
inherit pypi python_setuptools3_rust cargo-update-recipe-crates

PYPI_PACKAGE = "maturin"
BBCLASSEXTEND = "native nativesdk"
