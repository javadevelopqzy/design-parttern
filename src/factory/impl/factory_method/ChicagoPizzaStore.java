package factory.impl.factory_method;

import factory.impl.abstract_factory.ingredient.ChicagoPizzaIngredientFactory;
import factory.impl.abstract_factory.ingredient.PizzaIngredientFactory;
import factory.impl.product.*;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		PizzaIngredientFactory factory = new ChicagoPizzaIngredientFactory();
		return new ChicagoCheesePizza(factory);
	}
}
