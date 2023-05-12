package com.wuba.wsilk.sample.factory;

public class YellowSilk implements Silk {

	private String name;

	public YellowSilk(String name) {
		this.name = name;
	}

	@Override
	public String getColor() {
		return name;
	}

}
