
SUMMARY = "Data validation using Python type hints"
HOMEPAGE = ""
AUTHOR = " <Samuel Colvin <s@muelcolvin.com>, Eric Jolibois <em.jolibois@gmail.com>, Hasan Ramezani <hasan.r67@gmail.com>, Adrian Garcia Badaracco <1755071+adriangb@users.noreply.github.com>, Terrence Dorsey <terry@pydantic.dev>, David Montague <david@pydantic.dev>>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ab599c188b4a314d2856b3a55030c75c"

SRC_URI = "https://files.pythonhosted.org/packages/57/ea/edff47ad42857534f3abcc87472802b3181041f4e4fbeac988a5ecfcffae/pydantic_core-2.3.0.tar.gz"
SRC_URI[md5sum] = "11e29ef9a5b24bed2a9e1cb806307d2c"
SRC_URI[sha256sum] = "5cfb5ac4e82c47d5dc25b209dd4c3989e284b80109f9e08b33c895080c424b4f"

S = "${WORKDIR}/pydantic_core-2.3.0"

DEPENDS += "python3-hatch-fancy-pypi-readme-native python3-maturin-native"
RDEPENDS:${PN} = ""

inherit python_hatchling
