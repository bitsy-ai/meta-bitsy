
SUMMARY = "Classes Without Boilerplate"
HOMEPAGE = "https://www.attrs.org/"
AUTHOR = "Hynek Schlawack <hs@ox.cx>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5e55731824cf9205cfabeab9a0600887"

SRC_URI = "https://files.pythonhosted.org/packages/1a/cb/c4ffeb41e7137b23755a45e1bfec9cbb76ecf51874c6f1d113984ecaa32c/attrs-22.1.0.tar.gz"
SRC_URI[md5sum] = "0487081b7ead8753fc46cf7c6d1e28e3"
SRC_URI[sha256sum] = "29adc2665447e5191d0e7c568fde78b21f9672d344281d0c6e1ab085429b22b6"

S = "${WORKDIR}/attrs-22.1.0"

RDEPENDS:${PN} = ""

inherit setuptools3
