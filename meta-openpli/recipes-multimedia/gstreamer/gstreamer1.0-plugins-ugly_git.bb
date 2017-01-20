DEFAULT_PREFERENCE = "1"

include gstreamer1.0-plugins-ugly.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=a6f89e2100d9b6cdffcea4f398e37343 \
					file://tests/check/elements/xingmux.c;beginline=1;endline=21;md5=4c771b8af188724855cb99cadd390068 \
					"

SRCREV = "aa17c7885d328907e8133ce622e10789b21e561e"
SRCREV_common = "93ae13f2c3c58a4c2b7c111817b720a272d504d7"
SRCREV_FORMAT = "base"

SRC_URI = " git://anongit.freedesktop.org/gstreamer/gst-plugins-ugly;branch=master;name=base \
			git://anongit.freedesktop.org/gstreamer/common;destsuffix=git/common;name=common \
			file://0001-introspection.m4-prefix-pkgconfig-paths-with-PKG_CON.patch \
			"
 
S = "${WORKDIR}/git"

inherit gitpkgv

GST_VERSION_FULL ="1.11.1.1"
PV = "${GST_VERSION_FULL}+git${SRCPV}"
PKGV = "${GST_VERSION_FULL}+git${GITPKGV}"

do_configure_prepend() {
	cd ${S}
	./autogen.sh --noconfigure
	cd ${B}
}
