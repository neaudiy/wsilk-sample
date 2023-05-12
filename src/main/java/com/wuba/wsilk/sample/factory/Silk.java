package com.wuba.wsilk.sample.factory;

import com.wuba.wsilk.producer.factory.Factory;

import com.wuba.wsilk.producer.factory.Factory.OptionType;

@Factory(value = OptionType.STRING, constructorOptionValue = true, options = {

		@Factory.Option(bean = GreySilk.class, optionValue = "g"),

		@Factory.Option(bean = WhiteSilk.class, optionValue = "w"),

		@Factory.Option(bean = YellowSilk.class, optionValue = "y") })

public interface Silk {

	public String getColor();

}
