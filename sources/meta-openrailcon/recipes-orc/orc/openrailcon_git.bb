LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=4fe869ee987a340198fb0d54c55c47f1"

DEPENDS = "qtdeclarative qtdeclarative-native"

SRC_URI = "git://github.com/cgudrian/PainterTest.git;protocol=https;branch=master"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit qt6-cmake

RDEPENDS:${PN} = "qtvirtualkeyboard"
