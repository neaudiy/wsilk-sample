package com.wuba.wsilk.sample.spi;

import com.wuba.wsilk.producer.spi.SPI;

@SPI(Service.class)
final class WsilkService implements Service {

	@Override
	public void say(String name) {
		System.out.println(name);
	}

}
 