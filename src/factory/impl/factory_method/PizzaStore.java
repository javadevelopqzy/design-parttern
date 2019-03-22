package factory.impl.factory_method;

import factory.impl.product.*;

public abstract class PizzaStore {

	/**
	 * 制作披萨的过程不允许子类实现
	 */
	public final void orderPizza(String type) {
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
	}

	protected abstract Pizza createPizza(String type);
}
