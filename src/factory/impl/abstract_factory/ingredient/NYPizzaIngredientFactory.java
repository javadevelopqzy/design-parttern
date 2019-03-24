package factory.impl.abstract_factory.ingredient;

import factory.impl.abstract_factory.material.*;

/**
 * 纽约披萨原料工厂：薄面皮、奶酪、李子番茄酱
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}
}
