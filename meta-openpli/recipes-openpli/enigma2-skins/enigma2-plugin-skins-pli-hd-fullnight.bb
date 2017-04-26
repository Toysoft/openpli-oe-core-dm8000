DESCRIPTION = "PLi HD FullNight skin"
MAINTAINER = "littlesat"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://usr/share/enigma2/PLi-HD-FullNight/skin.xml;beginline=3;endline=8;md5=b116f43110ecf49187a08e984a564a70"

inherit gitpkgv allarch

PV = "0.1+git${SRCPV}"
PKGV = "0.1+git${GITPKGV}"

SRC_URI = "git://github.com/littlesat/PLi-HD-FullNight.git"

SRC_URI += "file://01-split-eventname-and-full-description.patch \
			"

FILES_${PN} = "/usr/share/enigma2/"

S = "${WORKDIR}/git"

do_compile() {
}

do_install() {
	install -d ${D}/usr/share
	cp -r --preserve=mode,links ${S}/usr/share/* ${D}/usr/share/
	chmod -R a+rX ${D}/usr/share/enigma2/
}
