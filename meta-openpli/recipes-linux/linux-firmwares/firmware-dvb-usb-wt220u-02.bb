require linux-firmware.inc

DESCRIPTION = "Firmware for dvb-usb-wt220u-02"

do_install() {
	install -d ${D}${base_libdir}/firmware
	install -m 0644 dvb-usb-wt220u-02.fw ${D}${base_libdir}/firmware
}
