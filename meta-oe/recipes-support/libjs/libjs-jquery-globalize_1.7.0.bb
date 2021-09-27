DESCRIPTION = "A JavaScript library for internationalization and localization that leverages the official Unicode CLDR JSON data"
SECTION = "console/network"
HOMEPAGE = "https://github.com/globalizejs/globalize"
LICENSE = "MIT"

S = "${WORKDIR}/globalize-${PV}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=4db68fb4d1d9986d736b35039f2ad9ea"

SRC_URI = "https://github.com/globalizejs/globalize/archive/refs/tags/${PV}.tar.gz"

SRC_URI[sha256sum] = "51928dd6dbaceaab8cd89e7b430aa366b3029a8b70e74d4ca4be2d89cc929bab"

FILES:${PN} = "${datadir}/javascript/jquery-globalize"
FILES:${PN}-doc += "${docdir}/${PN}"

do_install() {
        install -d ${D}${datadir}/javascript/jquery-globalize/
        install -m 0644 ${S}/dist/*.js ${D}${datadir}/javascript/jquery-globalize/
        install -m 0644 ${S}/dist/globalize/*.js ${D}${datadir}/javascript/jquery-globalize/

        install -d ${D}${docdir}/${PN}/
        install -m 0644 ${S}/LICENSE ${D}${docdir}/${PN}/
}
