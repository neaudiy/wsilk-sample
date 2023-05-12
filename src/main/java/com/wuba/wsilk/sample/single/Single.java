package com.wuba.wsilk.sample.single;

import com.wuba.wsilk.producer.singleton.Singleton;
import com.wuba.wsilk.producer.singleton.Singleton.Type;

/**
 * 
 * 对象必须是抽象的
 * 
 */
@Singleton(value = Type.EAGER)
@Singleton(value = Type.LAZY)
abstract class Single {

	public String name; 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
