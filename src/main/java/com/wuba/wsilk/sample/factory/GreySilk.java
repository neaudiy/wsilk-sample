package com.wuba.wsilk.sample.factory;

public class GreySilk implements Silk {

	private String name;

	public GreySilk(String name) {
		this.name = name;
	}

	@Override
	public String getColor() {
		return name;
	}

}
