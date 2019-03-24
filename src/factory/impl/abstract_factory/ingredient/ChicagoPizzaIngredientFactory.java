package factory.impl.abstract_factory.ingredient;

import factory.impl.abstract_factory.material.*;

/**
 * 芝加哥披萨工厂：使用厚面皮、莫扎里奶酪、意大利西红柿酱料
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
}
