package com.wuba.wsilk.sample.factory;

public class WhiteSilk implements Silk {

	private String name;

	public WhiteSilk(String name) {
		this.name = name;
	}

	@Override
	public String getColor() {
		return name;
	}

}
