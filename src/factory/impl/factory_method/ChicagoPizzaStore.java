package factory.impl.factory_method;

import factory.impl.product.*;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		return new ChicagoCheesePizza();
	}
}
