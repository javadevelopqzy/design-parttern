package decorate.impl;

import decorate.impl.decorate.*;

/**
 * 一个饮料的抽象类，子类需要自行实现cost方法，计算价格 <br>
 * 如：豆浆 {@link Soy}
 *
 */
public abstract class Beverage {

	protected String description;

	public abstract double cost();

	public String getDescription() {
		return description;
	}
}
