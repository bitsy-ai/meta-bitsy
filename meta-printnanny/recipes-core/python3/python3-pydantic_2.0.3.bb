
SUMMARY = "Data validation using Python type hints"
HOMEPAGE = ""
AUTHOR = " <Samuel Colvin <s@muelcolvin.com>, Eric Jolibois <em.jolibois@gmail.com>, Hasan Ramezani <hasan.r67@gmail.com>, Adrian Garcia Badaracco <1755071+adriangb@users.noreply.github.com>, Terrence Dorsey <terry@pydantic.dev>, David Montague <david@pydantic.dev>>"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=09280955509d1c4ca14bae02f21d49a6"

SRC_URI = "https://files.pythonhosted.org/packages/11/07/106b00ae62297bb3c89b6fbeb571feaf7cbbf6b2ada0e513d756daafd4ce/pydantic-2.0.3.tar.gz"
SRC_URI[md5sum] = "ffb24ed4a37a6cd489ae8dc4ac27431c"
SRC_URI[sha256sum] = "94f13e0dcf139a5125e88283fc999788d894e14ed90cf478bcc2ee50bd4fc630"

S = "${WORKDIR}/pydantic-2.0.3"

DEPENDS += "python3-hatch-fancy-pypi-readme-native"
RDEPENDS:${PN} = "python3-annotated-types python3-pydantic-core python3-typing-extensions"

inherit python_hatchling